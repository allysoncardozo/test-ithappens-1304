package com.allyson.ithappens.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Produto extends ABase<Produto> {

	private static final long serialVersionUID = 1L;
	
	private String Nome;
	private Double Valor;
	private String CodigoDeBarras;
	
	/*
	@JsonBackReference
	@OneToMany(mappedBy = "Produto")
	private List<ItensPedido> ItensPedido = new ArrayList<ItensPedido>();	
    */
	
	public Produto(){
		
	}

	public Produto(Integer id, String nome, Double valor, String codigoDeBarras) {
		super();
		super.setId(id);
		
		CodigoDeBarras = codigoDeBarras;
		Nome = nome;
		Valor = valor;
	}
/*
	public List<ItensPedido> getItensPedido() {
		return ItensPedido;
	}

	public void setItensPedido(List<ItensPedido> itensPedido) {
		ItensPedido = itensPedido;
	}*/

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getCodigoDeBarras() {
		return CodigoDeBarras;
	}

	public void setCodigoDeBarras(String codigoDeBarras) {
		CodigoDeBarras = codigoDeBarras;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}
	
}