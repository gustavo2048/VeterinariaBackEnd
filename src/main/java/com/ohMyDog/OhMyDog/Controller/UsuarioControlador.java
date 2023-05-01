package com.ohMyDog.OhMyDog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.usuarioServiceIMPL;

@RestController
@RequestMapping("usuario")
public class UsuarioControlador {

	@Autowired
	private usuarioServiceIMPL usuarioService;
	
	
	@PostMapping
	@RequestMapping(value="crearUsuario", method = RequestMethod.POST )
	public ResponseEntity<?> crearUsuario(@RequestBody Usuario usuario){
		Usuario usuarioCreado = this.usuarioService.crearUsuario(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuarioCreado);
	}
	
	@GetMapping
	@RequestMapping(value="consultarUsuarios", method = RequestMethod.GET )
	public ResponseEntity<?> consultarUsuarios(){
		List<Usuario> listadoUsuarios = this.usuarioService.consultarUsuarios();
		return ResponseEntity.ok(listadoUsuarios);
	}
}
