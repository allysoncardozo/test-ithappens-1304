package com.allyson.ithappens.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.allyson.ithappens.domain.ItensPedido;
import com.allyson.ithappens.domain.PedidoEstoque;

@Repository
public interface PedidoEstoqueRepository extends JpaRepository<PedidoEstoque, Integer>{
	@Query(value = "SELECT * FROM ITENS_PEDIDO where pedido_estoque_id = 1", nativeQuery = true)	
	public List<ItensPedido> findItensByVendaId(Integer vendaId);
}
