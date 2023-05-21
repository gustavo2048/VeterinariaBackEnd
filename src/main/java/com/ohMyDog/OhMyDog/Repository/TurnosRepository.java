package com.ohMyDog.OhMyDog.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Turnos;


public interface TurnosRepository extends CrudRepository<Turnos, Integer> {

	
	@Query(value = "SELECT * FROM turno t WHERE t.id_mascota= ?1 and t.id_usuario_solicitante = ?2 and t.fecha_solicitada = ?3 ", nativeQuery = true)
	public List<Turnos> verificarTurnoExistenteMismoDia(int idMascota,int idUsuario, Date fechaSolicitud); 
}
