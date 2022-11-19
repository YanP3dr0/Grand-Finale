package br.com.fiap.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.fiap.fintech.dao.UsuarioDao;
import br.com.fiap.model.Usuario;

public class TesteCadastroUsuario {
	public static void main(String[] args) throws SQLException {
		UsuarioDao dao = new UsuarioDao();
		Usuario usuario = new Usuario("452262622", "Roberto", "seila@seila.com", Calendar.getInstance(), "123");
		dao.cadastrar(usuario);
	}
}
