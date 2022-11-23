package br.com.fiap.teste;

import java.sql.SQLException;
import java.util.Calendar;

import br.com.fiap.fintech.dao.InvestimentoDao;
import br.com.fiap.model.Investimento;


public class TesteCadastroInvestimento {
		public static void main(String[] args) throws SQLException {
			InvestimentoDao dao = new InvestimentoDao();
//			Investimento investimentoAtualiza = new Investimento(3, 25, Calendar.getInstance(), 500.00, 50.00, 5000.00, 10.00, 5.00);
//			dao.atualizar(investimentoAtualiza);
//			dao.remover(3);
			Investimento investimento = new Investimento(25, Calendar.getInstance(), 300.00, 45.00, 0.00, 10.00, 5.00);
			dao.cadastrar(investimento);
			System.out.println("Cadastrado");
		}

	}
