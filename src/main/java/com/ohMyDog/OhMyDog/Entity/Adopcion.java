package com.ohMyDog.OhMyDog.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ohMyDog.OhMyDog.DTO.AdopcionDTO;
import com.ohMyDog.OhMyDog.DTO.MascotaDTO;

import java.sql.Date;
import java.util.List;

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
	
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;

	@Column(name= "usuarioId")
	private int usuarioId;
	
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Mascota mascota;
	
	
	
	
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
		this.setUsuarioId(adopcion.getUsuarioId());
		
		this.setSexo(adopcion.getSexo());
		this.setTamanio(adopcion.getTamanio());
		this.setRaza(adopcion.getRaza());
		
		this.setDescripcion(adopcion.getDescripcion());
		this.setMotivo(adopcion.getMotivo());
		this.setFechaCreacion(adopcion.getFechaCreacion());
	

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