package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.SolicitudDTO;
import com.example.demo.repository.PracticaRepository;
import com.example.demo.service.PracticaService;
import com.example.demo.service.Solicitud1Service;

@Service
public class Solicitud1ServiceImpl implements Solicitud1Service{

	private final PracticaRepository practicaRepository;

    public Solicitud1ServiceImpl(PracticaRepository practicaRepository) {
        this.practicaRepository = practicaRepository;
    }
	
	@Override
	public List<SolicitudDTO> obtenerPracticasConDetalles() {
		// TODO Auto-generated method stub
		return practicaRepository.listarPracticasConDetalles();
	}

}
