package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ohMyDog.OhMyDog.Entity.Cuidador;
import com.ohMyDog.OhMyDog.Entity.Usuario;

public class CuidadorDTO {
	private int id;
	//private Date fechaCreacion;
	private boolean disponible;
	private String zona;
	private String nombre;
	private String apellido;
	private String horario;
	private String email; 
	private String descripcion;
	private int usuarioId;
	
	public CuidadorDTO() {
		
	}
	public CuidadorDTO(Cuidador cuidador) {
		this.setId(cuidador.getId());
		this.setDisponible(cuidador.isDisponible());
		this.setApellido(cuidador.getApellido());
		this.setNombre(cuidador.getNombre());
		this.setZona(cuidador.getZonaTrabajo());
		this.setHorario(cuidador.getHorarioTrabajo());
		this.setEmail(cuidador.getEmail());
		this.setDescripcion(cuidador.getDescripcion());
		//this.setUsuarioId(paseador.getUsuario());
	
	}
	public String getApellido() {
		return this.apellido;
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

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
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
