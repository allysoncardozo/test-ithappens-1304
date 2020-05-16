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
			
	public enum eStatusDoPedido{
		ativo,
		cancelado,
		processado
	}
	private Integer Quantidade;
	public Double ValorPedido;

	@ManyToOne
	@JoinColumn(name="ProdutoId")	
	private Produto Produto;
	

	@ManyToOne
	@JoinColumn(name="PedidoEstoqueId")	
	private PedidoEstoque PedidoEstoque;

	private eStatusDoPedido Status;
	

	@ManyToOne
	@JoinColumn(name="FormaPagamentoId")	
	private FormaPagamento FormaPagamento;
	
	public ItensPedido(){
		
	}

	public ItensPedido(Integer id, Integer quantidade, Double valorPedido, Produto produto, PedidoEstoque pedidoEstoque, eStatusDoPedido status, FormaPagamento formaPagamento) {
		super();
		super.setId(id);
		Quantidade = quantidade;
		ValorPedido = valorPedido;
		Produto = produto;
		PedidoEstoque = pedidoEstoque;
		Status = status;
		FormaPagamento = formaPagamento;
	}

	public void CalcularValorPedido(){
		
		this.setValorPedido(0.00);
		
		if (Produto != null) {
			Double val = this.Produto.getValor() * this.Quantidade;	
			this.setValorPedido(val);
		}
	}	
	
	public PedidoEstoque getPedidoEstoque() {
		return PedidoEstoque;
	}


	public void setPedidoEstoque(PedidoEstoque pedidoEstoque) {
		PedidoEstoque = pedidoEstoque;
	}


	public eStatusDoPedido getStatus() {
		return Status;
	}


	public void setStatus(eStatusDoPedido status) {
		Status = status;
	}


	public void setValorPedido(Double valorPedido) {
		ValorPedido = valorPedido;
	}



	public Double getValorPedido() {
		return ValorPedido;
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