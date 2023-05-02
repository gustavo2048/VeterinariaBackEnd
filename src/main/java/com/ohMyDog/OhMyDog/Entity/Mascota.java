package com.ohMyDog.OhMyDog.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ohMyDog.OhMyDog.DTO.MascotaDTO;

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
@Table(name = "mascota")
public class Mascota {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "raza")
	private String raza;
	
	@Column(name = "edad")
	private String edad;
	
	@Column(name = "tamaño")
	private String tamaño;
	
	@Column(name = "caracteristicas")
	private String caracteristicas;
	
	@Column(name = "foto")
	private String foto;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario usuario;

	
	
	
	
	public Mascota() {
		// TODO Auto-generated constructor stub
	}
	
	public Mascota(MascotaDTO mascota) {
		this.setId(mascota.getId());
		this.setBorrado(mascota.isBorrado());
		this.setNombre(mascota.getNombre());
		this.setRaza(mascota.getRaza());
		this.setEdad(mascota.getEdad());
		this.setTamaño(mascota.getTamaño());
		this.setCaracteristicas(mascota.getCaracteristicas());
		this.setFoto(mascota.getFoto());
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

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getTamaño() {
		return tamaño;
	}

	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
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

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}