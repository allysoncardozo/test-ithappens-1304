package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.StatusItemPedido;
import com.allyson.ithappens.services.StatusItemPedidoService;

@RestController
@RequestMapping(value="/StatusItensPedido")
public class StatusItemPedidoResource extends AService<StatusItemPedido, StatusItemPedidoService>{

}
