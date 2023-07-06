package com.ohMyDog.OhMyDog.Entity;

import java.sql.Date;

import com.ohMyDog.OhMyDog.DTO.TarjetaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tarjeta")
public class Tarjeta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;

	@Column(name = "usuarioId")
	private int usuarioId;
	
	@Column(name = "fecha")
	private Date fecha;
	
	@Column(name = "codigo")
	private int codigo;
	
	@Column(name = "monto")
	private double monto;
	
	@Column(name = "nroTarjeta")
	private int nroTarjeta;

	public Tarjeta() {
		
	}
	
	
	public Tarjeta(TarjetaDTO t) {
		this.setCodigo(t.getCodigo());
		this.setFecha(t.getFecha());
		this.setMonto(t.getMonto());
		this.setNombre(t.getNombre());
		this.setNroTarjeta(t.getNroTarjeta());
		this.setUsuarioId(t.getUsuarioId());
	}
	
	public int getUsuarioId() {
		return usuarioId;
	}


	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public int getNroTarjeta() {
		return nroTarjeta;
	}

	public void setNroTarjeta(int nroTarjeta) {
		this.nroTarjeta = nroTarjeta;
	}
	
	
}
