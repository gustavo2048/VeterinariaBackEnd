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

import com.ohMyDog.OhMyDog.Entity.Encontrado;
import com.ohMyDog.OhMyDog.Entity.Perdido;
import com.ohMyDog.OhMyDog.ServiceIMPL.perdidoServiceIMPL;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("perdido")
public class PerdidoControlador {
	
	@Autowired
	private perdidoServiceIMPL perdidoService;
	
	@PostMapping
	@RequestMapping(value="crearPerdido", method = RequestMethod.POST )
	public ResponseEntity<?> crearPerdido(@RequestBody Perdido perdido){
		Perdido nuevaPerdido = perdidoService.crearPerdido(perdido);		
	
		System.out.println("lskdlsdklsk");
		
		///FALTA RELACIONARLO CON EL USUARIO
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevaPerdido);
	}


	@GetMapping
	@RequestMapping(value="listarPerdido", method = RequestMethod.GET )
	public ResponseEntity<?> listarPerdido(){
		List<Perdido> listadoPerdido = this.perdidoService.listarPerdido();
		return ResponseEntity.ok(listadoPerdido);
	}
	
	@GetMapping
	@RequestMapping(value="listarPerdidoMias/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> listarPerdidoMias(@PathVariable int id){
		List<Perdido> listadoPerdidoMias = this.perdidoService.listarPerdidoMias(id);
		return ResponseEntity.ok(listadoPerdidoMias);
	}
	
	@GetMapping
	@RequestMapping(value="listarPerdidoAjenas/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> listarPerdidoAjenas(@PathVariable int id){
		List<Perdido> listadoPerdidoMias = this.perdidoService.listarPerdidoAjenas(id);
		return ResponseEntity.ok(listadoPerdidoMias);
	}
	@PostMapping
	@RequestMapping(value="modificarPerdido", method = RequestMethod.POST )
	public ResponseEntity<?> modificarPerdido(@RequestBody Perdido perdido){	
		Perdido perdido2 = this.perdidoService.modificarPerdido(perdido);		
		return ResponseEntity.ok(perdido2);
	}

}
