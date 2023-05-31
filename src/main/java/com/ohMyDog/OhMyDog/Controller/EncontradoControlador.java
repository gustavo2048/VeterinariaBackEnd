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

import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Encontrado;
import com.ohMyDog.OhMyDog.ServiceIMPL.encontradoServiceIMPL;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("encontrado")
public class EncontradoControlador {
	
	@Autowired
	private encontradoServiceIMPL encontradoService;
	
	@PostMapping
	@RequestMapping(value="crearEncontrado", method = RequestMethod.POST )
	public ResponseEntity<?> crearEncontrado(@RequestBody Encontrado encontrado){
		Encontrado nuevaEncontrado = encontradoService.crearEncontrado(encontrado);		
	
		System.out.println("lskdlsdklsk");
		
		///FALTA RELACIONARLO CON EL USUARIO
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevaEncontrado);
	}


	@GetMapping
	@RequestMapping(value="listarEncontrado", method = RequestMethod.GET )
	public ResponseEntity<?> listarEncontrado(){
		List<Encontrado> listadoEncontrado = this.encontradoService.listarEncontrado();
		return ResponseEntity.ok(listadoEncontrado);
	}
	@GetMapping
	@RequestMapping(value="listarEncontradoMias/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> listarEncontradoMias(@PathVariable int id){
		List<Encontrado> listadoEncontradoMias = this.encontradoService.listarEncontradoMias(id);
		return ResponseEntity.ok(listadoEncontradoMias);
	}
	
	@GetMapping
	@RequestMapping(value="listarEncontradoAjenas/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> listarEncotradoAjenas(@PathVariable int id){
		List<Encontrado> listadoEncontradoAjenas = this.encontradoService.listarEncontradoAjenas(id);
		return ResponseEntity.ok(listadoEncontradoAjenas);
	}
	

}
