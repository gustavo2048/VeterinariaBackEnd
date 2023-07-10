package com.ohMyDog.OhMyDog.Entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ohMyDog.OhMyDog.DTO.TurnosDTO;

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
@Table(name = "turno")
public class Turnos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "borrado")
	private boolean borrado;
	
	@Column(name = "horarioTentativo")
	private String horarioTentativo;
	
	@Column(name = "motivo")
	private String motivo;
	
	@Column(name = "estadoSolicitud")
	private String estadoSolicitud;
	
	@Column(name = "eleccionMotivo")
	private String eleccionMotivo;
	
	@Column(name = "fechaCreado")
	private Date fechaCreado;
	
	@Column(name = "fechaSolicitada")
	private Date fechaSolicitada;
	
	@Column(name = "fechaAsignada")
	private Date fechaAsignada;
	
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Mascota mascota;
	

	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	@ManyToOne(fetch = FetchType.EAGER)
	private Usuario usuario;

	
	public Turnos() {
		// TODO Auto-generated constructor stub
	}
	
	public Turnos(TurnosDTO turnoDTO) {
		this.setBorrado(turnoDTO.isBorrado());
		//this.estadoSolicitud() Este valor se seteara cuando se Hace la solicitud
		this.setHorarioTentativo(turnoDTO.getHorarioTentativo());
		this.setFechaSolicitada(turnoDTO.getFechaSolicitada());
		this.setMotivo(turnoDTO.getMotivo( ));
		this.setEleccionMotivo(turnoDTO.getEleccionMotivo());
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


	public String getHorarioTentativo() {
		return horarioTentativo;
	}


	public void setHorarioTentativo(String horarioTentativo) {
		this.horarioTentativo = horarioTentativo;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getEstadoSolicitud() {
		return estadoSolicitud;
	}


	public void setEstadoSolicitud(String estadoSolicitud) {
		this.estadoSolicitud = estadoSolicitud;
	}


	public Date getFechaCreado() {
		return fechaCreado;
	}


	public void setFechaCreado(Date fechaCreado) {
		this.fechaCreado = fechaCreado;
	}


	public Date getFechaAsignada() {
		return fechaAsignada;
	}


	public void setFechaAsignada(Date fechaAsignada) {
		this.fechaAsignada = fechaAsignada;
	}

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

	public Date getFechaSolicitada() {
		return fechaSolicitada;
	}


	public void setFechaSolicitada(Date fechaSolicitada) {
		this.fechaSolicitada = fechaSolicitada;
	}

	public String getEleccionMotivo() {
		return eleccionMotivo;
	}

	public void setEleccionMotivo(String eleccionMotivo) {
		this.eleccionMotivo = eleccionMotivo;
	}

}