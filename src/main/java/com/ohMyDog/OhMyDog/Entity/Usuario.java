package com.ohMyDog.OhMyDog.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ohMyDog.OhMyDog.DTO.UsuarioDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "telefono")
	private String telefono;
	
	@Column(name = "dni")
	private String dni;
	
	@Column(name = "montoDescuento")
	private int montoDescuento;
	
	@Column(name = "domicilio")
	private String domicilio;
	
	@Column(name = "verificado")
	private boolean verificado;
	
	@Column(name = "rol")
	private String rol;

	@JsonIgnore
	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	private List<Mascota> mascotas;

	@JsonIgnore
	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	private List<Encontrado> encontrados;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	private List<Turnos> turnos;
	
	@JsonIgnore
	@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	private List<Perdido> perdido;
	
	//@JsonIgnore
	//@OneToMany(mappedBy = "usuario", fetch = FetchType.EAGER)
	//private List<A> adopcion;
	
	public Usuario() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Usuario(UsuarioDTO usuario) {
		// Crear un Entity apartir de un DTO
		this.id = usuario.getId();
		this.borrado = usuario.isBorrado();
		this.nombre = usuario.getNombre();
		this.apellido = usuario.getApellido();
		this.password = usuario.getPassword();
		this.email = usuario.getEmail();
		this.telefono = usuario.getTelefono();
		this.dni = usuario.getDni();
		this.domicilio = usuario.getDomicilio();
		this.verificado = usuario.isVerificado();
		this.rol = usuario.getRol();
	}
	
	
	
	public int getMontoDescuento() {
		return montoDescuento;
	}

	public void setMontoDescuento(int montoDescuento) {
		this.montoDescuento = montoDescuento;
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

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public boolean isVerificado() {
		return verificado;
	}

	public void setVerificado(boolean verificado) {
		this.verificado = verificado;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	

}