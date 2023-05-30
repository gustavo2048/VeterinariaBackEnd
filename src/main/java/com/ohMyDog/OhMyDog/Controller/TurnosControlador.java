package com.ohMyDog.OhMyDog.Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

import com.ohMyDog.OhMyDog.DTO.TurnosDTO;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Turnos;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.Mail.EmailService;
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
	
	private final EmailService emailService;
	
	@Autowired
	public TurnosControlador(EmailService emailService) {
		this.emailService = emailService;
	}
	
	
	@PostMapping
	@RequestMapping(value="crearTurno", method = RequestMethod.POST )
	public ResponseEntity<?> crearTurno(@RequestBody  TurnosDTO turno){
		//Inicializacion
		Turnos nuevoTurno = new Turnos();
		Date fechaSolicitadaDate;
		List<Turnos> turnosExistentes;
		
		//Verificar fecha inferior a la actual
		Date fechaactual = new Date();
		SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
		String fechaSolicitada = date.format(turno.getFechaSolicitada());
		
		// Verificar si ya solicito turno para la misma mascota el mismo dia
		turnosExistentes = this.turnoService.verificarTurnoExistenteMismoDia(turno.getIdMascota(), turno.getIdUsuarioSolicitante(),turno.getFechaSolicitada());
		
		try {
			fechaSolicitadaDate= date.parse(fechaSolicitada);
			//Verifico si La fecha solicutada es menor a la actual
			if(fechaSolicitadaDate.after(fechaactual)){
				 //Verifico No tenga turnos para el mismo dia misma mascota
				if (turnosExistentes.isEmpty()) {
				
				    // Busca el Usuario con id Usuario
					Usuario user = this.usuarioService.BuscarUsuario(turno.getIdUsuarioSolicitante());
					// Buscar mascota con id mascota
					Mascota pet = this.mascotaService.BuscarMascota(turno.getIdMascota());
					// Crear entity Turno asignando cada atributo
					Turnos turnoSolicitud = new Turnos(turno);
					turnoSolicitud.setMascota(pet);
					turnoSolicitud.setUsuario(user);
					turnoSolicitud.setBorrado(false);
					turnoSolicitud.setEstadoSolicitud("PENDIENTE");
					Date hoy = new Date();
					turnoSolicitud.setFechaCreado(hoy);
					nuevoTurno = turnoService.crearTurno(turnoSolicitud);
				}else {
					 System.out.println("#### Ya dispone de turnos para la mascota en el mismo dia");
					 nuevoTurno.setId(-2);
					 nuevoTurno.setMotivo("Ya dispone de un turno para la misma mascota para la fecha solicitada");
				}
			}else{
			    System.out.println("#### Fecha actual mayor la solicitada");
			    nuevoTurno.setId(-1);
			    nuevoTurno.setMotivo("La fecha enviada no puede ser menor a la actual");
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  //String a date

		return ResponseEntity.status(HttpStatus.CREATED).body(nuevoTurno);
		
	}
	
	
	@GetMapping
	@RequestMapping(value="turnosPendientes/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> getTurnosPendientes(@PathVariable int id){

		List<Turnos> misTurnos = this.turnoService.misTurnosPendientes(id);
		List<TurnosDTO> misTurnosDTO = new ArrayList<TurnosDTO>();
//		for (Turnos turno: misTurnos) {
//			TurnosDTO nuevoT = new TurnosDTO(turno);
//			nuevoT.setMascota(this.mascotaService.BuscarMascota(id));
//			misTurnosDTO.add(nuevoT);
//		}
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(misTurnos);
	}
	
	@PostMapping
	@RequestMapping(value="envioEmail", method = RequestMethod.POST )
	public ResponseEntity<?> envioEmail(@RequestBody String email){
		System.out.println("Ingreso al endPoint");
		
		this.emailService.sendListEmail(email);
		
		return ResponseEntity.status(HttpStatus.ACCEPTED).body("se envio mail?");
	}
	
	
	@GetMapping
	@RequestMapping(value="turnosSolicitados", method = RequestMethod.GET)
	public ResponseEntity<?> turnosSolicitados(){
		List<Turnos> listadoSolicitados = this.turnoService.listadoTurnosSolicitados();
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(listadoSolicitados);
	}

}
