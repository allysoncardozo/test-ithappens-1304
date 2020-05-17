package com.allyson.ithappens.domain;

import java.util.ArrayList;
import java.util.List;

import com.allyson.ithappens.abstratos.ABase;


public class PedidoEstoqueDto extends ABase<PedidoEstoqueDto>{
	private static final long serialVersionUID = 1L;
	
	public PedidoEstoqueDto() {
		
	}
	public void AdicionarItem(ItensPedido item) {
		if (itens == null)
			itens = new ArrayList<>();
		
		itens.add(item);
	}
	private PedidoEstoque pedidoEstoque;
	private List<ItensPedido> itens;
	
	public PedidoEstoque getPedidoEstoque() {
		return pedidoEstoque;
	}
	
	public void setPedidoEstoque(PedidoEstoque pedidoEstoque) {
		this.pedidoEstoque = pedidoEstoque;
	}
	
	public PedidoEstoqueDto(Integer id, PedidoEstoque pedidoEstoque) {
		super();
		super.setId(id);
		this.pedidoEstoque = pedidoEstoque;
	}

	public List<ItensPedido> getItens() {
		return itens;
	}

	public void setItens(List<ItensPedido> itens) {
		this.itens = itens;
	}
	
}
