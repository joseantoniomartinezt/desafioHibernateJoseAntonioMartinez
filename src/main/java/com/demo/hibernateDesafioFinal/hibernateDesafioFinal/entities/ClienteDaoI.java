package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities;

import java.util.List;



public interface ClienteDaoI {
	
	void insertar (Cliente cliente);
	
	Cliente findById(Long idCliente);
	
	List<Cliente> findAll();
	
	void delete(Cliente cliente);
	
	void update(Cliente cliente);
	
	List<Cliente> findByFullName(String nombre,String primerApellido,String segundoApellido);

}
