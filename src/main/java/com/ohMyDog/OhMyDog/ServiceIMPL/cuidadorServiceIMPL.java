package com.ohMyDog.OhMyDog.ServiceIMPL;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Cuidador;
import com.ohMyDog.OhMyDog.Repository.CuidadorRepository;
import com.ohMyDog.OhMyDog.Service.CuidadorService;

@Service
public class cuidadorServiceIMPL implements CuidadorService {
	@Autowired
	private CuidadorRepository repo;
	
	
	@Override
	public List<Cuidador> listarCuidador() {
		// TODO Auto-generated method stub
		return (List<Cuidador>)this.repo.findAll();
	}

	@Override
	public Cuidador crearCuidador(Cuidador cuidador) {
		// TODO Auto-generated method stub
		return this.repo.save(cuidador);		
	}	


	@Override
	public Cuidador modificarCuidador(Cuidador cuidador) {
		// TODO Auto-generated method stub	
		return this.repo.save(cuidador);
	}

	@Override
	public Cuidador BuscarCuidador(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id).get();
	}

	@Override
	public void EliminarCuidador(int id) {
		// TODO Auto-generated method stub

	}
	@Override
	public Cuidador buscarCuidadorXEmail(String email) {
		// TODO Auto-generated method stub
		return this.repo.buscarCuidadorXEmail(email);
	}
}
