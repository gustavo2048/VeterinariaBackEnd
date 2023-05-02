package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.DTO.MascotaDTO;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;
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
		return (List<Mascota>)this.repo.findAll();
	}

	@Override
	public Mascota crearMascota(MascotaDTO mascota) {
		// TODO Auto-generated method stub
		Mascota nuevaMascota = new Mascota(mascota);
		nuevaMascota.setUsuario(mascota.getUsuario());
		
		return this.repo.save(nuevaMascota);
		
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
