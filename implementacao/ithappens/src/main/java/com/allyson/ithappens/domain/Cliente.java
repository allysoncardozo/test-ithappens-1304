package com.allyson.ithappens.domain;


import javax.persistence.Entity;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class Cliente extends ABase<Cliente> {

	private static final long serialVersionUID = 1L;

	private String Nome;
	
	public Cliente(){
		
	}


	public Cliente(Integer id, String nome) {
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