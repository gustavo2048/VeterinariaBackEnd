package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Repository.MascotaRepository;
import com.ohMyDog.OhMyDog.Repository.UsuarioRepositoty;
import com.ohMyDog.OhMyDog.Service.MascotaService;

@Service
public class mascotaServiceIMPL implements MascotaService {

	@Autowired
	private MascotaRepository repo;
	
	
	@Override
	public List<Mascota> consultarMascotas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mascota crearMascota(Mascota mascota) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mascota modificarMascota(Mascota mascota) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Mascota BuscarMascota(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void EliminarMascota(int id) {
		// TODO Auto-generated method stub

	}

}
