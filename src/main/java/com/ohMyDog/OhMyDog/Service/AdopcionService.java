package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Adopcion;

public interface AdopcionService {	
	
	public List<Adopcion> listarAdopciones();
	public List<Adopcion> listarAdopcionesMias(int id);
	public List<Adopcion> listarAdopcionesAjenas(int id);
	
	public Adopcion crearAdopcion(Adopcion adopcion);
	public Adopcion modificarAdopcion(Adopcion adopcion);
	public Adopcion BuscarAdopcion(int id);
	public void EliminarAdopcion(int id);

}
