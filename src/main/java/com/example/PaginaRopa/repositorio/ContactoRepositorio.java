package com.example.PaginaRopa.repositorio;


import com.example.PaginaRopa.entidad.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<Contacto, Long> {
}
