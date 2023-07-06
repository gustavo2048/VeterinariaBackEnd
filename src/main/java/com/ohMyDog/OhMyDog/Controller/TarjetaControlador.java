	package com.ohMyDog.OhMyDog.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ohMyDog.OhMyDog.DTO.AdopcionDTO;
import com.ohMyDog.OhMyDog.DTO.TarjetaDTO;
import com.ohMyDog.OhMyDog.Entity.Adopcion;
import com.ohMyDog.OhMyDog.Entity.Mascota;
import com.ohMyDog.OhMyDog.Entity.Tarjeta;
import com.ohMyDog.OhMyDog.Entity.Usuario;
import com.ohMyDog.OhMyDog.ServiceIMPL.adopcionServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.tarjetaServiceIMPL;
import com.ohMyDog.OhMyDog.ServiceIMPL.usuarioServiceIMPL;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("tarjeta")
public class TarjetaControlador {

	@Autowired
	private tarjetaServiceIMPL tarjetaService;
	
	@Autowired
	private usuarioServiceIMPL usuarioService;
	
	@PostMapping
	@RequestMapping(value="crearTarjeta", method = RequestMethod.POST )
	public ResponseEntity<?> crearTarjeta(@RequestBody TarjetaDTO tarjeta){
		Tarjeta nuevaTarjeta = new Tarjeta(tarjeta);	
		Tarjeta sistemaTarjeta = tarjetaService.buscarTarjetaPorNroT(nuevaTarjeta.getNroTarjeta());
		if(sistemaTarjeta != null) {
			System.out.print(sistemaTarjeta.getFecha());
			System.out.print(" ");
			//System.out.print(nuevaTarjeta.getFecha().getDate() + 1 );
			nuevaTarjeta.getFecha().setDate(nuevaTarjeta.getFecha().getDate() + 1);
			System.out.print("");
			System.out.print(nuevaTarjeta.getFecha());
			System.out.print("");
			
			System.out.print(sistemaTarjeta.getFecha().compareTo(nuevaTarjeta.getFecha()));
			if(sistemaTarjeta.getFecha().compareTo(nuevaTarjeta.getFecha()) == -1){
				if(sistemaTarjeta.getCodigo() == nuevaTarjeta.getCodigo()) {
					if(sistemaTarjeta.getMonto() != 0) {
						if(sistemaTarjeta.getMonto() >= nuevaTarjeta.getMonto()) {
							sistemaTarjeta.setMonto(sistemaTarjeta.getMonto()-nuevaTarjeta.getMonto());
							if(nuevaTarjeta.getUsuarioId() != -1) {
								Usuario user = usuarioService.BuscarUsuario(nuevaTarjeta.getUsuarioId());
								user.setMontoDescuento(user.getMontoDescuento()+nuevaTarjeta.getMonto()*0.2);}
							return ResponseEntity.status(HttpStatus.CREATED).body(tarjetaService.crearTarjeta(sistemaTarjeta));
							
						}
						else {
							Tarjeta t= new Tarjeta(tarjeta);
							t.setId(-4); //monto insuficiente
							return ResponseEntity.ok(t);
						}
					}else {
						Tarjeta t= new Tarjeta(tarjeta);
						t.setId(-3); //monto cero
						return ResponseEntity.ok(t);
					}
				}
				else {
					Tarjeta t= new Tarjeta(tarjeta);
					t.setId(-2); //codigo distinto
					return ResponseEntity.ok(t);
				}
			}
			else {
				Tarjeta t= new Tarjeta(tarjeta);
				t.setId(-1); //fechas distintas
				return ResponseEntity.ok(t);
			}
		}
	else {
			Tarjeta t= new Tarjeta(tarjeta);
			t.setId(-5); //nro de tarjetas distintos
			return ResponseEntity.ok(t);
		}
				
		}
}
