package com.allyson.ithappens.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Estoque extends ABase<Estoque> {

	private static final long serialVersionUID = 1L;
	
	private Integer Quantidade;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="ProdutoId")	
	private Produto Produto;
	
	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="FilialId")	
	private Filial Filial;
	
	public Estoque(){
		
	}

	public Estoque(Integer id, Integer quantidade, Produto produto, Filial filial) {
		super();
		super.setId(id);
		Quantidade = quantidade;
		Produto = produto;
		Filial = filial;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}

	public Produto getProduto() {
		return Produto;
	}

	public void setProduto(Produto produto) {
		Produto = produto;
	}

	public Filial getFilial() {
		return Filial;
	}

	public void setFilial(Filial filial) {
		Filial = filial;
	}
}