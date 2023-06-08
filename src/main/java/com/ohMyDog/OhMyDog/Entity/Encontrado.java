package com.ohMyDog.OhMyDog.Entity;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ohMyDog.OhMyDog.DTO.EncontradoDTO;
import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "encontrado")
public class Encontrado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "duenio")
	private boolean duenio;

	
	@Column(name = "lugar")
	private String lugar;
	
	@Column(name = "genero")
	private String genero;

	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "fecha_encontrado")
	private Date fechaEncontrado;


	
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
	
	public Encontrado() {
		
	}
	public Encontrado(EncontradoDTO e) {
		this.setDuenio(e.isDuenio());
		this.setFechaEncontrado(e.getFechaEncontrado());
		this.setGenero(e.getGenero());
		this.setId(e.getId());
		this.setLugar(e.getLugar());
		this.setDescripcion(e.getDescripcion());
		

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isDuenio() {
		return duenio;
	}

	public void setDuenio(boolean duenio) {
		this.duenio = duenio;
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

	public Date getFechaEncontrado() {
		return fechaEncontrado;
	}

	public void setFechaEncontrado(Date fechaEncontrado) {
		this.fechaEncontrado = fechaEncontrado;
	}
	
	
	
}
