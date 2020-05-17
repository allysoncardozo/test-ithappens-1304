package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Estoque;
import com.allyson.ithappens.services.EstoqueService;

@RestController
@RequestMapping(value="/Estoques")
public class EstoqueResource extends AService<Estoque, EstoqueService>{
	
}