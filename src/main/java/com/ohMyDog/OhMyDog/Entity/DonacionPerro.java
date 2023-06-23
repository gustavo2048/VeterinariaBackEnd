package com.ohMyDog.OhMyDog.Entity;

import java.sql.Date;
import java.time.LocalDate;


import com.ohMyDog.OhMyDog.DTO.DonacionPerroDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "donacionPerro")
public class DonacionPerro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	

	@Column(name = "historia")
	private String historia;
	
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "monto")
	private double monto;
	
	@Column(name = "fechaLimite")
	private Date fechaLimite;
	
	@Column(name = "CBU")
	private String CBU;

	public DonacionPerro() {
		
	}
	public DonacionPerro(DonacionPerroDTO p) {
		this.setFechaLimite(p.getFechaLimite());
		this.setMonto(p.getMonto());
		this.setCBU(p.getCBU());
		this.setHistoria(p.getHistoria());
		this.setDescripcion(p.getDescripcion());
	
		
	}
	
	
	public String getCBU() {
		return CBU;
	}


	public void setCBU(String cBU) {
		CBU = cBU;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	
	
}
