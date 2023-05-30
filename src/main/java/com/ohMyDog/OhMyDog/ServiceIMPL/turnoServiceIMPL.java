package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Cliente;
import com.ohMyDog.OhMyDog.Entity.Turnos;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.Repository.TurnosRepository;
import com.ohMyDog.OhMyDog.Repository.UsuarioRepositoty;
import com.ohMyDog.OhMyDog.Service.TurnosService;

@Service
public class turnoServiceIMPL implements TurnosService {

	
	@Autowired
	private TurnosRepository repo;
	
	@Override
	public Turnos crearTurno(Turnos turno) {
		return this.repo.save(turno);
	}

	@Override
	public Turnos modificarTurno(Turnos turno) {
		// TODO Auto-generated method stub
		// No se implementa
		return null;
	}

	@Override
	public void eliminarCliente(int id) {
		// TODO Auto-generated method stub
		// No se implementa

	}

	@Override
	public List<Turnos> listarMisTurnoSinAsignar(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turnos> listarHistorial(Usuario usuario) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turnos> listarTurnosDiaSinAsignar(Date dia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turnos> listarTurnosDiAsignados(Date dia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Turnos> listarTurnos() {
		// TODO (List<Turnos>)this.repo.findAll()
		return (List<Turnos>)this.repo.findAll();
	}

	@Override
	public List<Turnos> verificarTurnoExistenteMismoDia(int idMascota, int idUsuario, Date fechaSolicitud) {
		return this.repo.verificarTurnoExistenteMismoDia(idMascota, idUsuario, fechaSolicitud);
	}

	@Override
	public List<Turnos> misTurnosPendientes(int id) {
		return this.repo.misTurnosPendientes(id);
	}

	@Override
	public List<Turnos> listadoTurnosSolicitados() {
		return this.repo.solicitadosActualmente();
	}

}
