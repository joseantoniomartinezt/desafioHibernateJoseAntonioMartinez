package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.Cliente;
import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.ClienteDaoI;

@Service
public class ClienteServicioImpl implements ClienteServicioI{

	@Autowired
	private ClienteDaoI clienteDao;
	
	@Override
	public void insertarCliente(Cliente cliente) {
		clienteDao.insertar(cliente);
		
	}
	
	@Override
	public Cliente findById(Long idCliente) {
		
		return clienteDao.findById(idCliente);
	}

	@Override
	public List<Cliente> findAll() {
		
		return clienteDao.findAll();
	}

	@Override
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
		
	}

	@Override
	public void update(Cliente cliente) {
		clienteDao.update(cliente);
		
	}

	@Override
	public List<Cliente> findByFullName(String nombre, String primerApellido, String segundoApellido) {
		
		return clienteDao.findByFullName(nombre, primerApellido, segundoApellido);
	}

}
