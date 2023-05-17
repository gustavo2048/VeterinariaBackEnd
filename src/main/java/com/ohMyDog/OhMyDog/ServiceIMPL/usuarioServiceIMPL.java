package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.DTO.UsuarioDTO;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.Repository.UsuarioRepositoty;
import com.ohMyDog.OhMyDog.Service.UsuarioService;

@Service
public class usuarioServiceIMPL implements UsuarioService {

	@Autowired
	private UsuarioRepositoty repo;
	
	@Override
	public List<Usuario> consultarUsuarios() {
		// TODO Auto-generated method stub
		return (List<Usuario>)this.repo.findAll();
	}

	@Override
	public Usuario crearUsuario(UsuarioDTO usuario) {
		// TODO Auto-generated method stub
		Usuario nuevoUsuario = new Usuario(usuario);
		nuevoUsuario.setBorrado(false);
		nuevoUsuario.setVerificado(false);
		return this.repo.save(nuevoUsuario);
	}

	@Override
	public Usuario modificarUsuario(Usuario usuario) {
		// TODO Auto-generated method stub
		return this.repo.save(usuario);
	}

	@Override
	public Usuario BuscarUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void EliminarUsuario(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Usuario buscarUsuarioXEmail(String email) {
		return repo.buscarUsuarioEmail(email);
	}
	@Override
	public Usuario buscarUsuarioDni(String dni) {
		return repo.buscarUsuarioDni(dni);
	}

}
