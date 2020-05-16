package com.allyson.ithappens.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class Filial extends ABase<Filial> {

	private static final long serialVersionUID = 1L;	
	private String Nome;

	@OneToMany(mappedBy = "Filial")
	private List<Estoque> Estoques = new ArrayList<Estoque>();
	
	
	public Filial(){
		
	}

	
	public Filial(Integer id, String nome) {
		super();
		super.setId(id);
		Nome = nome;
	}

	public List<Estoque> getEstoques() {
		return Estoques;
	}


	public void setEstoques(List<Estoque> estoques) {
		Estoques = estoques;
	}


	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
}