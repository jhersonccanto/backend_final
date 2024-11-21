package com.example.demo.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dto.DetalleSolicitudDTO;
import com.example.demo.dto.SolicitudDTO;
import com.example.demo.entity.Practica;

@Repository
public interface PracticaRepository extends JpaRepository<Practica, Long> {
	
	@Query("SELECT new com.example.demo.dto.SolicitudDTO(" +
	           "p.idPractica, pe.nombre, pe.codigo, d.fechaSubida, e.nombre, l.nombre, rl.cargo, es.estado) " +
	           "FROM Practica p " +
	           
	           "JOIN p.practicante pr " +
	           "JOIN pr.persona pe " +
	           
				"JOIN p.documentacion d " +
	           
	           "JOIN p.empresa e " +
	           "JOIN p.linea l " +
	           "JOIN e.representanteLegal rl " +
	           "JOIN p.estadoPPP es")
	    List<SolicitudDTO> findAllSolicitudes();
	
	@Query("SELECT new com.example.demo.dto.DetalleSolicitudDTO(" +
	           "e.nombre, e.ruc, e.direccion, e.correo, l.nombre, pe.nombre, pe.apellido, rl.cargo, pe.email, pe.telefono) " +
	           "FROM Empresa e " +
	           
	           "JOIN e.practica p " +
	           "JOIN p.linea l " +
	           
				"JOIN e.representanteLegal rl " +
				"JOIN rl.persona pe ")
	    List<DetalleSolicitudDTO> findAllDetalleSolicitudes();
	
	@Query("SELECT new com.example.demo.dto.DetalleSolicitudDTO(" +
		       "e.nombre, e.ruc, e.direccion, e.correo, l.nombre, pe.nombre, pe.apellido, rl.cargo, pe.email, pe.telefono) " +
		       "FROM Empresa e " +
		       "JOIN e.practica p " +
		       "JOIN p.linea l " +
		       "JOIN e.representanteLegal rl " +
		       "JOIN rl.persona pe " +
		       "WHERE p.idPractica = :id")
		DetalleSolicitudDTO findDetalleSolicitudById(@PathVariable("id") Long id);
	
}
