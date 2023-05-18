package com.ohMyDog.OhMyDog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.DTO.MascotaDTO;
import com.ohMyDog.OhMyDog.DTO.UsuarioDTO;
import com.ohMyDog.OhMyDog.Entity.Cliente;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.personServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.usuarioServiceIMPL;

@RestController
@RequestMapping("usuario")
public class Controlador {

	@Autowired
	private personServiceIMPL impl;
	
	@Autowired
	private usuarioServiceIMPL usuarioService;
	
	@Autowired
	private mascotaServiceIMPL mascotaService;
	

	@PostMapping
	@RequestMapping(value="registrarCliente", method = RequestMethod.POST )
	public ResponseEntity<?> crearCliente(@RequestBody UsuarioDTO usuario){
		Usuario nuevoUsuario = usuarioService.crearUsuario(usuario);
		MascotaDTO nuevaMascota = new MascotaDTO(usuario.getMascotas().get(0));
		nuevaMascota.setUsuario(nuevoUsuario);
		System.out.println("lskdlsdklsk");
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);

		
		return ResponseEntity.status(HttpStatus.CREATED).body(nuevaMascota);
	}
		
		
	@DeleteMapping
	@RequestMapping(value="eliminarCliente/{id}", method = RequestMethod.DELETE )
	public ResponseEntity<?> eliminarCliente(@PathVariable int id ){
		this.impl.EliminarCliente(id);
		return ResponseEntity.ok().build();
	}
	
	
}
