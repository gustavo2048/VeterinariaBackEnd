package com.ohMyDog.OhMyDog.DTO;
import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ohMyDog.OhMyDog.Entity.Paseador;
import com.ohMyDog.OhMyDog.Entity.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
public class PaseadorDTO {
	private int id;
	//private Date fechaCreacion;
	private boolean borrado;
	private String zona;
	private String nombre;
	private String apellido;
	private String horario;
	private String email; 
	private String descripcion;
	private int usuarioId;
	
	public PaseadorDTO() {
		
	}
	public PaseadorDTO(Paseador paseador) {
		this.setId(paseador.getId());
		this.setBorrado(paseador.isBorrado());
		this.setApellido(paseador.getApellido());
		this.setNombre(paseador.getNombre());
		this.setZona(paseador.getZonaTrabajo());
		this.setHorario(paseador.getHorarioTrabajo());
		this.setEmail(paseador.getEmail());
		this.setDescripcion(paseador.getDescripcion());
		//this.setUsuarioId(paseador.getUsuario());
	
	}
	public String getApellido() {
		return this.nombre;
	}
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	public int getId() {
		return id;
	}
	
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int id) {
		this.usuarioId=id;
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
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
}
