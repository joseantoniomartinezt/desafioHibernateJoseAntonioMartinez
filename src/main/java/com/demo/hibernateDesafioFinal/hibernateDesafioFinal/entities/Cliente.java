package com.demo.hibernateDesafioFinal.hibernateDesafioFinal.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "T_CLIENTE")
public class Cliente {

	private long id;
	private String nombre,primerApellido,segundoApellido,numeroDocumentoIdentiad;
	private List<Contrato> listaContratos;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CLIENT_ID", precision = 15)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name = "NOMBRE",nullable = false)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Column(name = "PRIMER_APELLIDO",nullable = false)
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	
	@Column(name = "SEGUNDO_APELLIDO")
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	
	@Column(name = "DOCUMENTO_IDENTIDAD",nullable = false,unique = true,length = 9)
	public String getNumeroDocumentoIdentiad() {
		return numeroDocumentoIdentiad;
	}
	public void setNumeroDocumentoIdentiad(String numeroDocumentoIdentiad) {
		this.numeroDocumentoIdentiad = numeroDocumentoIdentiad;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "cliente")
	public List<Contrato> getListaContratos() {
		return listaContratos;
	}
	public void setListaContratos(List<Contrato> listaContratos) {
		this.listaContratos = listaContratos;
	}
	
	
	
	
}
