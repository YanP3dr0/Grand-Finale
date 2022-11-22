package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.fintech.dao.ReceitaDao;
import br.com.fiap.model.Receita;

public class TesteReceita {
	public static void main(String[] args) {		
		ReceitaDao dao = new ReceitaDao();
//		Receita receitaAtualiza = new Receita(5, "6000.98", 25, 6, "seila");
//		dao.atualizar(receitaAtualiza);
//		dao.remover(5);
//		
//		Receita receita = new Receita("2642.98", 25, 2, "porte");
//		dao.cadastrar(receita);
//		System.out.println("Cadastrado");
		
		
		List<Receita> lista = dao.listar();
		for (Receita receitas : lista) {
			System.out.println(receitas.toString());
		}
	}
}
