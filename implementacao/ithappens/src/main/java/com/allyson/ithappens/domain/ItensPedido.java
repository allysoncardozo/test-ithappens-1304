package com.allyson.ithappens.domain;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.allyson.ithappens.abstratos.ABase;

@Entity
public class ItensPedido extends ABase<ItensPedido> {

	private static final long serialVersionUID = 1L;
	
	
	//1 Ativo, 2 cancelado, 3 processado
	private Integer Status;	
	private Integer Quantidade;
	public Double ValorPedido;

	@ManyToOne
	@JoinColumn(name="ProdutoId")	
	private Produto Produto;
	
	private FormaPagamento FormaPagamento;
	
	public ItensPedido(){
	}


	public ItensPedido(Integer id, Integer status, Integer quantidade, Double valorPedido, FormaPagamento formaPagamento, Produto produto) {
		super();
		super.setId(id);
		Status = status;
		Quantidade = quantidade;
		ValorPedido = valorPedido;
		FormaPagamento = formaPagamento;
		Produto = produto;
	}


	public Double getValorPedido() {
		return ValorPedido;
	}


	public void setValorPedido(Double valorPedido) {
		ValorPedido = valorPedido;
	}
    public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public Integer getQuantidade() {
		return Quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		Quantidade = quantidade;
	}

	public FormaPagamento getFormaPagamento() {
		return FormaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		FormaPagamento = formaPagamento;
	}


	public Produto getProduto() {
		return Produto;
	}


	public void setProduto(Produto produto) {
		Produto = produto;
	}
}