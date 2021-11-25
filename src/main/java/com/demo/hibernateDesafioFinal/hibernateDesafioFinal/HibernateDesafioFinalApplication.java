package com.demo.hibernateDesafioFinal.hibernateDesafioFinal;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.Cliente;
import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities.Contrato;
import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.services.ClienteServicioI;
import com.demo.hibernateDesafioFinal.hibernateDesafioFinal.services.ContratoServicioI;

@SpringBootApplication
public class HibernateDesafioFinalApplication implements CommandLineRunner{

	@Autowired
	private ClienteServicioI clienteServicio;
	@Autowired
	private ContratoServicioI contratoServicio;
	
	public static void main(String[] args) {
		SpringApplication.run(HibernateDesafioFinalApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cliente cliente = new Cliente();
		cliente.setNombre("Juan");
		cliente.setPrimerApellido("Ortiz");
		cliente.setSegundoApellido("Lorenzo");
		cliente.setNumeroDocumentoIdentiad("75963216P");
		
		clienteServicio.insertarCliente(cliente);
		
		Cliente cliente1 = new Cliente();
		cliente1.setNombre("Pepe");
		cliente1.setPrimerApellido("Reyes");
		cliente1.setSegundoApellido("Castro");
		cliente1.setNumeroDocumentoIdentiad("88263216P");
		
		clienteServicio.insertarCliente(cliente1);
		
		Cliente clienteObtenido = clienteServicio.findById(1L);
		
		System.out.println(clienteObtenido.getNombre());
		
		List<Cliente> listaClientes = clienteServicio.findAll();
		
		for(int ind=0;ind<listaClientes.size();ind++) {
			System.out.println(listaClientes.get(ind).getNombre() + listaClientes.get(ind).getNumeroDocumentoIdentiad());
		}
		
		clienteServicio.delete(cliente1);
		
		cliente.setNombre("Pepe");
		clienteServicio.update(cliente);
		
		listaClientes = clienteServicio.findByFullName("Pepe", "Ortiz", "Lorenzo");
		
		for(int ind=0;ind<listaClientes.size();ind++) {
			System.out.println(listaClientes.get(ind).getNombre() + listaClientes.get(ind).getNumeroDocumentoIdentiad());
		}
		
		Contrato contrato = new Contrato();
		contrato.setFechaVigencia(new Date());
		contrato.setFechaCaducidad(new Date());
		contrato.setPrecio(58.36);
		contrato.setCliente(cliente);
		
		contratoServicio.insertarContrato(contrato);
		
		Contrato contrato1 = new Contrato();
		contrato1.setFechaVigencia(new Date());
		contrato1.setFechaCaducidad(new Date());
		contrato1.setPrecio(79.36);
		contrato1.setCliente(cliente);
		
		contratoServicio.insertarContrato(contrato1);
		
		Contrato contratoObtenido = contratoServicio.findById(1L);
		
		System.out.println(contratoObtenido.getPrecio());
		
		List<Contrato> listaContratos = contratoServicio.findAll();
		
		for(int ind=0;ind<listaContratos.size();ind++) {
			System.out.println(listaContratos.get(ind).getPrecio());
		}
		
		contratoServicio.delete(contrato1);
		
		contrato.setPrecio(15.10);
		
		contratoServicio.update(contrato);
		
		
		
	}

}
