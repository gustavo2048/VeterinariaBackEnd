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

import com.ohMyDog.OhMyDog.DTO.DonacionPerroDTO;
import com.ohMyDog.OhMyDog.DTO.EncontradoDTO;
import com.ohMyDog.OhMyDog.Entity.DonacionPerro;
import com.ohMyDog.OhMyDog.Entity.Encontrado;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.donacionPerroServiceIMPL;

import com.ohMyDog.OhMyDog.ServiceIMPL.mascotaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.usuarioServiceIMPL;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("donacionPerro")
public class DonacionPerroControlador {

	@Autowired
	private donacionPerroServiceIMPL donacionPerroService;
	
	
	@PostMapping
	@RequestMapping(value="crearDonacionPerro", method = RequestMethod.POST )
	public ResponseEntity<?> crearDonacionPerro(@RequestBody DonacionPerroDTO DonacionPerro){
		//Usuario usuario1 = usuarioService.BuscarUsuario(encontrado.getUsuarioId());
		
		DonacionPerro nuevaDonacionPerro = new DonacionPerro(DonacionPerro); 
		//nuevaDonacionPerro.getFechaLimite().setDate(nuevaDonacionPerro.getFechaLimite().getDate() + 1);
			//encontradoService.crearEncontrado(nuevaEncontrado);		
	//nuevaEncontrado.setUsuario(usuario1);
		//System.out.println(encontradoService.crearEncontrado(nuevaEncontrado));
		
		///FALTA RELACIONARLO CON EL USUARIO
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
		return ResponseEntity.status(HttpStatus.CREATED).body(donacionPerroService.crearDonacionPerro(nuevaDonacionPerro));
	}


	@GetMapping
	@RequestMapping(value="listarDonacionPerro", method = RequestMethod.GET )
	public ResponseEntity<?> listarDonacionPerro(){
		List<DonacionPerro> listadoEncontrado = this.donacionPerroService.listarDonacionPerro();
		System.out.println("encontro");
		return ResponseEntity.ok(listadoEncontrado);
	}
	
	@PostMapping
	@RequestMapping(value="modificarDonacionPerro", method = RequestMethod.POST )
	public ResponseEntity<?> modificarDonacionPerro(@RequestBody DonacionPerro encontrado){	
		DonacionPerro encontrado2=this.donacionPerroService.modificarDonacionPerro(encontrado);
		// encontrado2.getFechaLimite().setDate(encontrado.getFechaLimite().getDate() + 1);
		return ResponseEntity.ok(encontrado2);
	}
}
