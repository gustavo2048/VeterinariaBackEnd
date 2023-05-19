package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

public class AdopcionDTO {
	
	private int id;
	private boolean adoptado;
	private boolean borrado;
	private String titulo;
	private String descripcion;
	private String motivo;
	private Date fechaCreacion;
	private int usuarioId;
	private Usuario usuario;
	
	
	public AdopcionDTO() {
		
	}
	
	public AdopcionDTO(Adopcion adopcion) {	
		this.id = adopcion.getId();
		this.adoptado = adopcion.isAdoptado();
		this.borrado = adopcion.isBorrado();
		this.titulo = adopcion.getTitulo();
		this.descripcion = adopcion.getDescripcion();
		this.motivo = adopcion.getMotivacion();
		this.fechaCreacion = (Date) adopcion.getFechaCreacion();
		//this.usuarioId = adopcion.getUsuarioId();
		//this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isAdoptado() {
		return adoptado;
	}
	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}
	public boolean isBorrado() {
		return borrado;
	}
	public void setBorrado(boolean borrado) {
		this.borrado = borrado;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
	
	

}
