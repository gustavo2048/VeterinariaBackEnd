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
import com.ohMyDog.OhMyDog.DTO.UsuarioDTO;
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
		@RequestMapping(value="traerPaseador", method= RequestMethod.GET)
		public ResponseEntity<?> traerPaseador(int id){
			Paseador paseador= this.paseadorService.BuscarPaseador(id);
			return ResponseEntity.ok(paseador);
					
		}
		@GetMapping
		@RequestMapping(value="listarPaseador", method = RequestMethod.GET )
		public ResponseEntity<?> listarPaseador(){
			List<Paseador> listadoPaseador = this.paseadorService.listarPaseador();
			return ResponseEntity.ok(listadoPaseador);
		}

		@PostMapping
		@RequestMapping(value="agregarPaseador", method = RequestMethod.POST )
		public ResponseEntity<?> agregarPaseador(@RequestBody Paseador user){
			Paseador u = this.paseadorService.buscarPaseadorXEmail(user.getEmail());
			System.out.print(u);
			if(u == null) {
				Paseador user2 = this.paseadorService.crearPaseador(user);//crea usuario y lo devuelve
				return ResponseEntity.ok(user2);}
			else {
				if(u.getEmail().equals(user.getEmail()))
					
					u.setId(-1);// el email existe entonces lo seteo en -1 al id
					return ResponseEntity.ok(u);
			}
		
		}

}

