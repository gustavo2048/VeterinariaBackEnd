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
	
	@Column(name = "tam")
	private String tam;
	
	
	@Column(name = "sexo")
	private String sexo;
	
	@Column(name = "foto")
	private String foto;
	
	@Column(name = "raza")
	private String raza;
	
	@Column(name = "color")
	private String color;
	
	
	@Column(name = "lugar")
	private String lugar;
	
	
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
		
		this.setId(e.getId());
		this.setLugar(e.getLugar());
		this.setDescripcion(e.getDescripcion());
		this.setRaza(e.getRaza());
		this.setColor(e.getColor());
		this.setTam(e.getTam());
		this.setFoto(e.getFoto());
		this.setSexo(e.getSexo());

	}
	
	public String getTam() {
		return tam;
	}
	public void setTam(String tamanio) {
		this.tam = tamanio;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getFoto() {
		return foto;
	}
	public void setFoto(String foto) {
		this.foto = foto;
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
