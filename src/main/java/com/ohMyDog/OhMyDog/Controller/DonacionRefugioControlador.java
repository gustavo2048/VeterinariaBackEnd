package com.ohMyDog.OhMyDog.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.DTO.DonacionPerroDTO;
import com.ohMyDog.OhMyDog.DTO.DonacionRefugioDTO;
import com.ohMyDog.OhMyDog.Entity.DonacionPerro;
import com.ohMyDog.OhMyDog.Entity.DonacionRefugio;
import com.ohMyDog.OhMyDog.ServiceIMPL.donacionPerroServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.donacionRefugioServiceIMPL;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("donacionRefugio")
public class DonacionRefugioControlador {

	@Autowired
	private donacionRefugioServiceIMPL donacionRefugioService;
	
	
	@PostMapping
	@RequestMapping(value="crearDonacionRefugio", method = RequestMethod.POST )
	public ResponseEntity<?> crearDonacionRefugio(@RequestBody DonacionRefugioDTO DonacionPerro){
		//Usuario usuario1 = usuarioService.BuscarUsuario(encontrado.getUsuarioId());
		
		DonacionRefugio nuevaDonacionPerro = new DonacionRefugio(DonacionPerro); 
			//encontradoService.crearEncontrado(nuevaEncontrado);		
	//nuevaEncontrado.setUsuario(usuario1);
		//System.out.println(encontradoService.crearEncontrado(nuevaEncontrado));
		
		///FALTA RELACIONARLO CON EL USUARIO
		//Mascota nuevaMascota2 = this.mascotaService.crearMascota(nuevaMascota);		
		return ResponseEntity.status(HttpStatus.CREATED).body(donacionRefugioService.crearDonacionRefugio(nuevaDonacionPerro));
	}


	@GetMapping
	@RequestMapping(value="listarDonacionRefugio", method = RequestMethod.GET )
	public ResponseEntity<?> listarDonacionRefugio(){
		List<DonacionRefugio> listadoEncontrado = this.donacionRefugioService.listarDonacionRefugio();
		System.out.println("encontro");
		return ResponseEntity.ok(listadoEncontrado);
	}
	
	@PostMapping
	@RequestMapping(value="modificarDonacionRefugio", method = RequestMethod.POST )
	public ResponseEntity<?> modificarDonacionRefugio(@RequestBody DonacionRefugio encontrado){	
		DonacionRefugio encontrado2=this.donacionRefugioService.modificarDonacionRefugio(encontrado);
		return ResponseEntity.ok(encontrado2);
	}
}
