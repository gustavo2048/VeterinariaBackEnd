package com.ohMyDog.OhMyDog.Service;
import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Paseador;

public interface PaseadorService {
	public List<Paseador> listarPaseador();
	public Paseador crearPaseador(Paseador paseador);
	public Paseador modificarPaseador(Paseador paseador);
	public Paseador BuscarPaseador(int id);
	public Paseador buscarPaseadorXEmail(String email);
	public void EliminarPaseador(int id);
}
