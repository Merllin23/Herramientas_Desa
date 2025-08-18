package com.example.PaginaRopa.entidad;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Cotizacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private LocalDateTime fecha;

    @Column(length = 1000)
    private String mensaje;

    private String nombre;

    private String producto;

    @Transient
    private boolean aceptoTerminos; 

    @PrePersist
    protected void onCreate() {
        this.fecha = LocalDateTime.now();
    }

    // Getters y Setters (ordenados)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public boolean isAceptoTerminos() {
        return aceptoTerminos;
    }

    public void setAceptoTerminos(boolean aceptoTerminos) {
        this.aceptoTerminos = aceptoTerminos;
    }
}
