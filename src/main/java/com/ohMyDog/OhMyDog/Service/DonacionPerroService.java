package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.DonacionPerro;


public interface DonacionPerroService {
	public List<DonacionPerro> listarDonacionPerro();
	public DonacionPerro crearDonacionPerro(DonacionPerro encontrado);
	public DonacionPerro modificarDonacionPerro(DonacionPerro encontrado);
}
