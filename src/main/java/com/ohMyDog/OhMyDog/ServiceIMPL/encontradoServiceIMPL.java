package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Encontrado;
import com.ohMyDog.OhMyDog.Repository.EncontradoRepository;
import com.ohMyDog.OhMyDog.Service.EncontradoService;


@Service
public class encontradoServiceIMPL implements EncontradoService {
	@Autowired
	private EncontradoRepository repo;
	
	@Override
	public List<Encontrado> listarEncontrado() {
		// TODO Auto-generated method stub
		return (List<Encontrado>)this.repo.findAll();
	}

	@Override
	public Encontrado crearEncontrado(Encontrado encontrado) {
		// TODO Auto-generated method stub
		return this.repo.save(encontrado);		
	}	

	@Override
	public List<Encontrado> listarEncontradoMias(int id) {
		// TODO Auto-generated method stub
		return (List<Encontrado>)this.repo.listarEncontradoMias(id);
	}
	
	@Override
	public List<Encontrado> listarEncontradoAjenas(int id) {
		// TODO Auto-generated method stub
		return (List<Encontrado>)this.repo.listarEncontradoAjenas(id);
	}
	@Override
	public Encontrado modificarEncontrado(Encontrado e) {
		// TODO Auto-generated method stub	
		return this.repo.save(e);
	}
}
