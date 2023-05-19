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
import com.ohMyDog.OhMyDog.DTO.PaseadorDTO;

import com.ohMyDog.OhMyDog.Entity.Paseador;
import com.ohMyDog.OhMyDog.Entity.Usuario;

import com.ohMyDog.OhMyDog.ServiceIMPL.paseadorServiceIMPL;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("paseador")
public class PaseadorControlador {
	
		@Autowired
		private paseadorServiceIMPL paseadorService;
		
		@PostMapping
		@RequestMapping(value="crearPaseador", method = RequestMethod.POST )
		public ResponseEntity<?> crearPaseador(@RequestBody Paseador paseador){
			Paseador nuevaPaseador = this.paseadorService.crearPaseador(paseador);		
		
			System.out.println("lskdlsdklsk");
			
			///FALTA RELACIONARLO CON EL USUARIO
			//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
			return ResponseEntity.status(HttpStatus.CREATED).body(nuevaPaseador);
		}


		@GetMapping
		@RequestMapping(value="listarPaseador", method = RequestMethod.GET )
		public ResponseEntity<?> listarPaseador(){
			List<Paseador> listadoPaseador = this.paseadorService.listarPaseador();
			return ResponseEntity.ok(listadoPaseador);
		}
		
		

}

