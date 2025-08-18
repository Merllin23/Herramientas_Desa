package com.example.PaginaRopa.controlador;

import com.example.PaginaRopa.entidad.Resena;
import com.example.PaginaRopa.entidad.Usuario;
import com.example.PaginaRopa.entidad.Producto;
import com.example.PaginaRopa.repositorio.ProductoRepositorio;
import com.example.PaginaRopa.repositorio.ResenaRepositorio;
import jakarta.servlet.http.HttpSession;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResenaControlador {

    @Autowired
    private ResenaRepositorio resenaRepositorio;

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @PostMapping("/resena")
    public String publicarResena(
            @RequestParam("productoId") Long productoId,
            @RequestParam("estrellas") int estrellas,
            @RequestParam("comentario") String comentario,
            @RequestParam(value = "redirect", required = false) String redirect,
            HttpSession session
    ) {
        Usuario usuario = (Usuario) session.getAttribute("usuario");
        if (usuario == null) {
            if (redirect == null || redirect.isBlank()) {
                redirect = "/";
            }

            if (!redirect.startsWith("/")) {
                redirect = "/" + redirect;
            }

            if (redirect.contains("?")) {
                redirect += "&error=login";
            } else {
                redirect += "?error=login";
            }

            return "redirect:" + redirect;
        }

        Producto producto = productoRepositorio.findById(productoId).orElse(null);
        if (producto == null) {
            return "redirect:/?error=productoNoExiste";
        }

        Resena resena = new Resena();
        resena.setProducto(producto);
        resena.setUsuario(usuario);
        resena.setEstrellas(estrellas);
        resena.setComentario(comentario.trim());
        resena.setFecha(LocalDateTime.now());

        resenaRepositorio.save(resena);

        if (redirect == null || redirect.isBlank()) {
            redirect = "/";
        } else if (!redirect.startsWith("/")) {
            redirect = "/" + redirect;
        }

        return "redirect:" + redirect;
    }


}
