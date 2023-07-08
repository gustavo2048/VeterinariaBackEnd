package com.ohMyDog.OhMyDog.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.DTO.HistoriaClinicaDTO;
import com.ohMyDog.OhMyDog.DTO.LibretaSanitariaDTO;
import com.ohMyDog.OhMyDog.Entity.HistoriaClinica;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Turnos;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.Entity.Vacunas;
import com.ohMyDog.OhMyDog.ServiceIMPL.historiaClinicaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.turnoServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.usuarioServiceIMPL;
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
	
	@Autowired
	private usuarioServiceIMPL usuarioService;
	
	
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

		
		Usuario usuarioActualizar = usuarioService.BuscarUsuario(historiaClinica.getIdUsuario());
		usuarioActualizar.setVerificado(true);
		
		// Evaluar si se aplico descuento y reseteo el contador
		if (historiaClinica.isDescuentoAplicado()) {
			usuarioActualizar.setMontoDescuento(0);
		}
		
		usuarioService.modificarUsuario(usuarioActualizar);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(completaHC);
	}
	
	@GetMapping
	@RequestMapping(value="listadoMiHistoriaClinica/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> getTurnosPendientes(@PathVariable int id){
		
		List<HistoriaClinica> lista = this.historiaClinicaService.listadoHistoriaClinicaMiMascota(id);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(lista);
	}
	
	
	@GetMapping
	@RequestMapping(value="libretaSanitaria/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> getLibretaSanitaria(@PathVariable int id){
		List<LibretaSanitariaDTO> libreta = new ArrayList<LibretaSanitariaDTO>();
		List<HistoriaClinica> listaHistoria = this.historiaClinicaService.listadoHistoriaParaLibretaSanitaria(id);
		
		for (HistoriaClinica historia: listaHistoria) {
			LibretaSanitariaDTO nuevaLibreta = new LibretaSanitariaDTO();
			nuevaLibreta.setMotivo(historia.getMotivo());
			nuevaLibreta.setFechaRealizado(historia.getFechaCreacion());
			nuevaLibreta.setPeso(historia.getPeso());
			
			nuevaLibreta.setTipoVacuna(historia.getVacuna().getTipo());
			if ( historia.getMotivo() == "VACUNACION") {
			}
			nuevaLibreta.setDosis(historia.getVacuna().getDosis());
			if (historia.getMotivo() == "DESPARACITACION") {
			}
			nuevaLibreta.setDescripcion(historia.getVacuna().getDescripcion());
			libreta.add(nuevaLibreta);
			
		}
		//Se devuelve la lista libreta con todos los resusltados obtenidos
		return ResponseEntity.status(HttpStatus.CREATED).body(libreta);
	}
	
	
}
