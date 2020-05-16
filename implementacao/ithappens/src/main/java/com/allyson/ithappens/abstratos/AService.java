package com.allyson.ithappens.abstratos;

import javax.persistence.MappedSuperclass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
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
}
