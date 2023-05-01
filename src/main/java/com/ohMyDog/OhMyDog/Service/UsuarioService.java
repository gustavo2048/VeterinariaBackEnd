package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Usuario;


public interface UsuarioService {

	public List<Usuario> consultarUsuarios();
	public Usuario crearUsuario(Usuario usuario);
	public Usuario modificarUsuario(Usuario usuario);
	public Usuario BuscarUsuario(int id);
	public void EliminarUsuario(int id);
	
}
