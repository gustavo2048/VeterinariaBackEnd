package com.ohMyDog.OhMyDog.Entity;


import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ohMyDog.OhMyDog.DTO.MascotaDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
	
	@Column(name = "color")
	private String color;
	
	@Column(name = "edad")
	private Date edad;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name="publicado")
	private boolean publicado;
	
	@Column(name="enAdopcion")
	private boolean enAdopcion;
	

	@Column(name = "tamanio")
	private String tamanio;
	
	@Column(name = "caracteristicas")
	private String caracteristicas;
	
	@Column(name = "foto")
	private String foto;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario usuario;

	@JsonIgnore
	@OneToMany(mappedBy = "mascota", fetch = FetchType.EAGER)
	private List<Adopcion> adopciones;
	
	@JsonIgnore
	@OneToMany(mappedBy = "mascota", fetch = FetchType.EAGER)
	private List<Encontrado> encontrados;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "mascota", fetch = FetchType.EAGER)
	private List<Turnos> turnos;
	

	
	
	@JsonIgnore
	@OneToMany(mappedBy = "mascota", fetch = FetchType.EAGER)
	private List<Perdido> perdido;
	
	public Mascota() {
		// TODO Auto-generated constructor stub
	}
	
	public Mascota(MascotaDTO mascota) {
		this.setId(mascota.getId());
		this.setBorrado(mascota.isBorrado());
		this.setNombre(mascota.getNombre());
		this.setRaza(mascota.getRaza());
		this.setEdad(mascota.getEdad());
		this.setColor(mascota.getColor());
		this.setTamanio(mascota.getTamanio());
		this.setCaracteristicas(mascota.getCaracteristicas());
		this.setFoto(mascota.getFoto());
		this.setSexo(mascota.getSexo());
		this.setPublicado(mascota.isPublicado());
		this.setEnAdopcion(mascota.isEnAdopcion());
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