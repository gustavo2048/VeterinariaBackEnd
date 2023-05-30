package com.ohMyDog.OhMyDog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.ohMyDog.OhMyDog.Entity.Adopcion;


public interface AdopcionRepository extends CrudRepository<Adopcion, Integer>{
	
	
	@Query(value = "SELECT * FROM `adopcion` a WHERE a.usuario_id = ?1", nativeQuery = true)
	public List<Adopcion> listarAdopcionesMias(int id);
	
	@Query(value = "SELECT * FROM `adopcion` a WHERE a.usuario_id != ?1", nativeQuery = true)
	public List<Adopcion> listarAdopcionesAjenas(int id);
	
}
