package br.com.fiap.factory;

import br.com.fiap.fintech.dao.ContaBancariaDao;
import br.com.fiap.fintech.dao.DespesaDao;
import br.com.fiap.fintech.dao.InvestimentoDao;
import br.com.fiap.fintech.dao.ReceitaDao;
import br.com.fiap.fintech.dao.UsuarioDao;

public class DaoFactory {
	
	public static ContaBancariaDao getContaBancariaDao() {
		return new ContaBancariaDao();
	}
	
	public static DespesaDao getDespesaDao() {
		return new DespesaDao();
	}
	
	public static InvestimentoDao getInvestimentoDao() {
		return new InvestimentoDao();
	}
	
	public static ReceitaDao getReceitaDao() {
		return new ReceitaDao();
	}
	
	public static UsuarioDao getUsuarioDao() {
		return new UsuarioDao();
	}

}
