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
	
	private String sexo;
	private String raza;
	private String tamanio;
	private int mascotaId;

	private int usuarioId;
	//private Usuario usuario;	
	
	
	public AdopcionDTO() {
		
	}
	public AdopcionDTO(Adopcion adopcion) {	
		this.setId(adopcion.getId());
		this.setAdoptado(adopcion.isAdoptado());
		this.setBorrado(adopcion.isBorrado());
		this.setTitulo(adopcion.getTitulo());
		
		this.setSexo(adopcion.getSexo());
		this.setTamanio(adopcion.getTamanio());
		this.setRaza(adopcion.getRaza());
		
		this.setDescripcion(adopcion.getDescripcion());
		this.setMotivo(adopcion.getMotivo());
		this.setFechaCreacion(adopcion.getFechaCreacion());

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
	public void setUsuarioId(int id) {
		this.usuarioId=id;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	
	public int getMascotaId() {
		return mascotaId;
	}
	public void setMascotaId(int mascotaId) {
		this.mascotaId = mascotaId;
	}
	
	

/*	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}*/
	
	

}
