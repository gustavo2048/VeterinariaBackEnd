package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Perdido;


public interface PerdidoService {
	public List<Perdido> listarPerdido();
	public Perdido crearPerdido(Perdido perdido);
}
