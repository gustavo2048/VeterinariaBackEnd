package com.ohMyDog.OhMyDog.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ohMyDog.OhMyDog.DTO.HistoriaClinicaDTO;

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
@Table(name = "historiaclinica")
public class HistoriaClinica {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "observacion")	
	private String observacion;
	
	@Column(name = "motivo")	
	private String motivo;
	
	@Column(name = "monto")	
	private int monto;
	
	@Column(name = "peso")	
	private String peso;
	
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Vacunas vacuna;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.LAZY)
	private Mascota mascota;

	
	public HistoriaClinica() {
		// TODO Auto-generated constructor stub
	}
	
	public HistoriaClinica(HistoriaClinicaDTO HC) {
		this.setBorrado(HC.isBorrado());
		this.setFechaCreacion(HC.getFechaCreacion());
		this.setObservacion(HC.getObservacion());
		this.setMotivo(HC.getMotivo());
		this.setMonto(HC.getMonto());
		this.setPeso(HC.getPeso());
	}
	
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

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Mascota getMascota() {
		return mascota;
	}

	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getPeso() {
		return peso;
	}

	public void setPeso(String peso) {
		this.peso = peso;
	}

	public Vacunas getVacuna() {
		return vacuna;
	}

	public void setVacuna(Vacunas vacuna) {
		this.vacuna = vacuna;
	}

	
}