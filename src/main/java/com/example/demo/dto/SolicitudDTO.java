package com.example.demo.dto;

import java.time.LocalDate;

public class SolicitudDTO {
	
	private Long idPractica;
    private String practicante;
    private String codigo;
    private LocalDate fecha;
    private String empresa;
    private String linea;
    private String representanteLegal;
    private String estado;

    // Constructor
    public SolicitudDTO(Long idPractica, String practicante, String codigo, LocalDate fecha, String empresa, String linea, String representanteLegal, String estado) {
        this.idPractica = idPractica;
        this.practicante = practicante;
        this.codigo = codigo;
        this.fecha = fecha;
        this.empresa = empresa;
        this.linea = linea;
        this.representanteLegal = representanteLegal;
        this.estado = estado;
    }

    // Getters y Setters
    public Long getIdPractica() { return idPractica; }
    public void setIdPractica(Long idPractica) { this.idPractica = idPractica; }

    public String getPracticante() { return practicante; }
    public void setPracticante(String practicante) { this.practicante = practicante; }

    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public LocalDate getFecha() { return fecha; }
    public void setFecha(LocalDate fecha) { this.fecha = fecha; }

    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    public String getLinea() { return linea; }
    public void setLinea(String linea) { this.linea = linea; }

    public String getRepresentanteLegal() { return representanteLegal; }
    public void setRepresentanteLegal(String representanteLegal) { this.representanteLegal = representanteLegal; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
}
