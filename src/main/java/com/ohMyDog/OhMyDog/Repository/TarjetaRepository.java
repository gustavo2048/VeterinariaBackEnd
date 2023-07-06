package com.ohMyDog.OhMyDog.Repository;
import java.sql.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.ohMyDog.OhMyDog.Entity.Tarjeta;


public interface TarjetaRepository extends CrudRepository<Tarjeta, Integer> {
	@Query(value = "SELECT * FROM `tarjeta` a WHERE a.nro_tarjeta = ?1", nativeQuery = true)
	public Tarjeta buscarTarjetaPorNroT(int nroTarjeta);
	@Query(value = "SELECT * FROM `tarjeta` a WHERE a.nombre = ?1", nativeQuery = true)
	public Tarjeta buscarPorNombre(String nombre);
	@Query(value = "SELECT * FROM `tarjeta` a WHERE a.fecha = ?1", nativeQuery = true)
	public Tarjeta buscarPorFecha(Date fecha);
	@Query(value = "SELECT * FROM `tarjeta` a WHERE a.codigo = ?1", nativeQuery = true)
	public Tarjeta buscarPorCodigo(int codigo);
}
