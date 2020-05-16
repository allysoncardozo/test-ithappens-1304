package com.allyson.ithappens.services;

import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.StatusItemPedido;
import com.allyson.ithappens.repositories.StatusItemPedidoRepository;

@Service
public class StatusItemPedidoService extends ABaseService<StatusItemPedido, StatusItemPedidoRepository>{
}
