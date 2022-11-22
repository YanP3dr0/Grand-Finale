package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.fintech.dao.InvestimentoDao;
import br.com.fiap.model.Investimento;

public class TesteListagemInvestimento {
	
	public static void main(String[] args) {
		InvestimentoDao dao = new InvestimentoDao();
		List<Investimento> lista = dao.listarPorUsuario(29);
		for (Investimento usuario : lista) {
			System.out.println(usuario.toString());
			System.out.println(usuario.getDataTransacao());
		}
	}
}

