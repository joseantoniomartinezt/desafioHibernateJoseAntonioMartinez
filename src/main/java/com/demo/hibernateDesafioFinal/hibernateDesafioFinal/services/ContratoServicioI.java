package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.services;

import java.util.List;

import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.Cliente;
import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.Contrato;

public interface ContratoServicioI {

	void insertarContrato(Contrato contrato);
	
	Contrato findById(Long idContrato);
	
	List<Contrato> findAll();
	
	void delete(Contrato contrato);
	
	void update(Contrato contrato);
}
