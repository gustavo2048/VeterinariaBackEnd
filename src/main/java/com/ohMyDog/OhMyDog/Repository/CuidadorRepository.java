package com.ohMyDog.OhMyDog.Repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Cuidador;
import com.ohMyDog.OhMyDog.Entity.Usuario;

public interface CuidadorRepository extends CrudRepository<Cuidador, Integer>{

	@Query
	(value="SELECT * FROM cuidador p WHERE p.email = ?1",nativeQuery=true)
	public Cuidador buscarCuidadorXEmail(String email);
}
