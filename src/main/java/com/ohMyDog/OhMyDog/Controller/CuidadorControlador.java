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
import com.ohMyDog.OhMyDog.DTO.CuidadorDTO;
import com.ohMyDog.OhMyDog.DTO.UsuarioDTO;
import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Cuidador;
import com.ohMyDog.OhMyDog.Entity.Usuario;

import com.ohMyDog.OhMyDog.ServiceIMPL.cuidadorServiceIMPL;



@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("cuidador")
public class CuidadorControlador {
	
		@Autowired
		private cuidadorServiceIMPL cuidadorService;
		
		@PostMapping
		@RequestMapping(value="crearCuidador", method = RequestMethod.POST )
		public ResponseEntity<?> crearPaseador(@RequestBody Cuidador cuidador){
			Cuidador nuevaCuidador= this.cuidadorService.crearCuidador(cuidador);		
		
			System.out.println("lskdlsdklsk");
			
			///FALTA RELACIONARLO CON EL USUARIO
			//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
			return ResponseEntity.status(HttpStatus.CREATED).body(nuevaCuidador);
		}

		@GetMapping
		@RequestMapping(value="traerCuidador", method= RequestMethod.GET)
		public ResponseEntity<?> traerCuidador(int id){
			Cuidador cuidador = this.cuidadorService.BuscarCuidador(id);
			return ResponseEntity.ok(cuidador);
					
		}
		@GetMapping
		@RequestMapping(value="listarCuidador", method = RequestMethod.GET )
		public ResponseEntity<?> listarCuidador(){
			List<Cuidador> listadoCuidador = this.cuidadorService.listarCuidador();
			return ResponseEntity.ok(listadoCuidador);
		}
		@PostMapping
		@RequestMapping(value="modificarCuidador", method = RequestMethod.POST )
		public ResponseEntity<?> modificarCuidador(@RequestBody Cuidador cuidador){	
			Cuidador cuid = this.cuidadorService.modificarCuidador(cuidador);		
			return ResponseEntity.ok(cuid);
		}

		@PostMapping
		@RequestMapping(value="agregarCuidador", method = RequestMethod.POST )
		public ResponseEntity<?> agregarCuidador(@RequestBody Cuidador user){
			Cuidador u = this.cuidadorService.buscarCuidadorXEmail(user.getEmail());
			System.out.print(u);
			if(u == null) {
				Cuidador user2 = this.cuidadorService.crearCuidador(user);//crea usuario y lo devuelve
				return ResponseEntity.ok(user2);}
			else {
				if(u.getEmail().equals(user.getEmail()))
					
					u.setId(-1);// el email existe entonces lo seteo en -1 al id
					return ResponseEntity.ok(u);
			}
		
		}

}