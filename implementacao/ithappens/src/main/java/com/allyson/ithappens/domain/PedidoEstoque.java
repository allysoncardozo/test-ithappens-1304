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
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class PedidoEstoque extends ABase<PedidoEstoque> {

	private static final long serialVersionUID = 1L;

	public enum eTipoPedidoEstoque{
		entrada,
		saida
	}
	public PedidoEstoque() {
		
	}
	
	public PedidoEstoque(Integer id, eTipoPedidoEstoque tipo, Usuario usuario, Cliente cliente, String observacao) {
		super();
		super.setId(id);
		Tipo = tipo;
		Usuario = usuario;
		Cliente = cliente;
		Observacao = observacao;
	}

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="UsuarioId")
	private Usuario Usuario;

	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="ClienteId")
	private Cliente Cliente;
	
	private String Observacao;
    
	/*
	@JsonBackReference
	@OneToMany(mappedBy = "PedidoEstoque")
	private List<ItensPedido> ItensPedido = new ArrayList<ItensPedido>();
	*/
	
	private eTipoPedidoEstoque Tipo;
	
	/*
	public List<ItensPedido> getItensPedido() {
		return ItensPedido;
	}

	public void setItensPedido(List<ItensPedido> itensPedido) {
		ItensPedido = itensPedido;
	}*/

	public eTipoPedidoEstoque getTipo() {
		return Tipo;
	}

	public void setTipo(eTipoPedidoEstoque tipo) {
		Tipo = tipo;
	}



	public Cliente getCliente() {
		return Cliente;
	}

	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}

	public Usuario getUsuario() {
		return Usuario;
	}

	public void setUsuario(Usuario usuario) {
		Usuario = usuario;
	}

	public String getObservacao() {
		return Observacao;
	}

	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

}
