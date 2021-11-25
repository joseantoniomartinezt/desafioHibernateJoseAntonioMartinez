package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.services;

import java.util.List;

import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.Cliente;

public interface ClienteServicioI {

	void insertarCliente(Cliente cliente);
	
	Cliente findById(Long idCliente);
	
	List<Cliente> findAll();
	
	void delete(Cliente cliente);
	
	void update(Cliente cliente);
	
	List<Cliente> findByFullName(String nombre,String primerApellido,String segundoApellido);
	
	
}
