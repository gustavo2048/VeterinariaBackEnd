package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.ohMyDog.OhMyDog.Entity.HistoriaClinica;
import com.ohMyDog.OhMyDog.Entity.Vacunas;
import com.ohMyDog.OhMyDog.Repository.VacunasRepository;
import com.ohMyDog.OhMyDog.Service.VacunaService;

@Service
public class vacunaServiceIMPL implements VacunaService {

	@Autowired
	private VacunasRepository repo;

	@Override
	public Vacunas crearVacuna(Vacunas vacuna) {
		return this.repo.save(vacuna);
	}

	@Override
	public List<Vacunas> listarVacunas() {
		return (List<Vacunas>)this.repo.findAll();
	}
	
	
}
