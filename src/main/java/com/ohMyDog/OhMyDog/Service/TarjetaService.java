package com.ohMyDog.OhMyDog.Service;

import java.sql.Date;

import com.ohMyDog.OhMyDog.Entity.Tarjeta;

public interface TarjetaService {

	public Tarjeta crearTarjeta(Tarjeta tar);
	public Tarjeta buscarTarjetaPorId(int id);
	public Tarjeta buscarTarjetaPorNroT(int nroTarjeta);
	public Tarjeta buscarPorCodigo(int codigo);
	public Tarjeta buscarPorNombre(String nombre);
	public Tarjeta buscarPorFecha(Date fecha);
	
}
