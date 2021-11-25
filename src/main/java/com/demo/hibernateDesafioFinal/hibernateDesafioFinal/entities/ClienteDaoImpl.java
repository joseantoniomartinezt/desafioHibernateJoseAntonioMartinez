package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities;



import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;





@Repository
public class ClienteDaoImpl implements ClienteDaoI{

	@Autowired
	EntityManager entityManager;
	
	@Override
	@Transactional
	public void insertar(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		session.save(cliente);
		
		session.close();
		
	}

	@Override
	@Transactional
	public Cliente findById(Long idCliente) {
		Session session = entityManager.unwrap(Session.class);
		
		Cliente cliente = (Cliente)session.createQuery("FROM Cliente WHERE id="+idCliente).uniqueResult();
		
		session.close();
		
		return cliente;
	}

	@Override
	@Transactional
	public List<Cliente> findAll() {
		Session session = entityManager.unwrap(Session.class);
		
		List<Cliente> listaClientes = session.createQuery("FROM Cliente").getResultList();
		
		return listaClientes;
	}

	@Override
	@Transactional
	public void delete(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		entityManager.remove(entityManager.merge(cliente));
		
		session.close();
		
	}

	@Override
	@Transactional
	public void update(Cliente cliente) {
		Session session = entityManager.unwrap(Session.class);
		
		session.saveOrUpdate(cliente);
		
		session.close();
		
	}


	@Override
	@Transactional
	public List<Cliente> findByFullName(String nombre, String primerApellido, String segundoApellido) {
		Session session = entityManager.unwrap(Session.class);
		
		List<Cliente> listaClientes = session.createQuery("From Cliente WHERE nombre='" + nombre + "'AND primer_apellido='" + primerApellido + "'AND segundo_apellido='" + segundoApellido + "'").getResultList();
		
		session.close();
		
		return listaClientes;
	}

}
