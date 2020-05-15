package com.allyson.ithappens.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.domain.Filial;
import com.allyson.ithappens.services.FilialService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value="/Filiais")
public class FilialResource {
	
	@Autowired
	private FilialService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {		
		  Filial c1 = service.buscar(id);		  
		  return ResponseEntity.ok().body(c1);
	}
}
