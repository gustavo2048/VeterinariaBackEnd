package com.ohMyDog.OhMyDog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.DTO.TurnosDTO;
import com.ohMyDog.OhMyDog.Entity.Turnos;
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.turnoServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.usuarioServiceIMPL;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("turnos")
public class TurnosControlador {
	
	@Autowired
	private turnoServiceIMPL turnoService;
	
	@Autowired
	private usuarioServiceIMPL usuarioService;
	
	@Autowired
	private mascotaServiceIMPL mascotaService;
	
	@PostMapping
	@RequestMapping(value="crearTurno", method = RequestMethod.POST )
	public ResponseEntity<?> crearTurno(@RequestBody  TurnosDTO turno){
		//TODO: Recibo un turnoDTO con los datos de solicitud, id Usuario y id Mascota
		// Busca el Usuario con id Usuario
		// Buscar mascota con id mascota
		// Crear entity Turno asignando cada atributo
		
		//EJEMPLO:::
		List<Turnos> lisT = this.turnoService.listarTurnos();
		System.out.println("consola de mostrar alfakjslKSDJF");
		return ResponseEntity.status(HttpStatus.CREATED).body(lisT);
		
	}

}
