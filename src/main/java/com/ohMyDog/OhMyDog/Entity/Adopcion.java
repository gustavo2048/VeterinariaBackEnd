package com.ohMyDog.OhMyDog.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ohMyDog.OhMyDog.DTO.AdopcionDTO;
import com.ohMyDog.OhMyDog.DTO.MascotaDTO;

import java.sql.Date;
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
@Table(name = "adopcion")
public class Adopcion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;

	@Column(name = "adoptado")
	private boolean adoptado;
	
	@Column(name = "titulo")
	private String titulo;
	
	@Column(name = "motivo")
	private String motivo;
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "tamanio")
	private String tamanio;
	
	@Column(name = "raza")
	private String raza;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "usuarioId")
	private  int usuarioId;
	
/*	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario usuario;*/
	


	
	
	
	public Adopcion(){
		
	}
	public Adopcion(AdopcionDTO adopcion) {
		this.setId(adopcion.getId());
		this.setAdoptado(adopcion.isAdoptado());
		this.setBorrado(adopcion.isBorrado());
		this.setTitulo(adopcion.getTitulo());
		
		this.setTitulo(adopcion.getSexo());
		this.setTitulo(adopcion.getTamanio());
		this.setTitulo(adopcion.getRaza());
		
		this.setDescripcion(adopcion.getDescripcion());
		this.setMotivo(adopcion.getMotivo());
		this.setFechaCreacion(adopcion.getFechaCreacion());
		this.setUsuarioId(adopcion.getUsuarioId());
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
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isAdoptado() {
		return adoptado;
	}

	public void setAdoptado(boolean adoptado) {
		this.adoptado = adoptado;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}	



	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTamanio() {
		return tamanio;
	}
	public void setTamanio(String tamanio) {
		this.tamanio = tamanio;
	}
	public String getRaza() {
		return raza;
	}
	public void setRaza(String raza) {
		this.raza = raza;
	}
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	public int getUsuarioId() {
		return this.usuarioId;
	}

	public void setUsuarioId(int usuarioId) {
		this.usuarioId = usuarioId;
	}
	
/*	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}*/

	
}