package com.ohMyDog.OhMyDog.Entity;
import java.util.Date;
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
@Table(name = "mascotaperdida")
public class MascotaPerdida {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;
	
	@Column(name = "fechaCreacion")
	private Date fechaCreacion;
	
	@Column(name = "activo")
	private boolean activo;
	
	@Column(name = "fechaPerdida")
	private Date fechaPerdida;
	
	@Column(name = "lugarPerdida")
	private String lugarPerdida;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "genero")
	private String genero;
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idUsuario")
	private Usuario usuario;

	
	
	
	
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


	public Date getFechaCreacion() {
		return fechaCreacion;
	}


	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}


	public boolean isActivo() {
		return activo;
	}


	public void setActivo(boolean activo) {
		this.activo = activo;
	}


	public Date getFechaPerdida() {
		return fechaPerdida;
	}


	public void setFechaPerdida(Date fechaPerdida) {
		this.fechaPerdida = fechaPerdida;
	}


	public String getLugarPerdida() {
		return lugarPerdida;
	}


	public void setLugarPerdida(String lugarPerdida) {
		this.lugarPerdida = lugarPerdida;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public Usuario getUsuario() {
		return usuario;
	}


	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
}