package com.example.PaginaRopa.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AuthControlador {

    @GetMapping("/login")
    public String login() {
        // Retorna la página principal (index.html) donde tienes el modal de login
        return "index";
    }
}
