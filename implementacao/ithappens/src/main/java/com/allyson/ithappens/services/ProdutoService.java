package com.allyson.ithappens.services;

import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.repositories.FilialRepository;

@Service
public class ProdutoService extends ABaseService<Produto, FilialRepository>{

}
