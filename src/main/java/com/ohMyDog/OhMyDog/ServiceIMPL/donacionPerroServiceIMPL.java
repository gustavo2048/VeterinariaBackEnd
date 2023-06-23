package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.DonacionPerro;
import com.ohMyDog.OhMyDog.Repository.DonacionPerroRepository;


@Service
public class donacionPerroServiceIMPL {
	@Autowired
	private DonacionPerroRepository repo;
	
	
	public List<DonacionPerro> listarDonacionPerro() {
		// TODO Auto-generated method stub
		return (List<DonacionPerro>)this.repo.findAll();
	}

	
	public DonacionPerro crearDonacionPerro(DonacionPerro encontrado) {
		// TODO Auto-generated method stub
		return this.repo.save(encontrado);		
	}	

	
	
	public DonacionPerro modificarDonacionPerro(DonacionPerro e) {
		// TODO Auto-generated method stub	
		return this.repo.save(e);
	}
}
