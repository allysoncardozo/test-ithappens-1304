package com.allyson.ithappens.resources;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.allyson.ithappens.abstratos.ABaseService;
import com.allyson.ithappens.abstratos.AService;
import com.allyson.ithappens.classes.UsuarioLogado;
import com.allyson.ithappens.domain.Usuario;
import com.allyson.ithappens.services.UsuarioService;

@RestController
@RequestMapping(value="/Usuarios")
public class UsuarioResource extends AService<Usuario, UsuarioService>{

	@GetMapping(value="/u/{id}/s/{senha}")
	public ResponseEntity<?> find(@PathVariable Integer id, @PathVariable String senha) {		
		UsuarioLogado.AutenticarUsuario(id, senha);
		return UsuarioLogado.user == null ? ResponseEntity.status(HttpStatus.NOT_FOUND).body(UsuarioLogado.user) : ResponseEntity.ok().body(UsuarioLogado.user);
	}

}