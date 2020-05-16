package com.allyson.ithappens.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class StatusItemPedido extends ABase<StatusItemPedido> {

	private static final long serialVersionUID = 1L;

	private String Nome;
	

	@OneToMany(mappedBy = "Status")
	private List<ItensPedido> ItensPedido;

	public StatusItemPedido(Integer id, String nome) {
		super();
		super.setId(id);
		Nome = nome;
	}

	public StatusItemPedido() {
		
	}
	
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public List<ItensPedido> getItensPedido() {
		return ItensPedido;
	}

	public void setItensPedido(List<ItensPedido> itensPedido) {
		ItensPedido = itensPedido;
	}
	
}
