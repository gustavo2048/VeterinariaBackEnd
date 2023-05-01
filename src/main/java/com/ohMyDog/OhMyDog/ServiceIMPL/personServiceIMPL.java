package com.ohMyDog.OhMyDog.ServiceIMPL;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohMyDog.OhMyDog.Entity.Cliente;
import com.ohMyDog.OhMyDog.Repository.ClienteRepository;
import com.ohMyDog.OhMyDog.Service.PersonaService;

@Service
public class personServiceIMPL implements PersonaService {

	@Autowired
	private ClienteRepository repo;
	
	
	@Override
	public List<Cliente> consultarClientes() {
		// TODO Auto-generated method stub
		return (List<Cliente>)this.repo.findAll();
	}

	@Override
	public Cliente crearCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		cliente.setEmail( cliente.getEmail());
		return this.repo.save(cliente);
	}

	@Override
	public Cliente modificarCliente(Cliente cliente) {
		// TODO Auto-generated method stub
		return this.repo.save(cliente);
	}

	@Override
	public Cliente BuscarCliente(int id) {
		// TODO Auto-generated method stub
		return this.repo.findById(id).get();
	}

	@Override
	public void EliminarCliente(int id) {
		// TODO Auto-generated method stub
		this.repo.deleteById(id);
	}

	
}
