package com.ohMyDog.OhMyDog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.ohMyDog.OhMyDog.Entity.Perdido;

public interface PerdidoRepository extends CrudRepository<Perdido, Integer>{
	@Query(value = "SELECT * FROM `perdido` a WHERE a.usuario_id = ?1", nativeQuery = true)
	public List<Perdido> listarPerdidoMias(int id);
	
	@Query(value = "SELECT * FROM `perdido` a WHERE a.usuario_id != ?1", nativeQuery = true)
	public List<Perdido> listarPerdidoAjenas(int id);
}
