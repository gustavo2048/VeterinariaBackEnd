package com.ohMyDog.OhMyDog.Entity;


import com.ohMyDog.OhMyDog.DTO.EncontradoDTO;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;


@Entity
@Table(name = "encontrado")
public class Encontrado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "con_duenio")
	private boolean conDuenio;

	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "genero")
	private String genero;

	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_encontrado")
	private Date fechaEncontrado;

	
	
	public Encontrado() {
		
	}
	public Encontrado(EncontradoDTO e) {
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

	public boolean isConDuenio() {
		return conDuenio;
	}

	public void setConDuenio(boolean conDuenio) {
		this.conDuenio = conDuenio;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaEncontrado() {
		return fechaEncontrado;
	}

	public void setFechaEncontrado(Date fechaEncontrado) {
		this.fechaEncontrado = fechaEncontrado;
	}
	

	
}
