package com.ohMyDog.OhMyDog.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "blog")
public class Blog {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;
	
	@Column(name = "activo")
	private boolean activo;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "subtitulo")
	private String subtitulo;
	
	@Column(name = "cuerpo")
	private String cuerpo;

	
	
	
	
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

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtitulo) {
		this.subtitulo = subtitulo;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

}