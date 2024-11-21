package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.Solicitud1DTO;
import com.example.demo.entity.Practica;

@Repository
public interface Solicitud1Repository extends JpaRepository<Practica, Long>{

	


	
}
