package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.HistoriaClinica;
import com.ohMyDog.OhMyDog.Repository.HistoriaClinicaRepository;
import com.ohMyDog.OhMyDog.Service.HistoriaClinicaService;

@Service
public class historiaClinicaServiceIMPL implements HistoriaClinicaService {

	@Autowired
	private HistoriaClinicaRepository repo;
	
	
	@Override
	public HistoriaClinica crearHistoriaClinica(HistoriaClinica historiaClinica) {
		return this.repo.save(historiaClinica);
	}

	@Override
	public List<HistoriaClinica> listarHistoriaClinicas() {
		return (List<HistoriaClinica>)this.repo.findAll();
	}

}
