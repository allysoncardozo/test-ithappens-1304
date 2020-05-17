package com.allyson.ithappens.resources;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.ItensPedido;
import com.allyson.ithappens.services.ItensPedidoService;

@RestController
@RequestMapping(value="/ItensPedido")
public class ItensPedidoResource extends AService<ItensPedido, ItensPedidoService>{

}