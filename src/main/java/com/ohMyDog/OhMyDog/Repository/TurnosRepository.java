package com.ohMyDog.OhMyDog.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Turnos;


public interface TurnosRepository extends CrudRepository<Turnos, Integer> {

	
	@Query(value = "SELECT * FROM turno t WHERE t.mascota_id= ?1 and t.usuario_id = ?2 and t.fecha_solicitada = ?3 ", nativeQuery = true)
	public List<Turnos> verificarTurnoExistenteMismoDia(int idMascota,int idUsuario, Date fechaSolicitud); 
	
	@Query(value = "SELECT * FROM turno t WHERE (t.estado_solicitud = 'PENDIENTE' or t.estado_solicitud = 'CONFIRMADO')  and usuario_id = ?1", nativeQuery = true)
	public List<Turnos> misTurnosPendientes(int id);
}
