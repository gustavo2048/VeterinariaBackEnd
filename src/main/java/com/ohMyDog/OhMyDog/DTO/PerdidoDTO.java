package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;

import com.ohMyDog.OhMyDog.Entity.Perdido;

public class PerdidoDTO {
	private int id;
	private Date fechaPerdido;
	private String lugar;
	private String descripcion;
	private String genero;
	private boolean encontrado;
	private int usuarioId;
	private int mascotaId;
	
	
	public int getMascotaId() {
		return mascotaId;
	}
	public void setMascotaId(int mascotaId) {
		this.mascotaId = mascotaId;
	}
	public PerdidoDTO() {
		
	}
	public PerdidoDTO(Perdido perdido) {
		
		this.setDescripcion(perdido.getDescripcion());	
		this.setFechaPerdido(perdido.getFechaPerdido());
		this.setGenero(perdido.getGenero());
		this.setLugar(perdido.getLugar());
		this.setId(perdido.getId());
		this.setEncontrado(perdido.isEncontrado());
	
	}
	public int getMascota() {
		return mascotaId;
	}
	public void setMascota(int mascota) {
		this.mascotaId=mascota;
	}
	public boolean isEncontrado() {
		return encontrado;
	}
	public void setEncontrado(boolean encontrado) {
		this.encontrado = encontrado;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFechaPerdido() {
		return fechaPerdido;
	}
	public void setFechaPerdido(Date fechaPerdida) {
		this.fechaPerdido = fechaPerdida;
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
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int id) {
		this.usuarioId=id;
	}
}
