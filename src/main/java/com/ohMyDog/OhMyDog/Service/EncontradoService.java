package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Encontrado;



public interface EncontradoService {
	public List<Encontrado> listarEncontrado();
	public Encontrado crearEncontrado(Encontrado encontrado);
}