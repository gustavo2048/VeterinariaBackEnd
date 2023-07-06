package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Cuidador;

public interface CuidadorService {
	public List<Cuidador> listarCuidador();
	public Cuidador crearCuidador(Cuidador cuidador);
	public Cuidador modificarCuidador(Cuidador cuidador);
	public Cuidador BuscarCuidador(int id);
	public Cuidador buscarCuidadorXEmail(String email);
	public void EliminarCuidador(int id);

}
