package br.com.fiap.teste;

import java.util.List;

import br.com.fiap.fintech.dao.ContaBancariaDao;
import br.com.fiap.model.ContaBancaria;

public class TesteListagemContaBancaria {
	
	public static void main(String[] args) {
		ContaBancariaDao dao = new ContaBancariaDao();
		List<ContaBancaria> lista = dao.listarPorUsuario(25);
		for (ContaBancaria contaBancaria : lista) {
			System.out.println(contaBancaria.toString());
		}		
	}
}
