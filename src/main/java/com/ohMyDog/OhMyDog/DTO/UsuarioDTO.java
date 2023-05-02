package com.ohMyDog.OhMyDog.DTO;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;

import jakarta.persistence.Column;


public class UsuarioDTO implements Serializable {
	
	//private static final long serialVersionUID = -2120163561077722195L;
	
	private int id;
	private boolean borrado;
	private String nombre;
	private String apellido;
	private String password;
	private String email;
	private String telefono;
	private String dni;
	private String domicilio;
	private boolean verificado;
	private String rol;
	private List<Mascota> mascotas;
	
	public UsuarioDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public UsuarioDTO(Usuario usuario) {
		// TODO Auto-generated constructor stub

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
		this.setRol(usuario.getRol());
		this.setMascotas( new ArrayList<Mascota>());
		
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
	
	public List<Mascota> getMascotas() {
		return mascotas;
	}
	public void setMascotas(List<Mascota> mascotas) {
		this.mascotas = mascotas;
	}
	


}
