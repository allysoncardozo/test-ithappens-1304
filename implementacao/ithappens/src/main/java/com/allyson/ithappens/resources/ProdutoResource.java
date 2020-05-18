package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.services.ProdutoService;

@RestController
@RequestMapping(value="/Produtos")
public class ProdutoResource extends AService<Produto, ProdutoService>{

}
