package com.allyson.ithappens.abstratos;

import java.util.List;
import javax.persistence.MappedSuperclass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@MappedSuperclass
@RestController
public abstract class AService<T, E> {

	@Autowired
	public E service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		  T c1 = ((ABaseService<T, E>)service).buscar(id);		  
		  return ResponseEntity.ok().body(c1);
	}

	//método genérico que busca todos os dados do objeto
	@GetMapping
	public ResponseEntity<?> findAll(){
	  List<T> lista = ((ABaseService<T, E>)service).buscarTodos();
	  return ResponseEntity.ok().body(lista);
	}
	
    @DeleteMapping("/{id}")
	 ResponseEntity<Void> Delete(@PathVariable Integer id) {
    	((ABaseService<T, E>)service).deletar(id);
    	
    	var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/").buildAndExpand().toUri();		
		return ResponseEntity.created(uri).build();
    }
	
	@PostMapping
	public ResponseEntity<Void> salvar(@RequestBody T obj) {
		T a = ((ABaseService<T, E>)service).Salvar(obj);
		
		var uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(((ABase<T>)a).getId()).toUri();		
		return ResponseEntity.created(uri).build();
	}
}
