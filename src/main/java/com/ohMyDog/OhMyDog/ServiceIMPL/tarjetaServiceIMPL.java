package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Tarjeta;
import com.ohMyDog.OhMyDog.Repository.TarjetaRepository;
import com.ohMyDog.OhMyDog.Service.TarjetaService;
@Service
public class tarjetaServiceIMPL implements TarjetaService {
	
	@Autowired
	private TarjetaRepository repo;
		
	@Override
	public Tarjeta crearTarjeta(Tarjeta tar) {
		// TODO Auto-generated method stub
		return this.repo.save(tar);		
	}	
	public Tarjeta buscarTarjetaPorId(int id) {
		return this.repo.findById(id).get();
	}
	public Tarjeta buscarTarjetaPorNroT(int nroTarjeta) {
		return this.repo.buscarTarjetaPorNroT(nroTarjeta);
	}
	public Tarjeta buscarPorCodigo(int codigo) {
		return this.repo.buscarPorCodigo(codigo);
	}
	public Tarjeta buscarPorNombre(String nombre) {
		return this.repo.buscarPorNombre(nombre);
	}
	public Tarjeta buscarPorFecha(Date fecha) {
		return this.repo.buscarPorFecha(fecha);
	}

}
