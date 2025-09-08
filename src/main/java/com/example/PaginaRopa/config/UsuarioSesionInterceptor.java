package com.example.PaginaRopa.config;

import com.example.PaginaRopa.entidad.Usuario;
import com.example.PaginaRopa.repositorio.UsuarioRepositorio;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import java.util.Optional;

@Component
public class UsuarioSesionInterceptor implements HandlerInterceptor {

    private final UsuarioRepositorio usuarioRepositorio;

    public UsuarioSesionInterceptor(UsuarioRepositorio usuarioRepositorio) {
        this.usuarioRepositorio = usuarioRepositorio;
    }

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Ejecutando UsuarioSesionInterceptor para URI: " + request.getRequestURI());

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        if (authentication != null && authentication.isAuthenticated() && !(authentication instanceof AnonymousAuthenticationToken)) {
            String correo = authentication.getName(); // correo del usuario logueado

            Optional<Usuario> optionalUsuario = usuarioRepositorio.findByCorreo(correo);
            if (optionalUsuario.isPresent()) {
                Usuario usuario = optionalUsuario.get();
                request.getSession().setAttribute("usuario", usuario);
                System.out.println("Usuario autenticado: " + usuario.getNombre());
            } else {
                System.out.println("No se encontró el usuario con correo: " + correo);
            }
        } else {
            System.out.println("Usuario no autenticado o anonymous");
        }

        return true;
    }




}
