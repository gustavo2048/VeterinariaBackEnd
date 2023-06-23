package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;

import com.ohMyDog.OhMyDog.Entity.Encontrado;


public class EncontradoDTO {
	private int id;
	private Date fechaEncontrado;
	private String lugar;
	private String raza;
	private String color;
	private String tam;
	private String foto;
	private String descripcion;
	private String sexo;
	private boolean duenio;
	private int usuarioId;
	private int mascotaId;
	
	
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	public int getMascotaId() {
		return mascotaId;
	}
	public void setMascotaId(int mascotaId) {
		this.mascotaId = mascotaId;
	}
	
	public EncontradoDTO() {
		
	}
	public EncontradoDTO(Encontrado e) {
		this.setDuenio(e.isDuenio());
		this.setFechaEncontrado(e.getFechaEncontrado());
		
		this.setId(e.getId());
		this.setLugar(e.getLugar());
		this.setDescripcion(e.getDescripcion());
		this.setRaza(e.getRaza());
		this.setTam(e.getTam());
		this.setColor(e.getColor());
		this.setFoto(e.getFoto());
		this.setSexo(e.getSexo());
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
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String genero) {
		this.sexo = genero;
	}
	public boolean isDuenio() {
		return duenio;
	}
	public void setDuenio(boolean duenio) {
		this.duenio = duenio;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getTam() {
		return tam;
	}
	public void setTam(String tamanio) {
		this.tam= tamanio;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	
}
