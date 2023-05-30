package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;

import com.ohMyDog.OhMyDog.Entity.Encontrado;

public class EncontradoDTO {
	private int id;
	private Date fechaEncontrado;
	private String lugar;
	private String descripcion;
	private String genero;
	private boolean conDuenio;
	
	public EncontradoDTO() {
		
	}
	public EncontradoDTO(Encontrado e) {
		this.setConDuenio(e.isConDuenio());
		this.setFechaEncontrado(e.getFechaEncontrado());
		this.setGenero(e.getGenero());
		this.setId(e.getId());
		this.setLugar(e.getLugar());
		this.setDescripcion(e.getDescripcion());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaEncontrado() {
		return fechaEncontrado;
	}
	public void setFechaEncontrado(Date fechaEncontrado) {
		this.fechaEncontrado = fechaEncontrado;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public boolean isConDuenio() {
		return conDuenio;
	}
	public void setConDuenio(boolean conDuenio) {
		this.conDuenio = conDuenio;
	}
	
}
