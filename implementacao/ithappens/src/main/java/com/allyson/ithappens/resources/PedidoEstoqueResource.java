package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.PedidoEstoque;
import com.allyson.ithappens.services.PedidoEstoqueService;

@RestController
@RequestMapping(value="/PedidoEstoques")
public class PedidoEstoqueResource extends AService<PedidoEstoque, PedidoEstoqueService>{
	
}