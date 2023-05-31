package com.ohMyDog.OhMyDog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.ohMyDog.OhMyDog.Entity.Encontrado;

public interface EncontradoRepository extends CrudRepository<Encontrado, Integer>{

	@Query(value = "SELECT * FROM `encontrado` a WHERE a.usuario_id = ?1", nativeQuery = true)
	public List<Encontrado> listarEncontradoMias(int id);
	
	@Query(value = "SELECT * FROM `encontrado` a WHERE a.usuario_id != ?1", nativeQuery = true)
	public List<Encontrado> listarEncontradoAjenas(int id);
	
}
