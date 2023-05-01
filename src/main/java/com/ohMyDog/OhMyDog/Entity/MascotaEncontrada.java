package com.ohMyDog.OhMyDog.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mascotaencontrada")
public class MascotaEncontrada {

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
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "lugarEncontrado")
	private String lugarEncontrado;
	
	@Column(name = "fechaEncontrado")
	private Date fechaEncontrado;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuarioEncontrado")
	private Usuario usuarioEncontro;

	
	
	

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


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getLugarEncontrado() {
		return lugarEncontrado;
	}


	public void setLugarEncontrado(String lugarEncontrado) {
		this.lugarEncontrado = lugarEncontrado;
	}


	public Date getFechaEncontrado() {
		return fechaEncontrado;
	}


	public void setFechaEncontrado(Date fechaEncontrado) {
		this.fechaEncontrado = fechaEncontrado;
	}


	public Usuario getUsuarioEncontro() {
		return usuarioEncontro;
	}


	public void setUsuarioEncontro(Usuario usuarioEncontro) {
		this.usuarioEncontro = usuarioEncontro;
	}

}