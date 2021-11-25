package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities;

import java.util.List;

public interface ContratoDaoI {

	void insertar (Contrato contrato);
	
	Contrato findById(Long idContrato);
	
	List<Contrato> findAll();
	
	void delete(Contrato contrato);
	
	void update(Contrato contrato);
}
