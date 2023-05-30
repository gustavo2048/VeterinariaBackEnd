package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Repository.AdopcionRepository;
import com.ohMyDog.OhMyDog.Service.AdopcionService;

@Service
public class adopcionServiceIMPL implements AdopcionService{
	
	@Autowired
	private AdopcionRepository repo;
	
	
	@Override
	public List<Adopcion> listarAdopciones() {
		// TODO Auto-generated method stub
		return (List<Adopcion>)this.repo.findAll();
	}
	
	@Override
	public List<Adopcion> listarAdopcionesMias(int id) {
		// TODO Auto-generated method stub
		return (List<Adopcion>)this.repo.listarAdopcionesMias(id);
	}
	
	@Override
	public List<Adopcion> listarAdopcionesAjenas(int id) {
		// TODO Auto-generated method stub
		return (List<Adopcion>)this.repo.listarAdopcionesAjenas(id);
	}



	@Override
	public Adopcion crearAdopcion(Adopcion adopcion) {
		// TODO Auto-generated method stub
		return this.repo.save(adopcion);		
	}	


	@Override
	public Adopcion modificarAdopcion(Adopcion adopcion) {
		// TODO Auto-generated method stub	
		return this.repo.save(adopcion);
	}

	@Override
	public Adopcion BuscarAdopcion(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void EliminarAdopcion(int id) {
		// TODO Auto-generated method stub

	}





}
