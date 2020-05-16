package com.allyson.ithappens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allyson.ithappens.domain.ItensPedido;

@Repository
public interface ItensPedidoRepository extends JpaRepository<ItensPedido, Integer>{

}
