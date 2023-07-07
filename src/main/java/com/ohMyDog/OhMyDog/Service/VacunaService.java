package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Vacunas;

public interface VacunaService {

	public Vacunas crearVacuna(Vacunas vacuna);
	public List<Vacunas> listarVacunas();
	
}
