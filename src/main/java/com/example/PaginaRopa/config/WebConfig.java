package com.example.PaginaRopa.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Autowired
    private UsuarioSesionInterceptor usuarioSesionInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println("Registrando UsuarioSesionInterceptor");
        registry.addInterceptor(usuarioSesionInterceptor);
    }

}
