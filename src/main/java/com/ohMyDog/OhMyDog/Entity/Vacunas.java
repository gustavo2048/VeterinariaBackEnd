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
@Table(name = "vacuna")
public class Vacunas {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idVeterinarioRealizo")
	private Usuario veterinarioRealizo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idHistoriaClinica")
	private HistoriaClinica historiaClinica;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idMascotaAplicada")
	private Mascota mascotaAplicada;

	


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
	
	public Usuario getVeterinarioRealizo() {
		return veterinarioRealizo;
	}

	public void setVeterinarioRealizo(Usuario veterinarioRealizo) {
		this.veterinarioRealizo = veterinarioRealizo;
	}

	public HistoriaClinica getHistoriaClinica() {
		return historiaClinica;
	}

	public void setHistoriaClinica(HistoriaClinica historiaClinica) {
		this.historiaClinica = historiaClinica;
	}

	public Mascota getMascotaAplicada() {
		return mascotaAplicada;
	}

	public void setMascotaAplicada(Mascota mascotaAplicada) {
		this.mascotaAplicada = mascotaAplicada;
	}

}