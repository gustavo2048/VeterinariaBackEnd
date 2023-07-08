package com.ohMyDog.OhMyDog.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.HistoriaClinica;

public interface HistoriaClinicaRepository extends CrudRepository<HistoriaClinica, Integer> {

	@Query(value = "SELECT * FROM historiaclinica h WHERE h.mascota_id = ?1 ", nativeQuery = true)
	public List<HistoriaClinica> listadoHistoriaClinicaMiMascota(int id);
	
	@Query(value = "SELECT * FROM `historiaclinica` WHERE mascota_id = ?1 and (motivo LIKE 'CASTRACION' or motivo LIKE 'DESPARACITACION' or motivo LIKE 'VACUNACION'  )", nativeQuery = true)
	public List<HistoriaClinica> historiaParaLibretaSanitaria(int id);
}
