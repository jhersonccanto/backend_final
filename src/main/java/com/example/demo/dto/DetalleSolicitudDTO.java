package com.example.demo.dto;


public class DetalleSolicitudDTO {
	
	
    private String nombreEmpresa;
    private String rucEmpresa;
    private String direccionEmpresa;
    private String correoEmpresa;
    private String nombreLinea;
    
    private String nombrePersona;
    private String apellidoPersona;
    private String cargoRepresentante;
    private String correoPersona;
    private String telefonoPersona;
    
	public DetalleSolicitudDTO(String nombreEmpresa, String rucEmpresa, String direccionEmpresa, String correoEmpresa,
			String nombreLinea, String nombrePersona, String apellidoPersona, String cargoRepresentante,
			String correoPersona, String telefonoPersona) {
		
		this.nombreEmpresa = nombreEmpresa;
		this.rucEmpresa = rucEmpresa;
		this.direccionEmpresa = direccionEmpresa;
		this.correoEmpresa = correoEmpresa;
		this.nombreLinea = nombreLinea;
		this.nombrePersona = nombrePersona;
		this.apellidoPersona = apellidoPersona;
		this.cargoRepresentante = cargoRepresentante;
		this.correoPersona = correoPersona;
		this.telefonoPersona = telefonoPersona;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getRucEmpresa() {
		return rucEmpresa;
	}
	public void setRucEmpresa(String rucEmpresa) {
		this.rucEmpresa = rucEmpresa;
	}
	public String getDireccionEmpresa() {
		return direccionEmpresa;
	}
	public void setDireccionEmpresa(String direccionEmpresa) {
		this.direccionEmpresa = direccionEmpresa;
	}
	public String getCorreoEmpresa() {
		return correoEmpresa;
	}
	public void setCorreoEmpresa(String correoEmpresa) {
		this.correoEmpresa = correoEmpresa;
	}
	public String getNombreLinea() {
		return nombreLinea;
	}
	public void setNombreLinea(String nombreLinea) {
		this.nombreLinea = nombreLinea;
	}
	public String getNombrePersona() {
		return nombrePersona;
	}
	public void setNombrePersona(String nombrePersona) {
		this.nombrePersona = nombrePersona;
	}
	public String getApellidoPersona() {
		return apellidoPersona;
	}
	public void setApellidoPersona(String apellidoPersona) {
		this.apellidoPersona = apellidoPersona;
	}
	public String getCargoRepresentante() {
		return cargoRepresentante;
	}
	public void setCargoRepresentante(String cargoRepresentante) {
		this.cargoRepresentante = cargoRepresentante;
	}
	public String getCorreoPersona() {
		return correoPersona;
	}
	public void setCorreoPersona(String correoPersona) {
		this.correoPersona = correoPersona;
	}
	public String getTelefonoPersona() {
		return telefonoPersona;
	}
	public void setTelefonoPersona(String telefonoPersona) {
		this.telefonoPersona = telefonoPersona;
	}
    
	
}
