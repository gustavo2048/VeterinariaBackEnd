package com.ohMyDog.OhMyDog.Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ohMyDog.OhMyDog.DTO.PerdidoDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "perdido")
public class Perdido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "encontrado")
	private boolean encontrado;

	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "genero")
	private String genero;

	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_perdido")
	private Date fechaPerdido;

	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Mascota mascota;
	

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario usuario;
	
	
	
	public Perdido() {
		
	}
	public Perdido(PerdidoDTO perdido) {
		this.setDescripcion(perdido.getDescripcion());	
		this.setFechaPerdido(perdido.getFechaPerdido());
		this.setGenero(perdido.getGenero());
		this.setLugar(perdido.getLugar());
		this.setId(perdido.getId());
		this.setEncontrado(perdido.isEncontrado());
		

	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEncontrado() {
		return encontrado;
	}
	public void setEncontrado(boolean encontrado) {
		this.encontrado = encontrado;
	}
	public String getLugar() {
		return lugar;
	}
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaPerdido() {
		return fechaPerdido;
	}
	public void setFechaPerdido(Date fechaPerdido) {
		this.fechaPerdido = fechaPerdido;
	}
	
	
	

}
