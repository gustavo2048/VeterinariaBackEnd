package com.ohMyDog.OhMyDog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Usuario;

public interface UsuarioRepositoty extends CrudRepository<Usuario, Integer>{

	@Query
	(value="SELECT * FROM usuario u WHERE u.email = ?1",nativeQuery=true)
	public Usuario buscarUsuarioEmail(String email);
	
	@Query
	(value="SELECT * FROM usuario u WHERE u.dni = ?1",nativeQuery=true)
	public Usuario  buscarUsuarioDni(String dni);

}
