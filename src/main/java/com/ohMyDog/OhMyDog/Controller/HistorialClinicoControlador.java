package com.ohMyDog.OhMyDog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.DTO.HistoriaClinicaDTO;
import com.ohMyDog.OhMyDog.Entity.HistoriaClinica;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Turnos;
import com.ohMyDog.OhMyDog.Entity.Vacunas;
import com.ohMyDog.OhMyDog.ServiceIMPL.historiaClinicaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.turnoServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.vacunaServiceIMPL;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("historiaClinica")
public class HistorialClinicoControlador {

	@Autowired
	private mascotaServiceIMPL mascotaService;
	
	@Autowired
	private vacunaServiceIMPL vacunaService;
	
	@Autowired
	private historiaClinicaServiceIMPL historiaClinicaService;
	
	@Autowired
	private turnoServiceIMPL turnoService;
	
	
	@PostMapping
	@RequestMapping(value="crearHistoriaClinica", method = RequestMethod.POST )
	public ResponseEntity<?> crearhistoriaClinica(@RequestBody HistoriaClinicaDTO historiaClinica){
		//Creo la historia Clinica de la mascota
		HistoriaClinica nuevaHC = new HistoriaClinica(historiaClinica);
		Mascota hcMascota = mascotaService.BuscarMascota(historiaClinica.getIdMascota());
		nuevaHC.setMascota(hcMascota);
		
		Vacunas nuevaVacuna = new Vacunas(historiaClinica.getVacuna());
		Vacunas creada = this.vacunaService.crearVacuna(nuevaVacuna);
		
		nuevaHC.setVacuna(creada);
		
		HistoriaClinica completaHC = this.historiaClinicaService.crearHistoriaClinica(nuevaHC);
		
		// Doy por realizado el turno
		
		Turnos turnoRealizado = this.turnoService.buscarTurno(historiaClinica.getIdTurno());
		turnoRealizado.setEstadoSolicitud("ATENDIDO");
		turnoService.modificarTurno(turnoRealizado);
		
		
		return ResponseEntity.status(HttpStatus.CREATED).body(completaHC);
	}
	
}
