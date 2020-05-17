package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Filial;
import com.allyson.ithappens.services.FilialService;

@RestController
@RequestMapping(value="/Filiais")
public class FilialResource extends AService<Filial, FilialService>{
	
}