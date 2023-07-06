package com.ohMyDog.OhMyDog.Entity;

import java.sql.Date;

import com.ohMyDog.OhMyDog.DTO.DonacionPerroDTO;
import com.ohMyDog.OhMyDog.DTO.DonacionRefugioDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "donacionRefugio")
public class DonacionRefugio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	

	@Column(name = "zona")
	private String zona;
	
	@Column(name = "causa")
	private String causa;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "contacto")
	private String contacto;
	
	@Column(name = "monto")
	private double monto;
	
	@Column(name = "fechaLimite")
	private Date fechaLimite;
	
	@Column(name = "CBU")
	private String CBU;

	public DonacionRefugio() {
		
	}
	public DonacionRefugio(DonacionRefugioDTO p) {
		this.setFechaLimite(p.getFechaLimite());
		this.setMonto(p.getMonto());
		this.setCBU(p.getCBU());
		this.setContacto(p.getContacto());
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


	
	
	public String getZona() {
		return zona;
	}
	public void setZona(String zona) {
		this.zona = zona;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
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
