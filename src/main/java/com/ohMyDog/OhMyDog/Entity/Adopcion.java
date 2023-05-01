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
@Table(name = "adopcion")
public class Adopcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;

	@Column(name = "adoptado")
	private boolean adoptado;
	
	@Column(name = "motivacion")
	private String motivacion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuarioCreo")
	private  Usuario usuarioCreo;
	
	@Column(name = "observacion")
	private String observacion;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;

	
	
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

	public boolean isAdoptado() {
		return adoptado;
	}

	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	public String getMotivacion() {
		return motivacion;
	}

	public void setMotivacion(String motivacion) {
		this.motivacion = motivacion;
	}

	public Usuario getUsuarioCreo() {
		return usuarioCreo;
	}

	public void setUsuarioCreo(Usuario usuarioCreo) {
		this.usuarioCreo = usuarioCreo;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
}