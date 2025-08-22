package com.example.PaginaRopa.controlador;

import com.example.PaginaRopa.entidad.Cotizacion;
import com.example.PaginaRopa.repositorio.CotizacionRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CotizacionControlador {

    @Autowired
    private CotizacionRepositorio cotizacionRepositorio;

    @PostMapping("/cotizacion")
    public String guardarCotizacion(@RequestParam("nombre") String nombre,
                                    @RequestParam("email") String email,
                                    @RequestParam("producto") String producto,
                                    @RequestParam(name = "mensaje", required = false) String mensaje,
                                    @RequestParam(name = "aceptoTerminos", required = false, defaultValue = "false") boolean aceptoTerminos,
                                    Model model) {

        if (!aceptoTerminos) {
            model.addAttribute("errorCotizacion", true);
            model.addAttribute("abrirModalCotizacion", true);
            return "index";
        }

        Cotizacion cotizacion = new Cotizacion();
        cotizacion.setNombre(nombre);
        cotizacion.setEmail(email);
        cotizacion.setProducto(producto);
        cotizacion.setMensaje(mensaje);
        cotizacion.setAceptoTerminos(true); 

        cotizacionRepositorio.save(cotizacion);

        return "redirect:/";
    }
}
