package com.example.PaginaRopa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model; 
import org.springframework.web.bind.annotation.GetMapping;
import com.example.PaginaRopa.entidad.Producto;
import com.example.PaginaRopa.repositorio.ProductoRepositorio;

import jakarta.servlet.http.HttpSession;

@Controller
public class ControllerInicio {

	
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @GetMapping("/")
    public String iniciar() {
        return "index";
    }

    @GetMapping("/mujer")
    public String mostrarMujer(Model model) {
        List<Producto> productos = productoRepositorio.findByCategoria_Nombre("mujer");
        model.addAttribute("productos", productos);
        return "mujer";
    }

    @GetMapping("/hombre")
    public String mostrarHombre(Model model) {
        List<Producto> productos = productoRepositorio.findByCategoria_Nombre("hombre");
        model.addAttribute("productos", productos);
        return "hombre";
    }
    

    @GetMapping("/infantil")
    public String mostrarInfantil(Model model, HttpSession session) {
        List<Producto> productos = productoRepositorio.findByCategoria_Nombre("infantil");
        model.addAttribute("productos", productos);
        return "infantil";
    }


    
    @GetMapping("/contacto")
    public String contacto() {
        return "contacto";
    }
}
