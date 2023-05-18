package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.DTO.MascotaDTO;
import com.ohMyDog.OhMyDog.Entity.Mascota;

public interface MascotaService {

	public List<Mascota> consultarMascotas();
	public Mascota crearMascota(Mascota mascota);
	public Mascota modificarMascota(Mascota mascota);
	public Mascota BuscarMascota(int id);
	public void EliminarMascota(int id);
	
	
	public List<Mascota> consultarMascotasPorIdDuenio(int id);
}
