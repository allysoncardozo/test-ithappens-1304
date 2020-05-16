package com.allyson.ithappens.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.repositories.ProdutoRepository;
import com.allyson.ithappens.services.ProdutoService;

@RestController
@RequestMapping(value="/Produtos")
public class ProdutoResource extends AService<Produto, ProdutoService>{

}
