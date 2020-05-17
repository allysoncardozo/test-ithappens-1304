package com.allyson.ithappens.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.ItensPedido;
import com.allyson.ithappens.domain.PedidoEstoque;
import com.allyson.ithappens.domain.PedidoEstoqueDto;
import com.allyson.ithappens.repositories.PedidoEstoqueRepository;
import com.allyson.ithappens.services.PedidoEstoqueService;

@RestController
@RequestMapping(value="/PedidoEstoques")
public class PedidoEstoqueResource extends AService<PedidoEstoque, PedidoEstoqueService>{

	@RequestMapping(value="/{vendaId}/Itens", method = RequestMethod.GET)
	public ResponseEntity<PedidoEstoqueDto> obterPedidoEstoqueItens(@PathVariable Integer vendaId) {		
		PedidoEstoqueDto pedido = new PedidoEstoqueDto();
		
		PedidoEstoque venda = ((PedidoEstoqueService)service).buscar(vendaId);
		pedido.setId(vendaId);
		pedido.setPedidoEstoque(venda);
		PedidoEstoqueRepository repositorio = (PedidoEstoqueRepository)((PedidoEstoqueService)service).repo;
		
		List<ItensPedido> lista = repositorio.findItensByVendaId(vendaId);
		//lista.forEach(p -> { pedido.AdicionarItem(p); });
		System.out.println(lista);
	
		
		

		return ResponseEntity.ok().body(pedido);
	}

}