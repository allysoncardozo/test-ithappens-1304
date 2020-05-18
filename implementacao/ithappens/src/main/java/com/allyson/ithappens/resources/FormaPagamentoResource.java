package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.FormaPagamento;
import com.allyson.ithappens.services.FormaPagamentoService;

@RestController
@RequestMapping(value="/FormasPagamento")
public class FormaPagamentoResource extends AService<FormaPagamento, FormaPagamentoService>{

}