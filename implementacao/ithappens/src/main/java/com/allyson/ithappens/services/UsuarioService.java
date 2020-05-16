package com.allyson.ithappens.services;

import org.springframework.stereotype.Service;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.domain.Usuario;
import com.allyson.ithappens.repositories.UsuarioRepository;

@Service
public class UsuarioService extends ABaseService<Usuario, UsuarioRepository>{
}
