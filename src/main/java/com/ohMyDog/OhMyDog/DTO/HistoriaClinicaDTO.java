package com.ohMyDog.OhMyDog.DTO;

import java.util.Date;

import jakarta.persistence.Column;

public class HistoriaClinicaDTO {

	private int id;
	
	private boolean borrado;
	
	private Date fechaCreacion;
		
	private String observacion;
		
	private String motivo;
		
	private int monto;
	
	private String peso;
	
	private int idMascota;
	
	private int idVacuna;
	
	private int idTurno;
	
	private int idUsuario;
	
	private boolean descuentoAplicado;
	
	private VacunaDTO vacuna;
	
	
	public HistoriaClinicaDTO() {
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isBorrado() {
		return borrado;
	}


	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public String getObservacion() {
		return observacion;
	}


	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public int getMonto() {
		return monto;
	}


	public void setMonto(int monto) {
		this.monto = monto;
	}


	public String getPeso() {
		return peso;
	}


	public void setPeso(String peso) {
		this.peso = peso;
	}


	public int getIdMascota() {
		return idMascota;
	}


	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}


	public int getIdVacuna() {
		return idVacuna;
	}


	public void setIdVacuna(int idVacuna) {
		this.idVacuna = idVacuna;
	}


	public VacunaDTO getVacuna() {
		return vacuna;
	}


	public void setVacuna(VacunaDTO vacuna) {
		this.vacuna = vacuna;
	}


	public int getIdTurno() {
		return idTurno;
	}


	public void setIdTurno(int idTurno) {
		this.idTurno = idTurno;
	}


	public boolean isDescuentoAplicado() {
		return descuentoAplicado;
	}


	public void setDescuentoAplicado(boolean descuentoAplicado) {
		this.descuentoAplicado = descuentoAplicado;
	}


	public int getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	
	
	
}
