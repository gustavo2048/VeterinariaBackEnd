package com.ohMyDog.OhMyDog.Controller;

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

import com.ohMyDog.OhMyDog.DTO.MascotaDTO;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("mascota")
public class MascotaControlador {
	
	@Autowired
	private mascotaServiceIMPL mascotaService;
	
	@PostMapping
	@RequestMapping(value="crearMascota", method = RequestMethod.POST )
	public ResponseEntity<?> crearMascota(@RequestBody MascotaDTO mascota){
		Mascota mascotaCreada = this.mascotaService.crearMascota(mascota);
		return ResponseEntity.status(HttpStatus.CREATED).body(mascotaCreada);
	}
	
	@GetMapping
	@RequestMapping(value="consultarMascotas", method = RequestMethod.GET )
	public ResponseEntity<?> consultarMascotas(){
		List<Mascota> listadoMascotas = this.mascotaService.consultarMascotas();
		return ResponseEntity.ok(listadoMascotas);
	}
	
	@GetMapping
	@RequestMapping(value="consultarMascotasPorIdDuenio/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> consultarMascotarPorIdDuenio(@PathVariable int id ){
		List<Mascota> listadoMascotas = this.mascotaService.consultarMascotasPorIdDuenio(id);
		return ResponseEntity.ok(listadoMascotas);
	}

}
