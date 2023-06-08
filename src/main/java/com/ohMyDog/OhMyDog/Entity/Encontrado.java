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
	
	@Column(name = "duenio")
	private boolean duenio;

	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "genero")
	private String genero;

	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_encontrado")
	private Date fechaEncontrado;

	@Column(name = "mascotaId")
	private int mascota;
	@Column(name = "usuarioId")
	private  int usuarioId;
	
	public Encontrado() {
		
	}
	public Encontrado(EncontradoDTO e) {
		this.setMascota(e.getMascota());
		this.setDuenio(e.isDuenio());
		this.setFechaEncontrado(e.getFechaEncontrado());
		this.setGenero(e.getGenero());
		this.setId(e.getId());
		this.setLugar(e.getLugar());
		this.setDescripcion(e.getDescripcion());
		this.setUsuarioId(e.getUsuarioId());

	}
	public int getMascota() {
		return mascota;
	}
	public void setMascota(int mascota) {
		this.mascota=mascota;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDuenio() {
		return duenio;
	}

	public void setDuenio(boolean duenio) {
		this.duenio = duenio;
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
	
	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	
}
