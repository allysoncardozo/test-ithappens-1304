package com.allyson.ithappens.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.classes.UsuarioLogado;
import com.allyson.ithappens.domain.FormaPagamento;
import com.allyson.ithappens.services.FormaPagamentoService;
import com.allyson.ithappens.services.UsuarioService;

@RestController
@RequestMapping(value="/FormasPagamento")
public class FormaPagamentoResource extends AService<FormaPagamento, FormaPagamentoService>{

}