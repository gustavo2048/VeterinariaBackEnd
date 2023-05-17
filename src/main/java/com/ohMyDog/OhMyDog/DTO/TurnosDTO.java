package com.ohMyDog.OhMyDog.DTO;

import java.io.Serializable;
import java.util.Date;



public class TurnosDTO implements Serializable {
	
	private int id;

	private boolean borrado;
	
	private String horarioTentativo;

	private String motivo;

	private String estadoSolicitud;
	
	private Date fechaCreado;
	
	private Date fechaAsignada;

	private int idMascota;

	private int idUsuarioSolicitante;

	
	
	
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

	public String getHorarioTentativo() {
		return horarioTentativo;
	}

	public void setHorarioTentativo(String horarioTentativo) {
		this.horarioTentativo = horarioTentativo;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}

	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}

	public Date getFechaCreado() {
		return fechaCreado;
	}

	public void setFechaCreado(Date fechaCreado) {
		this.fechaCreado = fechaCreado;
	}

	public Date getFechaAsignada() {
		return fechaAsignada;
	}

	public void setFechaAsignada(Date fechaAsignada) {
		this.fechaAsignada = fechaAsignada;
	}

	public int getIdMascota() {
		return idMascota;
	}

	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}

	public int getIdUsuarioSolicitante() {
		return idUsuarioSolicitante;
	}

	public void setIdUsuarioSolicitante(int idUsuarioSolicitante) {
		this.idUsuarioSolicitante = idUsuarioSolicitante;
	}
	

}
