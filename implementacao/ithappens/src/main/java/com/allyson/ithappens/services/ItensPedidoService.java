package com.allyson.ithappens.services;

import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.ItensPedido;
import com.allyson.ithappens.repositories.ItensPedidoRepository;

@Service
public class ItensPedidoService extends ABaseService<ItensPedido, ItensPedidoRepository>{
}
