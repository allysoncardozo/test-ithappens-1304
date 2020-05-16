package com.allyson.ithappens.services;

import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.Cliente;
import com.allyson.ithappens.repositories.ClienteRepository;

@Service
public class ClienteService extends ABaseService<Cliente, ClienteRepository>{

}
