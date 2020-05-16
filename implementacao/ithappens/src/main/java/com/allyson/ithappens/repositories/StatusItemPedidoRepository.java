package com.allyson.ithappens.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.allyson.ithappens.domain.StatusItemPedido;

@Repository
public interface StatusItemPedidoRepository extends JpaRepository<StatusItemPedido, Integer>{

}
