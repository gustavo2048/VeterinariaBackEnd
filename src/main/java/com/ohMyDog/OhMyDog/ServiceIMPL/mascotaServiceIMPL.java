package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ohMyDog.OhMyDog.Entity.Mascota;

import com.ohMyDog.OhMyDog.Repository.MascotaRepository;

import com.ohMyDog.OhMyDog.Service.MascotaService;

@Service
public class mascotaServiceIMPL implements MascotaService {

	@Autowired
	private MascotaRepository repo;
	
	
	@Override
	public List<Mascota> consultarMascotas() {
		// TODO Auto-generated method stub
		return (List<Mascota>)this.repo.findAll();
	}

	@Override
	public Mascota crearMascota(Mascota mascota) {
		// TODO Auto-generated method stub
		return this.repo.save(mascota);
		
	}
	
	@Override
	public List<Mascota> consultarMascotasPorIdDuenio(int id) {
		// TODO Auto-generated method stub	
		List<Mascota> nuevo = this.repo.consultarMascotasPorIdDuenio(id);
		return (List<Mascota>)this.repo.consultarMascotasPorIdDuenio(id);	 
		
	}
	


	@Override
	public Mascota modificarMascota(Mascota mascota) {
		// TODO Auto-generated method stub	
		return this.repo.save(mascota);
	}

	@Override
	public Mascota BuscarMascota(int id) {
		return this.repo.findById(id).get();
	}

	@Override
	public void EliminarMascota(int id) {
		// TODO Auto-generated method stub

	}

}
