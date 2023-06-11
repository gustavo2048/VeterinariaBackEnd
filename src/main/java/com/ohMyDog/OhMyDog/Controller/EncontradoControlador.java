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

import com.ohMyDog.OhMyDog.DTO.EncontradoDTO;
import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Encontrado;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.encontradoServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.usuarioServiceIMPL;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("encontrado")
public class EncontradoControlador {
	
	@Autowired
	private encontradoServiceIMPL encontradoService;
	@Autowired
	private mascotaServiceIMPL mascotaService;
	@Autowired
	private usuarioServiceIMPL usuarioService;
	
	@PostMapping
	@RequestMapping(value="crearEncontrado", method = RequestMethod.POST )
	public ResponseEntity<?> crearEncontrado(@RequestBody EncontradoDTO encontrado){
		Mascota mascota1 = mascotaService.BuscarMascota(encontrado.getMascotaId());
		Usuario usuario1 = usuarioService.BuscarUsuario(encontrado.getUsuarioId());
		
		Encontrado nuevaEncontrado = new Encontrado(encontrado); 
			//encontradoService.crearEncontrado(nuevaEncontrado);		
	nuevaEncontrado.setMascota(mascota1);
	nuevaEncontrado.setUsuario(usuario1);
		//System.out.println(encontradoService.crearEncontrado(nuevaEncontrado));
		
		///FALTA RELACIONARLO CON EL USUARIO
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
		return ResponseEntity.status(HttpStatus.CREATED).body(encontradoService.crearEncontrado(nuevaEncontrado));
	}


	@GetMapping
	@RequestMapping(value="listarEncontrado", method = RequestMethod.GET )
	public ResponseEntity<?> listarEncontrado(){
		List<Encontrado> listadoEncontrado = this.encontradoService.listarEncontrado();
		System.out.println("encontro");
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
	
	@PostMapping
	@RequestMapping(value="modificarEncontrado", method = RequestMethod.POST )
	public ResponseEntity<?> modificarEncontrado(@RequestBody Encontrado encontrado){	
		Encontrado encontrado2=this.encontradoService.modificarEncontrado(encontrado);
		return ResponseEntity.ok(encontrado2);
	}
}
