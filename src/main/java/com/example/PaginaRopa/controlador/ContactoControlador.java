package com.example.PaginaRopa.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.example.PaginaRopa.entidad.Contacto;
import com.example.PaginaRopa.repositorio.ContactoRepositorio;

@Controller
public class ContactoControlador {

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    @PostMapping("/contacto")
    public String procesarContacto(
            @RequestParam("nombre") String nombre,
            @RequestParam("correo") String correo,
            @RequestParam(value = "telefono", required = false) String telefono,
            @RequestParam(value = "asunto", required = false) String asunto,
            @RequestParam("mensaje") String mensaje,
            @RequestParam("aceptaPolitica") boolean aceptaPolitica
    ) {
        Contacto contacto = new Contacto();
        contacto.setNombre(nombre);
        contacto.setCorreo(correo);
        contacto.setTelefono(telefono);
        contacto.setAsunto(asunto);
        contacto.setMensaje(mensaje);
        contacto.setAceptaPolitica(aceptaPolitica);

        contactoRepositorio.save(contacto);

        return "redirect:/contacto?enviado=true";
    }

}

