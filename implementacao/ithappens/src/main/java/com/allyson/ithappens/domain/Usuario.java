package com.allyson.ithappens.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Usuario extends ABase<Usuario> {

	private static final long serialVersionUID = 1L;
	
	private String Nome;
	private String Senha;

	
	/*
	@JsonBackReference
    @JsonIgnore
	@OneToMany(mappedBy = "Usuario")
	private List<PedidoEstoque> PedidoEstoques = new ArrayList<PedidoEstoque>();
	*/
	public Usuario(){
		
	}

	public Usuario(Integer id, String nome, String senha) {
		super();
		super.setId(id);
		Nome = nome;
		Senha = senha;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}


	public String getSenha() {
		return Senha;
	}


	public void setSenha(String senha) {
		Senha = senha;
	}
	
/*
	public List<PedidoEstoque> getPedidoEstoques() {
		return PedidoEstoques;
	}

	public void setPedidoEstoques(List<PedidoEstoque> pedidoEstoques) {
		PedidoEstoques = pedidoEstoques;
	}
	*/
}