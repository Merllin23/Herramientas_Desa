package com.example.PaginaRopa.controlador;

import com.example.PaginaRopa.entidad.Producto;
import com.example.PaginaRopa.entidad.ItemCarrito;
import com.example.PaginaRopa.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;
import org.springframework.ui.Model;

import java.math.BigDecimal;
import java.util.*;

@Controller
@RequestMapping("/carrito")
public class CarritoControlador {

    @Autowired
    private ProductoRepositorio productoRepositorio;

    @PostMapping("/agregar")
    @ResponseBody
    public String agregarAlCarrito(@RequestParam("id") Long id, HttpSession session) {
        Map<Long, ItemCarrito> carrito = (Map<Long, ItemCarrito>) session.getAttribute("carrito");
        if (carrito == null) carrito = new HashMap<>();

        Producto producto = productoRepositorio.findById(id).orElse(null);
        if (producto != null) {
            ItemCarrito item = carrito.get(id);
            if (item == null) {
            	item = new ItemCarrito(
            		    id,
            		    producto.getNombreClave(),
            		    producto.getImagen(),
            		    BigDecimal.valueOf(producto.getPrecio()),
            		    1
            		);
            } else {
                item.setCantidad(item.getCantidad() + 1);
            }
            carrito.put(id, item);
        }

        session.setAttribute("carrito", carrito);
        return String.valueOf(carrito.size());
    }

    @GetMapping
    public String verCarrito(HttpSession session, Model model) {
        Map<Long, ItemCarrito> carrito = (Map<Long, ItemCarrito>) session.getAttribute("carrito");
        if (carrito == null) carrito = new HashMap<>();
        model.addAttribute("items", carrito.values());
        return "carrito";
    }

    @GetMapping("/contador")
    @ResponseBody
    public int obtenerContador(HttpSession session) {
        Map<Long, ItemCarrito> carrito = (Map<Long, ItemCarrito>) session.getAttribute("carrito");
        if (carrito == null) return 0;

        return carrito.values().stream()
                .mapToInt(ItemCarrito::getCantidad)
                .sum();
    }
    
    @PostMapping("/eliminar")
    public String eliminarUnaUnidad(@RequestParam("idProducto") Long idProducto, HttpSession session) {
        Map<Long, ItemCarrito> carrito = (Map<Long, ItemCarrito>) session.getAttribute("carrito");

        if (carrito != null && carrito.containsKey(idProducto)) {
            ItemCarrito item = carrito.get(idProducto);
            if (item.getCantidad() > 1) {
                item.setCantidad(item.getCantidad() - 1);
            } else {
                carrito.remove(idProducto);
            }
            session.setAttribute("carrito", carrito);
        }

        return "redirect:/carrito";
    }


    @PostMapping("/vaciar")
    public String vaciarCarrito(HttpSession session) {
        session.removeAttribute("carrito");
        return "redirect:/carrito";
    }
    
    @PostMapping("/pagar")
    public String procesarPago(@RequestParam("metodoPago") String metodo,
                               @RequestParam Map<String, String> datos,
                               RedirectAttributes attr,
                               HttpSession session) {
        if ("yape".equalsIgnoreCase(metodo) || "tarjeta".equalsIgnoreCase(metodo)) {
            session.removeAttribute("carrito");

            attr.addFlashAttribute("mensajePago", "¡Compra exitosa! Gracias por tu compra.");
        } else {
            attr.addFlashAttribute("errorPago", "Método de pago no válido.");
        }
        return "redirect:/carrito";
    }




}
