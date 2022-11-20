package br.com.fiap.teste;

import br.com.fiap.fintech.dao.DespesaDao;
import br.com.fiap.model.Despesa;

public class TesteCadastroDespesa {
	public static void main(String[] args) {
		DespesaDao dao = new DespesaDao();
//		Despesa despesaAtualiza = new Despesa(3, 25, "seilarrr", "1500");
//		dao.atualizar(despesaAtualiza);
//		dao.remover(3);
		Despesa despesa = new Despesa(25, "seila2", "3000");
		dao.cadastrar(despesa);
		System.out.println("Cadastrado");
	}
}
