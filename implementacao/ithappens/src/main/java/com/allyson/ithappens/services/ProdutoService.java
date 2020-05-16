package com.allyson.ithappens.services;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.Produto;
import com.allyson.ithappens.exceptions.ObjectNotFoundException;
import com.allyson.ithappens.repositories.ProdutoRepository;

@Service
public class ProdutoService extends ABaseService<Produto, ProdutoRepository>{

	//todas as classes que herdarem de ABAseService terão o método de 
	//Buscar produto pelo Codigo de barras
	public Produto buscarPorCodigoDeBarras(String codigoDeBarras) {	
		Optional<Produto> obj =((ProdutoRepository)repo).findAll().stream().filter(p -> p.getCodigoDeBarras().equals(codigoDeBarras)).findFirst();
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Cód. Barras " + codigoDeBarras + ", Tipo: " + getGenericName()));
	}
}
