package com.ohMyDog.OhMyDog.DTO;

import java.util.Date;

public class LibretaSanitariaDTO {

	
	private String motivo;
	private Date fechaRealizado;
	private String peso;
	private String tipoVacuna;
	private String dosis;
	private String descripcion;
	
	
	public String getTipoVacuna() {
		return tipoVacuna;
	}
	public void setTipoVacuna(String tipoVacuna) {
		this.tipoVacuna = tipoVacuna;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Date getFechaRealizado() {
		return fechaRealizado;
	}
	public void setFechaRealizado(Date fechaRealizado) {
		this.fechaRealizado = fechaRealizado;
	}
	public String getDosis() {
		return dosis;
	}
	public void setDosis(String dosis) {
		this.dosis = dosis;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}

	
	
}
