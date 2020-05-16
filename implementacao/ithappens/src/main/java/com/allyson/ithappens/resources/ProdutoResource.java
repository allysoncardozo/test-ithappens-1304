package com.allyson.ithappens.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Filial;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.services.FilialService;
import com.allyson.ithappens.services.ProdutoService;

@RestController
@RequestMapping(value="/Produtos")
public class ProdutoResource extends AService<Filial, FilialService>{
	
	/*@Autowired
	private ProdutoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		  Produto c1 = service.buscar(id);		  
		  return ResponseEntity.ok().body(c1);
	}*/
}
