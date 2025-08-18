package com.example.PaginaRopa.entidad;

import jakarta.persistence.*;

@Entity
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombreClave;

    @Column(name = "nombre_es")
    private String nombreEs;

    @Column(name = "nombre_en")
    private String nombreEn;

    @Column(name = "nombre_fr")
    private String nombreFr;

    private String imagen;
    private double precio;
    private int vendidos;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    public Producto() {}

    public Producto(String nombreClave, String nombreEs, String nombreEn, String nombreFr, String imagen, double precio, int vendidos) {
        this.nombreClave = nombreClave;
        this.nombreEs = nombreEs;
        this.nombreEn = nombreEn;
        this.nombreFr = nombreFr;
        this.imagen = imagen;
        this.precio = precio;
        this.vendidos = vendidos;
    }

    // Getters y setters

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNombreClave() { return nombreClave; }
    public void setNombreClave(String nombreClave) { this.nombreClave = nombreClave; }

    public String getNombreEs() { return nombreEs; }
    public void setNombreEs(String nombreEs) { this.nombreEs = nombreEs; }

    public String getNombreEn() { return nombreEn; }
    public void setNombreEn(String nombreEn) { this.nombreEn = nombreEn; }

    public String getNombreFr() { return nombreFr; }
    public void setNombreFr(String nombreFr) { this.nombreFr = nombreFr; }

    public String getImagen() { return imagen; }
    public void setImagen(String imagen) { this.imagen = imagen; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getVendidos() { return vendidos; }
    public void setVendidos(int vendidos) { this.vendidos = vendidos; }

    public Categoria getCategoria() { return categoria; }
    public void setCategoria(Categoria categoria) { this.categoria = categoria; }
}
