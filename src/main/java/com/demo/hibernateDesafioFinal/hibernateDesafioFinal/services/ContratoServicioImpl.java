package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.Contrato;
import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.ContratoDaoI;

@Service
public class ContratoServicioImpl implements ContratoServicioI{

	@Autowired
	private ContratoDaoI contratoDao;
	
	@Override
	public void insertarContrato(Contrato contrato) {
		contratoDao.insertar(contrato);
		
	}

	@Override
	public Contrato findById(Long idContrato) {
		
		return contratoDao.findById(idContrato);
	}

	@Override
	public List<Contrato> findAll() {
		
		return contratoDao.findAll();
	}

	@Override
	public void delete(Contrato contrato) {
		contratoDao.delete(contrato);
		
	}

	@Override
	public void update(Contrato contrato) {
		contratoDao.update(contrato);
		
	}

}
