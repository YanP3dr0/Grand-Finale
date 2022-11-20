package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.fintech.dao.DespesaDao;
import br.com.fiap.model.Despesa;

public class TesteListagemDespesa {
	
	public static void main(String[] args) {
		DespesaDao dao = new DespesaDao();
		List<Despesa> lista = dao.listarPorUsuario(25);
		for (Despesa despesa : lista) {
			System.out.println(despesa.toString());
		}
	}
}
