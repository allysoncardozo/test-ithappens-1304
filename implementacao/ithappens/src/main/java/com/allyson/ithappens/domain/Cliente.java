package com.allyson.ithappens.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Cliente extends ABase<Cliente> {

	private static final long serialVersionUID = 1L;

	private String Nome;
	
	/*
	@JsonBackReference
	@OneToMany(mappedBy = "Cliente")
	private List<PedidoEstoque> PedidoEstoques = new ArrayList<PedidoEstoque>();
	*/
	
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