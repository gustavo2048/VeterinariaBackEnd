package com.ohMyDog.OhMyDog.Entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "donacion")
public class Donacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;
	
	@Column(name = "activo")
	private boolean activo;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "historia")
	private String historia;
	
	@Column(name = "fechaLimite")
	private Date fechaLimite;
	
	@Column(name = "monto")
	private String monto;
	
	@Column(name = "tipoDonacion")
	private String tipoDonacion;

	@Column(name = "progreso")
	private String progreso;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "CBU")
	private String CBU;

	
	
	
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

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Date getFechaLimite() {
		return fechaLimite;
	}

	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}

	public String getMonto() {
		return monto;
	}

	public void setMonto(String monto) {
		this.monto = monto;
	}

	public String getTipoDonacion() {
		return tipoDonacion;
	}

	public void setTipoDonacion(String tipoDonacion) {
		this.tipoDonacion = tipoDonacion;
	}

	public String getProgreso() {
		return progreso;
	}

	public void setProgreso(String progreso) {
		this.progreso = progreso;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCBU() {
		return CBU;
	}

	public void setCBU(String cBU) {
		CBU = cBU;
	}

	
}