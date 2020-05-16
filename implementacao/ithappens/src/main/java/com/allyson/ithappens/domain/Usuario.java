package com.allyson.ithappens.domain;


import javax.persistence.Entity;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class Usuario extends ABase<Usuario> {

	private static final long serialVersionUID = 1L;
	
	private String Nome;
	private String Senha;
	
	
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
	
}