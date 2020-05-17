package com.allyson.ithappens.services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.PedidoEstoque;
import com.allyson.ithappens.exceptions.ObjectNotFoundException;
import com.allyson.ithappens.repositories.PedidoEstoqueRepository;

@Service
public class PedidoEstoqueService extends ABaseService<PedidoEstoque, PedidoEstoqueRepository>{

	

}
