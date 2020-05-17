package com.allyson.ithappens.services;

import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.Estoque;
import com.allyson.ithappens.repositories.EstoqueRepository;

@Service
public class EstoqueService extends ABaseService<Estoque, EstoqueRepository>{
}
