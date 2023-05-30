package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Perdido;
import com.ohMyDog.OhMyDog.Repository.PerdidoRepository;
import com.ohMyDog.OhMyDog.Service.PerdidoService;
@Service
public class perdidoServiceIMPL implements PerdidoService {
	@Autowired
	private PerdidoRepository repo;
	
	@Override
	public List<Perdido> listarPerdido() {
		// TODO Auto-generated method stub
		return (List<Perdido>)this.repo.findAll();
	}

	@Override
	public Perdido crearPerdido(Perdido perdido) {
		// TODO Auto-generated method stub
		return this.repo.save(perdido);		
	}	
}
