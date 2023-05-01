package com.ohMyDog.OhMyDog.VO;

import com.ohMyDog.OhMyDog.entity.Mascota;
import com.ohMyDog.OhMyDog.entity.Usuario;

public class registrarseVO {
	
	Usuario usuario;
	Mascota mascota;
	
	
	
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Mascota getMascota() {
		return mascota;
	}
	public void setMascota(Mascota mascota) {
		this.mascota = mascota;
	}

}
