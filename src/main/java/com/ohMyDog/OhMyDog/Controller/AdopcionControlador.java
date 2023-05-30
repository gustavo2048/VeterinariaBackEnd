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

///modificar con Adopcion
import com.ohMyDog.OhMyDog.DTO.AdopcionDTO;
import com.ohMyDog.OhMyDog.DTO.MascotaDTO;
import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.adopcionServiceIMPL;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("adopcion")
public class AdopcionControlador {
	
	@Autowired
	private adopcionServiceIMPL adopcionService;
	
	@PostMapping
	@RequestMapping(value="crearAdopcion", method = RequestMethod.POST )
	public ResponseEntity<?> crearAdopcion(@RequestBody Adopcion adopcion){
		Adopcion nuevaAdopcion = adopcionService.crearAdopcion(adopcion);		
	
		System.out.println("lskdlsdklsk");
		
		///FALTA RELACIONARLO CON EL USUARIO
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevaAdopcion);
	}
	
	@PostMapping
	@RequestMapping(value="modificarAdopcion", method = RequestMethod.POST )
	public ResponseEntity<?> modificarMascota(@RequestBody Adopcion adopcion){	
		Adopcion adopcion2 = this.adopcionService.modificarAdopcion(adopcion);		
		return ResponseEntity.ok(adopcion2);
	}


	@GetMapping
	@RequestMapping(value="listarAdopciones", method = RequestMethod.GET )
	public ResponseEntity<?> listarAdopciones(){
		List<Adopcion> listadoAdopcion = this.adopcionService.listarAdopciones();
		return ResponseEntity.ok(listadoAdopcion);
	}
	
	

}
