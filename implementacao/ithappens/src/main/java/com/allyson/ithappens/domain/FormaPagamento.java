package com.allyson.ithappens.domain;


import javax.persistence.Entity;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class FormaPagamento extends ABase<FormaPagamento> {

	private static final long serialVersionUID = 1L;
	
	private String Nome;
	
	public FormaPagamento(){
		
	}
	
	public FormaPagamento(Integer id, String nome) {
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