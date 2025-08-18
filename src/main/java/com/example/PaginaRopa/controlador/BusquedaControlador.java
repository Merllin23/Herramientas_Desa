package com.example.PaginaRopa.controlador;

import com.example.PaginaRopa.entidad.Producto;
import com.example.PaginaRopa.repositorio.ProductoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@Controller
public class BusquedaControlador {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Autowired
    private MessageSource messageSource;

    @GetMapping("/buscar")
    public String buscarProductos(@RequestParam(name = "q", required = false) String q, Model model) {
        Locale locale = LocaleContextHolder.getLocale();
        List<Producto> resultados = new ArrayList<>();

        if (q != null && !q.trim().isEmpty()) {
            // Solo buscar si hay texto en q
            switch (locale.getLanguage()) {
                case "en":
                    resultados = productoRepositorio.findByNombreEnContainingIgnoreCase(q);
                    break;
                case "fr":
                    resultados = productoRepositorio.findByNombreFrContainingIgnoreCase(q);
                    break;
                default:
                    resultados = productoRepositorio.findByNombreEsContainingIgnoreCase(q);
                    break;
            }
            model.addAttribute("consulta", q); // Para mostrar que se puso
        }

        model.addAttribute("productos", resultados);
        return "busqueda"; // para poner siempre la misma pagina
    }



    @GetMapping("/api/sugerencias")
    @ResponseBody
    public List<Map<String, Object>> sugerencias(@RequestParam("q") String q) {
        Locale locale = LocaleContextHolder.getLocale();
        List<Producto> productos;

        // Buscar según el idioma actual
        switch (locale.getLanguage()) {
            case "en":
                productos = productoRepositorio.findByNombreEnContainingIgnoreCase(q);
                break;
            case "fr":
                productos = productoRepositorio.findByNombreFrContainingIgnoreCase(q);
                break;
            default:
                productos = productoRepositorio.findByNombreEsContainingIgnoreCase(q);
                break;
        }

        // Limita a 5 resultadoss
        productos = productos.stream().limit(5).toList();

        List<Map<String, Object>> resultado = new ArrayList<>();

        for (Producto p : productos) {
            Map<String, Object> datos = new HashMap<>();
            datos.put("id", p.getId());

            // aca noma para usar el nombre traducido
            String nombre;
            switch (locale.getLanguage()) {
                case "en": nombre = p.getNombreEn(); break;
                case "fr": nombre = p.getNombreFr(); break;
                default: nombre = p.getNombreEs(); break;
            }

            datos.put("nombre", nombre);
            datos.put("categoria", p.getCategoria().getNombre());

            resultado.add(datos);
        }

        return resultado;
    }


    @GetMapping("/producto/{id}")
    public String verProductoDesdeBusqueda(@PathVariable("id") Long id, Model model) {
        Optional<Producto> productoOpt = productoRepositorio.findById(id);
        if (productoOpt.isPresent()) {
            Producto producto = productoOpt.get();
            model.addAttribute("productos", List.of(producto));
            String categoria = producto.getCategoria().getNombre().toLowerCase();
            return categoria; // mujer.html, hombre.html, infantil.html
        }
        return "redirect:/";
    }
}
