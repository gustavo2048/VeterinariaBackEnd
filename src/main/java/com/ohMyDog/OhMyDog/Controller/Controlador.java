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

import com.ohMyDog.OhMyDog.Entity.Cliente;
import com.ohMyDog.OhMyDog.Service.PersonaServiceIMPL.personServiceIMPL;

@RestController
@RequestMapping("CRUD")
public class Controlador {

	@Autowired
	private personServiceIMPL impl;
	
	
	@GetMapping
	@RequestMapping(value="consultarClientes", method = RequestMethod.GET )
	public ResponseEntity<?> consultarClientes(){
		List<Cliente> listadoClientes = this.impl.consultarClientes();
		return ResponseEntity.ok(listadoClientes);
	}
	
	@PostMapping
	@RequestMapping(value="crearCliente", method = RequestMethod.POST )
	public ResponseEntity<?> crearCliente(@RequestBody Cliente cliente){
		Cliente clienteCreado = this.impl.crearCliente(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteCreado);
	}
	
	@PutMapping
	@RequestMapping(value="modificarCliente", method = RequestMethod.PUT )
	public ResponseEntity<?> modificarCliente(@RequestBody Cliente cliente){
		Cliente clienteModificado = this.impl.crearCliente(cliente);
		return ResponseEntity.status(HttpStatus.CREATED).body(clienteModificado);
	}
	
	@GetMapping
	@RequestMapping(value="buscarCliente/{id}", method = RequestMethod.GET )
	public ResponseEntity<?> buscarCliente(@PathVariable int id ){
		Cliente cliente = this.impl.BuscarCliente(id);
		return ResponseEntity.ok(cliente);
	}
	
	@DeleteMapping
	@RequestMapping(value="eliminarCliente/{id}", method = RequestMethod.DELETE )
	public ResponseEntity<?> eliminarCliente(@PathVariable int id ){
		this.impl.EliminarCliente(id);
		return ResponseEntity.ok().build();
	}
	
	
}
