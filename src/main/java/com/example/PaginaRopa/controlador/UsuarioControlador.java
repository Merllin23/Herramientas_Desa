package com.example.PaginaRopa.controlador;

import com.example.PaginaRopa.entidad.Usuario;
import com.example.PaginaRopa.repositorio.UsuarioRepositorio;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
public class UsuarioControlador {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/registro")
    public String registrarUsuario(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("correo") String correo,
            @RequestParam("contrasena") String contrasena,
            @RequestParam("confirmar") String confirmar,
            @RequestParam(value = "redirect", required = false) String redirect,
            HttpSession session
    ) {
        String redir = (redirect != null) ? redirect : "/";

        correo = correo.trim().toLowerCase();

        if (!contrasena.equals(confirmar)) {
            return "redirect:" + redir + "?error=registroCoincidencia";
        }

        if (usuarioRepositorio.findByCorreo(correo).isPresent()) {
            return "redirect:" + redir + "?error=registroCorreo";
        }

        Usuario nuevo = new Usuario();
        nuevo.setNombre(nombre.trim());
        nuevo.setApellido(apellido.trim());
        nuevo.setCorreo(correo);
        nuevo.setContrasena(passwordEncoder.encode(contrasena)); // 🔐 Encriptar

        usuarioRepositorio.save(nuevo);
        session.setAttribute("usuario", nuevo);

        return "redirect:" + redir;
    }

    @PostMapping("/logout")
    public String cerrarSesion(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }

    @PostMapping("/usuario/eliminar")
    public String eliminarCuenta(
            @RequestParam("contrasena") String contrasena,
            @RequestParam("confirmarContrasena") String confirmarContrasena,
            @RequestParam(value = "redirect", required = false) String redirect,
            HttpSession session,
            RedirectAttributes redirectAttributes) {

        String redir = (redirect != null && !redirect.isEmpty()) ? redirect : "/";
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) return "redirect:/";

        if (!contrasena.equals(confirmarContrasena)) {
            redirectAttributes.addFlashAttribute("error", "Las contraseñas no coinciden.");
            return "redirect:" + redir + "?error=eliminar";
        }

        Optional<Usuario> usuarioDB = usuarioRepositorio.findByCorreo(usuario.getCorreo());
        if (usuarioDB.isEmpty() || !passwordEncoder.matches(contrasena, usuarioDB.get().getContrasena())) {
            redirectAttributes.addFlashAttribute("error", "Contraseña incorrecta.");
            return "redirect:" + redir + "?error=eliminar";
        }

        usuarioRepositorio.delete(usuarioDB.get());
        session.invalidate();
        redirectAttributes.addFlashAttribute("mensaje", "Tu cuenta ha sido eliminada correctamente.");
        return "redirect:/?exito=cuenta";
    }

    @PostMapping("/recuperar-contrasena")
    public String cambiarContrasena(
            @RequestParam("correo") String correo,
            @RequestParam("contrasenaActual") String contrasenaActual,
            @RequestParam("nuevaContrasena") String nuevaContrasena,
            @RequestParam("confirmarContrasena") String confirmarContrasena,
            @RequestParam(value = "redirect", required = false) String redirect
    ) {
        String redir = (redirect != null && !redirect.isEmpty()) ? redirect : "/";
        Optional<Usuario> optionalUsuario = usuarioRepositorio.findByCorreo(correo);
        if (optionalUsuario.isEmpty()) {
            return "redirect:" + redir + "?error=recuperarCorreo";
        }

        Usuario usuario = optionalUsuario.get();

        if (!passwordEncoder.matches(contrasenaActual, usuario.getContrasena())) {
            return "redirect:" + redir + "?error=recuperarContrasena";
        }

        if (!nuevaContrasena.equals(confirmarContrasena)) {
            return "redirect:" + redir + "?error=recuperarCoincidencia";
        }

        usuario.setContrasena(passwordEncoder.encode(nuevaContrasena));
        usuarioRepositorio.save(usuario);

        return "redirect:" + redir + "?success=recuperar";
    }
}
