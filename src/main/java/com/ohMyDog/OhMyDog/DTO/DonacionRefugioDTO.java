package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;

import com.ohMyDog.OhMyDog.Entity.DonacionRefugio;

public class DonacionRefugioDTO {
	private Date fechaLimite;
	private double monto;
	private String contacto;
	private String zona;
	private String CBU;
	private String causa;
	private String foto;
	
	public DonacionRefugioDTO() {
		
	}
	public DonacionRefugioDTO(DonacionRefugio p) {
		this.setFechaLimite(p.getFechaLimite());
		this.setMonto(p.getMonto());
		this.setContacto(p.getContacto());	
		this.setCBU(p.getCBU());
		this.setZona(p.getZona());
		this.setCausa(p.getCausa());
		this.setFoto(p.getFoto());
	}
	
	
	public String getCausa() {
		return causa;
	}
	public void setCausa(String causa) {
		this.causa = causa;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
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
	
	public String getCBU() {
		return CBU;
	}
	public void setCBU(String cBU) {
		CBU = cBU;
	}
	
	
}
