package com.ohMyDog.OhMyDog.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Mascota;

public interface MascotaRepository extends CrudRepository<Mascota, Integer> {
	
	@Query(value = "SELECT * FROM mascota m WHERE m.usuario_id = ?1 and m.borrado = false", nativeQuery = true)
	List<Mascota> consultarMascotasPorIdDuenio(int id); 
	
	

}
