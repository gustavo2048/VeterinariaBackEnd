package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.DonacionPerro;
import com.ohMyDog.OhMyDog.Entity.DonacionRefugio;
import com.ohMyDog.OhMyDog.Repository.DonacionPerroRepository;
import com.ohMyDog.OhMyDog.Repository.DonacionRefugioRepository;

@Service
public class donacionRefugioServiceIMPL {
	@Autowired
	private DonacionRefugioRepository repo;
	
	
	
	public List<DonacionRefugio> listarDonacionRefugio() {
		// TODO Auto-generated method stub
		return (List<DonacionRefugio>)this.repo.findAll();
	}

	
	public DonacionRefugio crearDonacionRefugio(DonacionRefugio encontrado) {
		// TODO Auto-generated method stub
		return this.repo.save(encontrado);		
	}	

	
	
	public DonacionRefugio modificarDonacionRefugio(DonacionRefugio e) {
		// TODO Auto-generated method stub	
		return this.repo.save(e);
	}
}
