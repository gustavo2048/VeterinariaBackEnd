package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Paseador;
import com.ohMyDog.OhMyDog.Repository.PaseadorRepository;
import com.ohMyDog.OhMyDog.Service.PaseadorService;

@Service
public class paseadorServiceIMPL implements PaseadorService {
	@Autowired
	private PaseadorRepository repo;
	
	
	@Override
	public List<Paseador> listarPaseador() {
		// TODO Auto-generated method stub
		return (List<Paseador>)this.repo.findAll();
	}

	@Override
	public Paseador crearPaseador(Paseador paseador) {
		// TODO Auto-generated method stub
		return this.repo.save(paseador);		
	}	


	@Override
	public Paseador modificarPaseador(Paseador paseador) {
		// TODO Auto-generated method stub	
		return this.repo.save(paseador);
	}

	@Override
	public Paseador BuscarPaseador(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void EliminarPaseador(int id) {
		// TODO Auto-generated method stub

	}
	
}
