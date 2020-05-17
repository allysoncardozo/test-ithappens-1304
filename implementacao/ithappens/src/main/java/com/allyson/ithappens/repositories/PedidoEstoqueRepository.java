package com.allyson.ithappens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allyson.ithappens.domain.PedidoEstoque;

@Repository
public interface PedidoEstoqueRepository extends JpaRepository<PedidoEstoque, Integer>{

}
