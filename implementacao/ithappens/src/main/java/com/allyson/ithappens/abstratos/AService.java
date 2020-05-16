package com.allyson.ithappens.abstratos;

import java.util.List;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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
	public List findAll(){
	  return ((ABaseService<T, E>)service).buscarTodos();
	}
	
    @DeleteMapping("/{id}")
    void deleteEmployee(@PathVariable Integer id) {
    	((ABaseService<T, E>)service).deletar(id);
    }
	
	
}
