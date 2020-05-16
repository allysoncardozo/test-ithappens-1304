package com.allyson.ithappens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allyson.ithappens.domain.FormaPagamento;

@Repository
public interface FormasPagamentoRepository extends JpaRepository<FormaPagamento, Integer>{

}
