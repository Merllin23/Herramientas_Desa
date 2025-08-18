package com.example.PaginaRopa.entidad;

import java.math.BigDecimal;

public class ItemCarrito {
    private Long idProducto;
    private String nombre;
    private String imagen;
    private BigDecimal precio;
    private int cantidad;

    public ItemCarrito(Long idProducto, String nombre, String imagen, BigDecimal precio, int cantidad) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.imagen = imagen;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // ✅ Nuevo método para Thymeleaf
    public BigDecimal getSubtotal() {
        if (precio != null) {
            return precio.multiply(BigDecimal.valueOf(cantidad));
        }
        return BigDecimal.ZERO;
    }
}
