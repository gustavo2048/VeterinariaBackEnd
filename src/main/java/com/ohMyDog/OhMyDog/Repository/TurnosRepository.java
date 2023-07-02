package com.ohMyDog.OhMyDog.Repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ohMyDog.OhMyDog.Entity.Turnos;


public interface TurnosRepository extends CrudRepository<Turnos, Integer> {

	
	@Query(value = "SELECT * FROM turno t WHERE t.mascota_id= ?1 and t.usuario_id = ?2 and t.fecha_solicitada = ?3 ", nativeQuery = true)
	public List<Turnos> verificarTurnoExistenteMismoDia(int idMascota,int idUsuario, Date fechaSolicitud); 
	
	@Query(value = "SELECT t.id, t.borrado, t.estado_solicitud, t.fecha_asignada, t.fecha_creado,t.fecha_solicitada,t.horario_tentativo,t.motivo, t.mascota_id, t.usuario_id  FROM turno t INNER JOIN mascota m on (t.mascota_id = m.id) WHERE (t.estado_solicitud = 'PENDIENTE' or t.estado_solicitud = 'CONFIRMADO' ) and t.borrado = false and t.usuario_id = ?1 and m.borrado = false ORDER BY t.fecha_creado DESC ", nativeQuery = true)
	public List<Turnos> misTurnosPendientes(int id);
	
	@Query(value = "SELECT * FROM turno t WHERE t.fecha_asignada < ?2 or t.estado_solicitud = 'CANCELADO' or t.estado_solicitud = 'ATENDIDO' and t.borrado = false and usuario_id = ?1 ORDER BY t.fecha_creado DESC ", nativeQuery = true)
	public List<Turnos> misTurnosHistorial(int id,Date FechaActual);
	
	@Query(value= "SELECT * FROM turno t WHERE t.estado_solicitud = 'PENDIENTE' ORDER BY t.fecha_solicitada ASC; ",nativeQuery = true)
	public List<Turnos> turnosPendientes();
	
	@Query(value= "SELECT * FROM turno t WHERE t.estado_solicitud = 'CONFIRMADO' ORDER BY t.fecha_asignada ASC ",nativeQuery = true)
	public List<Turnos> turnosConfirmados();
	
	@Query(value="SELECT * FROM turno t WHERE t.fecha_solicitada =?1 and t.estado_solicitud = 'CONFIRMADO' ", nativeQuery = true)
	public  List<Turnos> confirmadosHoy(Date fechaActual);
	
	@Query(value="SELECT count(*) FROM `turno` t WHERE t.borrado = false AND t.estado_solicitud = 'CONFIRMADO' and fecha_asignada = ?1 ", nativeQuery = true)
	public int turnosDia(Date fechaSolicitada);
	
	@Query(value="SELECT * FROM `turno` t WHERE t.fecha_asignada < ?1 or t.estado_solicitud = 'CANCELADO' or t.estado_solicitud = 'ATENDIDO'", nativeQuery = true)
	public List<Turnos> historialTurnos(Date FechaActual);
	
}
