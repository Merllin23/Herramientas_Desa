package com.example.PaginaRopa;

import com.example.PaginaRopa.entidad.Producto;
import com.example.PaginaRopa.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import java.util.List;
import java.util.Locale;

@Component
public class InicializadorProductos {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Autowired
    private MessageSource messageSource;

    @PostConstruct
    public void actualizarNombresTraducidos() {
        List<Producto> productos = productoRepositorio.findAll();

        for (Producto p : productos) {
            String clave = p.getNombreClave();

            
            String nombreEs = messageSource.getMessage(clave, null, new Locale("es"));
            String nombreEn = messageSource.getMessage(clave, null, new Locale("en"));
            String nombreFr = messageSource.getMessage(clave, null, new Locale("fr"));

            p.setNombreEs(nombreEs);
            p.setNombreEn(nombreEn);
            p.setNombreFr(nombreFr);
        }

        productoRepositorio.saveAll(productos);
        
    }
}
