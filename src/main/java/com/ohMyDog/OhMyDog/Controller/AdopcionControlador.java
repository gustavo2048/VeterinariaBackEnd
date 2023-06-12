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
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("adopcion")
public class AdopcionControlador {
	
	@Autowired
	private adopcionServiceIMPL adopcionService;
	
	@Autowired
	private mascotaServiceIMPL mascotaService;
	
	
	@PostMapping
	@RequestMapping(value="crearAdopcion", method = RequestMethod.POST )
	public ResponseEntity<?> crearAdopcion(@RequestBody AdopcionDTO adopcion){
		Adopcion nuevaAdopcion = new Adopcion(adopcion);		
		Mascota mascota = mascotaService.BuscarMascota(adopcion.getMascotaId());
		nuevaAdopcion.setMascota(mascota);
		
		System.out.println("lskdlsdklsk");
		
		///FALTA RELACIONARLO CON EL USUARIO
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
		return ResponseEntity.status(HttpStatus.CREATED).body(adopcionService.crearAdopcion(nuevaAdopcion));
	}
	
	@PostMapping
	@RequestMapping(value="modificarAdopcion", method = RequestMethod.POST )
	public ResponseEntity<?> modificarMascota(@RequestBody Adopcion adopcion){
		System.out.println(adopcion);
		Mascota mascotaCambiar = this.mascotaService.BuscarMascota(adopcion.getMascota().getId());
		mascotaCambiar.setBorrado(true);
		this.mascotaService.modificarMascota(mascotaCambiar);
		Adopcion adopcion2 = this.adopcionService.modificarAdopcion(adopcion);
		
		return ResponseEntity.ok(adopcion2);
	}
	
	@GetMapping
	@RequestMapping(value="listarAdopcionesMias/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> listarAdopcionesMias(@PathVariable int id){
		List<Adopcion> listadoAdopcionMias = this.adopcionService.listarAdopcionesMias(id);
		return ResponseEntity.ok(listadoAdopcionMias);
	}
	
	@GetMapping
	@RequestMapping(value="listarAdopcionesAjenas/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> listarAdopcionesAjenas(@PathVariable int id){
		List<Adopcion> listadoAdopcionAjenas = this.adopcionService.listarAdopcionesAjenas(id);
		return ResponseEntity.ok(listadoAdopcionAjenas);
	}



	@GetMapping
	@RequestMapping(value="listarAdopciones", method = RequestMethod.GET )
	public ResponseEntity<?> listarAdopciones(){
		List<Adopcion> listadoAdopcion = this.adopcionService.listarAdopciones();
		return ResponseEntity.ok(listadoAdopcion);
	}
	

	

}