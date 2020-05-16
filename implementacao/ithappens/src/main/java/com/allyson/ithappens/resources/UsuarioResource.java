package com.allyson.ithappens.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.domain.Usuario;
import com.allyson.ithappens.services.UsuarioService;

@RestController
@RequestMapping(value="/Usuarios")
public class UsuarioResource extends AService<Usuario, UsuarioService>{

}
