package br.com.fiap.teste;

import br.com.fiap.fintech.dao.ContaBancariaDao;
import br.com.fiap.model.ContaBancaria;

public class TesteCadastroContaBancaria {
	public static void main(String[] args) {		
		ContaBancariaDao dao = new ContaBancariaDao();
		ContaBancaria contaBancaria = new ContaBancaria(25, 70, 2546234, 3, "49629");
		ContaBancaria contaBancariaAtualiza = new ContaBancaria(3, 25, 60, 2546234, 9, "49629");
		dao.cadastrar(contaBancaria);
		System.out.println("Cadastrado");
//		dao.atualizar(contaBancariaAtualiza);
//		dao.remover(2);
	}
}
