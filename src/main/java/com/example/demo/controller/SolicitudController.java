package com.example.demo.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SolicitudDTO;
import com.example.demo.repository.PracticaRepository;

@RestController
@RequestMapping("/api/solicitud")
@CrossOrigin(origins = "http://localhost:4200")
public class SolicitudController {


    private final PracticaRepository practicaRepository;

    public SolicitudController(PracticaRepository practicaRepository) {
        this.practicaRepository = practicaRepository;
    }

    @GetMapping
    public ResponseEntity<List<SolicitudDTO>> getSolicitudes() {
        List<SolicitudDTO> solicitudes = practicaRepository.findAllSolicitudes();
        return solicitudes.isEmpty() ? ResponseEntity.noContent().build() : ResponseEntity.ok(solicitudes);
    }
	
}
