package com.example.PaginaRopa.controlador;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.PaginaRopa.entidad.Categoria;
import com.example.PaginaRopa.entidad.Producto;
import com.example.PaginaRopa.repositorio.CategoriaRepositorio;
import com.example.PaginaRopa.repositorio.ProductoRepositorio;

@Controller
public class ProductoControlador {

    @Autowired
    private ProductoRepositorio productoRepositorio;
    
    @Autowired
    private CategoriaRepositorio categoriaRepositorio;

    @GetMapping("/ordenarHombre")
    public String ordenarHombre(@RequestParam(name = "orden", required = false) String orden, Model model) {
        List<Producto> productos = obtenerProductosOrdenados("hombre", orden);
        model.addAttribute("productos", productos);
        model.addAttribute("orden", orden);
        return "hombre";
    }

    @GetMapping("/ordenarMujer")
    public String ordenarMujer(@RequestParam(name = "orden", required = false) String orden, Model model) {
        List<Producto> productos = obtenerProductosOrdenados("mujer", orden);
        model.addAttribute("productos", productos);
        model.addAttribute("orden", orden);
        return "mujer";
    }

    @GetMapping("/ordenarInfantil")
    public String ordenarInfantil(@RequestParam(name = "orden", required = false) String orden, Model model) {
        List<Producto> productos = obtenerProductosOrdenados("infantil", orden);
        model.addAttribute("productos", productos);
        model.addAttribute("orden", orden);
        return "infantil";
    }

    private List<Producto> obtenerProductosOrdenados(String categoria, String orden) {
        if (orden == null) {
            return productoRepositorio.findByCategoria_Nombre(categoria);
        }
        switch (orden) {
            case "precioAsc":
                return productoRepositorio.findByCategoria_NombreOrderByPrecioAsc(categoria);
            case "precioDesc":
                return productoRepositorio.findByCategoria_NombreOrderByPrecioDesc(categoria);
            case "masVendidos":
                return productoRepositorio.findByCategoria_NombreOrderByVendidosDesc(categoria);
            default:
                return productoRepositorio.findByCategoria_Nombre(categoria);
        }
    }

    @PostMapping("/admin/productos/eliminar")
    public String eliminarProducto(@RequestParam("id") Long id, @RequestParam("pagina") String pagina) {
        productoRepositorio.deleteById(id);

        switch (pagina) {
            case "mujer":
                return "redirect:/mujer";
            case "hombre":
                return "redirect:/hombre";
            case "infantil":
                return "redirect:/infantil";
            case "inicio":
                return "redirect:/";
            case "resultados":
                return "redirect:/resultados"; 
            default:
                return "redirect:/"; 
        }
    }


    @PostMapping("/admin/productos/agregar")
    public String agregarProducto(
        @RequestParam("nombreClave") String nombreClave,
        @RequestParam("imagen") String imagen,
        @RequestParam("precio") double precio,
        @RequestParam("categoriaId") Long categoriaId,
        @RequestParam("nombreEs") String nombreEs,
        @RequestParam("nombreEn") String nombreEn,
        @RequestParam("nombreFr") String nombreFr,
        @RequestParam("pagina") String pagina
    ) {
        Categoria categoria = categoriaRepositorio.findById(categoriaId).orElse(null);
        if (categoria == null) {
            return "redirect:/error";
        }

        Producto nuevo = new Producto();
        nuevo.setNombreClave(nombreClave);
        nuevo.setImagen(imagen);
        nuevo.setPrecio(precio);
        nuevo.setCategoria(categoria);
        nuevo.setNombreEs(nombreEs);
        nuevo.setNombreEn(nombreEn);
        nuevo.setNombreFr(nombreFr);

        productoRepositorio.save(nuevo);
        return redireccionarSegunPagina(pagina);
    }


    private String redireccionarSegunPagina(String pagina) {
        switch (pagina.toLowerCase()) {
            case "hombre":
                return "redirect:/ordenarHombre";
            case "mujer":
                return "redirect:/ordenarMujer";
            case "infantil":
                return "redirect:/ordenarInfantil";
            default:
                return "redirect:/";
        }
    }
}
