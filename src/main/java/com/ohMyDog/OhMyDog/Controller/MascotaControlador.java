package com.ohMyDog.OhMyDog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.DTO.MascotaDTO;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;



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

}
