package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;
import java.time.LocalDate;

import com.ohMyDog.OhMyDog.Entity.DonacionPerro;
import com.ohMyDog.OhMyDog.Entity.Encontrado;

public class DonacionPerroDTO {
	private Date fechaLimite;
	private double monto;
	private String historia;
	private String descripcion;
	private String CBU;
	
	public DonacionPerroDTO() {
		
	}
	public DonacionPerroDTO(DonacionPerro p) {
		this.setFechaLimite(p.getFechaLimite());
		this.setMonto(p.getMonto());
		this.setHistoria(p.getHistoria());
		this.setDescripcion(p.getDescripcion());
		this.setCBU(p.getCBU());
		
	}
	
	
	public Date getFechaLimite() {
		return fechaLimite;
	}
	public void setFechaLimite(Date fechaLimite) {
		this.fechaLimite = fechaLimite;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
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
	public String getCBU() {
		return CBU;
	}
	public void setCBU(String cBU) {
		CBU = cBU;
	}
	
	
}
