package com.example.PaginaRopa.repositorio;

import com.example.PaginaRopa.entidad.Usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long> {
    Usuario findByCorreoAndContrasena(String correo, String contrasena); // para login
    boolean existsByCorreo(String correo);
    Optional<Usuario> findByCorreo(String correo);
}
