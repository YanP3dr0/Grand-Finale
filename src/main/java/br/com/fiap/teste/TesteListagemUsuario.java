package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.factory.DaoFactory;
import br.com.fiap.fintech.dao.UsuarioDao;
import br.com.fiap.model.Usuario;

public class TesteListagemUsuario {
	
	public static void main(String[] args) {
		UsuarioDao dao = DaoFactory.getUsuarioDao();
//		List<Usuario> lista = dao.listar();
//		for (Usuario usuario : lista) {
//			System.out.println(usuario.toString());
//		}
		Usuario usuario = dao.buscaPorEmail("reinaldo@mail.com");
		boolean verificado = dao.validaUsuario("reinaldo@mail.com", "2");
		System.out.println(verificado);
		System.out.println(usuario.toString());
	}
}
