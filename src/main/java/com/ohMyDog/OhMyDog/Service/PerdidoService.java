package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Encontrado;
import com.ohMyDog.OhMyDog.Entity.Perdido;


public interface PerdidoService {
	public List<Perdido> listarPerdido();
	public Perdido crearPerdido(Perdido perdido);
	public List<Perdido> listarPerdidoMias(int id);
	public List<Perdido> listarPerdidoAjenas(int id);
	public Perdido modificarPerdido(Perdido perdido);
	
}
