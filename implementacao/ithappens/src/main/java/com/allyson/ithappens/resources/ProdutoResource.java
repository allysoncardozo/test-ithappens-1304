package com.allyson.ithappens.resources;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.services.ProdutoService;

@RestController
@RequestMapping(value="/Produtos")
public class ProdutoResource extends AService<Produto, ProdutoService>{
/*
	//método genérico que busca todos os dados do objeto
	@GetMapping
	public List findAllByCodigoBarras(String codigoBarras){
	  return ((ABaseService<T, E>)service).buscarTodos();
	}
	
	@Autowired
	private ProdutoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		  Produto c1 = service.buscar(id);		  
		  return ResponseEntity.ok().body(c1);
	}*/
}
