package com.ohMyDog.OhMyDog.DTO;

import java.sql.Date;

import com.ohMyDog.OhMyDog.Entity.Tarjeta;

public class TarjetaDTO {
	private int id;
	private String nombre;
	private double monto;
	private int nroTarjeta;
	private Date fecha;
	private int codigo;
	private int usuarioId;
	
	public TarjetaDTO(){
		
	}
	public TarjetaDTO(Tarjeta t) {
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
	
	
}
