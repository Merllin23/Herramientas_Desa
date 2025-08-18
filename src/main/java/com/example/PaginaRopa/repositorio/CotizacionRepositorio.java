package com.example.PaginaRopa.repositorio;

import com.example.PaginaRopa.entidad.Cotizacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CotizacionRepositorio extends JpaRepository<Cotizacion, Long> {
	
}
