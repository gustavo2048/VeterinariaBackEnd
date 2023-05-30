package com.ohMyDog.OhMyDog.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Paseador;
import com.ohMyDog.OhMyDog.Entity.Usuario;

public interface PaseadorRepository extends CrudRepository<Paseador, Integer>{

	@Query
	(value="SELECT * FROM paseador p WHERE p.email = ?1",nativeQuery=true)
	public Paseador buscarPaseadorXEmail(String email);
}
