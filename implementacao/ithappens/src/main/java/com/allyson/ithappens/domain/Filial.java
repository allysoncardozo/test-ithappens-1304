package com.allyson.ithappens.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

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