package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Cliente;
import com.allyson.ithappens.services.ClienteService;

@RestController
@RequestMapping(value="/Clientes")
public class ClienteResource extends AService<Cliente, ClienteService>{
	
}