package com.allyson.ithappens.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Filial;
import com.allyson.ithappens.services.FilialService;

@RestController
@RequestMapping(value="/Filiais")
public class FilialResource extends AService<Filial, FilialService>{
	
}