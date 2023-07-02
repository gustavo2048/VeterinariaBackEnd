package com.ohMyDog.OhMyDog.DTO;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;

import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

public class MascotaDTO {

	private int id;
	private boolean borrado;
	private String nombre;
	private String raza;
	private String color;
	private Date edad;
	private String tamanio;
	private String caracteristicas;
	private String foto;
	private boolean publicado;
	private int usuarioId;
	private Usuario usuario;
	private boolean enAdopcion;

	private String sexo;
	
	public MascotaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public MascotaDTO(Mascota mascota) {
		this.setId(mascota.getId());
		this.setBorrado(mascota.isBorrado());
		this.setNombre(mascota.getNombre());
		
		this.setRaza(mascota.getRaza());
		this.setEdad(mascota.getEdad());
		this.setTamanio(mascota.getTamanio());
		this.setColor(mascota.getColor());
		
		this.setCaracteristicas(mascota.getCaracteristicas());
		this.setFoto(mascota.getFoto());
		this.setSexo(mascota.getSexo());
		this.setPublicado(mascota.isPublicado());
		this.setEnAdopcion(mascota.isEnAdopcion());
		//this.setUsuario(new Usuario());
		
	}

	public boolean isPublicado() {
		return publicado;
	}

	public void setPublicado(boolean publicado) {
		this.publicado = publicado;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}
	

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Date getEdad() {
		return edad;
	}

	public void setEdad(Date edad) {
		this.edad = edad;
	}

	public String getTamanio() {
		return tamanio;
	}

	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	public int getUsuarioId() {
		return usuarioId;
	}
	public void setUsuarioId(int id) {
		this.usuarioId=id;
	}
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}


	public boolean isEnAdopcion() {
		return enAdopcion;
	}

	public void setEnAdopcion(boolean enAdopcion) {
		this.enAdopcion = enAdopcion;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
}
