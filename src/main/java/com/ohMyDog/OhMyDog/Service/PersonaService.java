package com.ohMyDog.OhMyDog.Service;

import java.util.List;

import com.ohMyDog.OhMyDog.Entity.Cliente;

public interface PersonaService {

	public List<Cliente> consultarClientes();
	public Cliente crearCliente(Cliente cliente);
	public Cliente modificarCliente(Cliente cliente);
	public Cliente BuscarCliente(int id);
	public void EliminarCliente(int id);
}
