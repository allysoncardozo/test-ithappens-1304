package com.allyson.ithappens.services;

import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.FormaPagamento;
import com.allyson.ithappens.domain.Usuario;
import com.allyson.ithappens.repositories.FormasPagamentoRepository;
import com.allyson.ithappens.repositories.UsuarioRepository;

@Service
public class FormaPagamentoService extends ABaseService<FormaPagamento, FormasPagamentoRepository>{
}
