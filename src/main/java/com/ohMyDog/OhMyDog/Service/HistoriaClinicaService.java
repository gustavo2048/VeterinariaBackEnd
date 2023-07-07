package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.DTO.HistoriaClinicaDTO;
import com.ohMyDog.OhMyDog.Entity.HistoriaClinica;

public interface HistoriaClinicaService {
	
	public HistoriaClinica crearHistoriaClinica(HistoriaClinica historiaClinica);
	public List<HistoriaClinica> listarHistoriaClinicas();
	
}
