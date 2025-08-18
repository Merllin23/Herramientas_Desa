package com.example.PaginaRopa.controlador;

import com.example.PaginaRopa.entidad.Producto;
import com.example.PaginaRopa.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

@Controller
public class Actualizarnombre {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/actualizarNombres")
    @ResponseBody
    public String actualizarNombresTraducidosManualmente() {
        List<Producto> productos = productoRepositorio.findAll();

        for (Producto p : productos) {
            String clave = p.getNombreClave();

            try {
                String nombreEs = messageSource.getMessage(clave, null, new Locale("es"));
                String nombreEn = messageSource.getMessage(clave, null, new Locale("en"));
                String nombreFr = messageSource.getMessage(clave, null, new Locale("fr"));

                p.setNombreEs(nombreEs);
                p.setNombreEn(nombreEn);
                p.setNombreFr(nombreFr);
            } catch (Exception e) {
                System.out.println("❌ Clave no encontrada: " + clave);
            }
        }

        productoRepositorio.saveAll(productos);
        return "✅ Traducciones actualizadas";
    }
}
