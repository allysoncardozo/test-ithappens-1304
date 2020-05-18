package com.allyson.ithappens.domain;


import javax.persistence.Entity;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class Produto extends ABase<Produto> {

	private static final long serialVersionUID = 1L;
	
	private String Nome;
	private Double Valor;
	private String CodigoDeBarras;
	
	public Produto(){
		
	}

	public Produto(Integer id, String nome, Double valor, String codigoDeBarras) {
		super();
		super.setId(id);
		
		CodigoDeBarras = codigoDeBarras;
		Nome = nome;
		Valor = valor;
	}


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