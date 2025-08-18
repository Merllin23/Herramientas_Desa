package com.example.PaginaRopa.repositorio;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.PaginaRopa.entidad.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long> {
    List<Producto> findByCategoria_Nombre(String nombre);
    List<Producto> findByCategoria_NombreOrderByPrecioAsc(String nombre);
    List<Producto> findByCategoria_NombreOrderByPrecioDesc(String nombre);
    List<Producto> findByCategoria_NombreOrderByVendidosDesc(String nombre);
    
    List<Producto> findByNombreClaveContainingIgnoreCase(String nombreClave);
    List<Producto> findTop5ByNombreClaveContainingIgnoreCase(String nombreClave);
    
    List<Producto> findByNombreEsContainingIgnoreCase(String q);
    List<Producto> findByNombreEnContainingIgnoreCase(String q);
    List<Producto> findByNombreFrContainingIgnoreCase(String q);
}
