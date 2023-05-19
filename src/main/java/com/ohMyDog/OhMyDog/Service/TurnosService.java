package com.ohMyDog.OhMyDog.Service;

import java.util.Date;
import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Cliente;
import com.ohMyDog.OhMyDog.Entity.Turnos;
import com.ohMyDog.OhMyDog.Entity.Usuario;


public interface TurnosService {

	public List<Turnos> listarTurnos();
	public Turnos crearTurno(Turnos turno);
	public Turnos modificarTurno(Turnos turno); //No implementar
	public void eliminarCliente(int id);  //No implementar
	public List<Turnos> listarMisTurnoSinAsignar(Usuario usuario);
	public List<Turnos> listarHistorial(Usuario usuario);
	public List<Turnos> listarTurnosDiaSinAsignar(Date dia); 
	public List<Turnos> listarTurnosDiAsignados(Date dia);
	
}