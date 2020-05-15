package com.allyson.ithappens.domain;


import javax.persistence.Entity;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class Filial extends ABase<Filial> {

	private static final long serialVersionUID = 1L;
	
	private String Nome;


	public Filial(){
		
	}

	public Filial(Integer id, String nome) {
		super();
		super.setId(id);
		Nome = nome;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
}