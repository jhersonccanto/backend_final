package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Practica;

@Repository
public interface PracticaRepository extends JpaRepository<Practica, Long> {

}
