package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Encontrado;



public interface EncontradoService {
	public List<Encontrado> listarEncontrado();
	public Encontrado crearEncontrado(Encontrado encontrado);
	public List<Encontrado> listarEncontradoMias(int id);
	public List<Encontrado> listarEncontradoAjenas(int id);
	public Encontrado modificarEncontrado(Encontrado encontrado);
}
