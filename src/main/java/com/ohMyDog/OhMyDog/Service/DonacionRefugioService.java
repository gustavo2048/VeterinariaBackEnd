package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.DonacionRefugio;



public interface DonacionRefugioService {
	public List<DonacionRefugio> listarDonacionRefugio();
	public DonacionRefugio crearDonacionRefugio(DonacionRefugio encontrado);
	public DonacionRefugio modificarDonacionRefugio(DonacionRefugio encontrado);
}
