package com.allyson.ithappens.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.Estoque;
import com.allyson.ithappens.domain.ItensPedido;
import com.allyson.ithappens.exceptions.ObjectNotFoundException;
import com.allyson.ithappens.repositories.EstoqueRepository;
import com.allyson.ithappens.repositories.ItensPedidoRepository;
import com.allyson.ithappens.repositories.PedidoEstoqueRepository;

@Service
public class ItensPedidoService extends ABaseService<ItensPedido, ItensPedidoRepository>{
	
	@Autowired
	EstoqueRepository repoEstoque;
	
	@Autowired
	PedidoEstoqueRepository repoPdido;

	
	static List<Estoque> _estoques = new ArrayList<>();
	public static List<Estoque> ObterEstoques(EstoqueRepository repositorio){
		if (_estoques == null || _estoques.size() <= 0) {
			_estoques = repositorio.findAll();
		}
		return _estoques;
	}
	
	@Override
	public ItensPedido Salvar(ItensPedido obj) {
		Optional<ItensPedido> item = null;
		if (EstaValidoParaIncluir(obj)) {
			if (obj.getPedidoEstoque().getValor() == null)
				obj.getPedidoEstoque().setValor(0.00);
			
			Double valorRecalculado = obj.getPedidoEstoque().getValor() + obj.ValorPedido;
			obj.getPedidoEstoque().setValor(valorRecalculado);
			//aqui atualiza o valor pedidoEstoque
			repoPdido.save(obj.getPedidoEstoque());
			super.Salvar(obj);
			DiminuirQuantidadeEstoque(obj);			 
			item =  Optional.of(obj);
		}
		return item.orElseThrow(() -> new ObjectNotFoundException("O item " + obj.getProduto().getNome() + " não está mais disponível no estoque."));				
	}
	
	private Boolean  EstaValidoParaIncluir(ItensPedido obj) {
		//verifica no estoque se possui algum produto cuja quantidade seja maior que zero
		//e se possui quantidade disponível para salvar
		List<Estoque> lista = ItensPedidoService.ObterEstoques(repoEstoque);
		if (lista == null)
			return false;
		int qtde = obj.getQuantidade();
		List<Estoque> _l = lista.stream().filter(item -> item.getProduto().getId().equals(obj.getProduto().getId())
				                      && item.getQuantidade() > 0
				                      && item.getQuantidade() >= qtde).collect(Collectors.toList());
		
		return (_l != null && _l.size() > 0);
	}

	//Diminui a quantidade que há em estoque filial
	public void DiminuirQuantidadeEstoque(ItensPedido obj) {
		if (obj == null)
			return;
		
		if (obj.getQuantidade() <= 0)
			throw new ObjectNotFoundException("Quantidade inválida.");
		
		Optional<Estoque> prodEstoque = ItensPedidoService.ObterEstoques(repoEstoque).stream()
						  .filter(item -> item.getProduto().getId().equals(obj.getProduto().getId())
				        	     && item.getFilial().getId().equals(item.getFilial().getId())).findFirst();
				
		Integer quantidade = 0;
		if (prodEstoque != null){
			Estoque es = prodEstoque.get();
			quantidade = es.getQuantidade() - obj.getQuantidade();
			es.setQuantidade(quantidade);
			repoEstoque.save(es);	
		}		
		prodEstoque.orElseThrow(() -> new ObjectNotFoundException("O produto " + obj.getProduto().getNome() + " não está cadastrado no estoque."));			
	}
}
