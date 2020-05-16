package com.allyson.ithappens.classes;

import org.springframework.beans.factory.annotation.Autowired;

import com.allyson.ithappens.domain.Usuario;
import com.allyson.ithappens.services.UsuarioService;

public class UsuarioLogado {
	
	public static Usuario user;
	public static void AutenticarUsuario(Integer usuarioId, String senha) {
		user = null;
		UsuarioService serviceUser = new UsuarioService();
		Usuario u = serviceUser.buscar(usuarioId);
		if (u != null) {
			var criptSenha = Criptografia.Criptografar(senha);
			if (u.getSenha().equals(criptSenha))
				user = u;
		}
	}
}
