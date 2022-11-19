package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.model.Investimento;
import br.com.fiap.singleton.ConnectionManager;


public class InvestimentoDao {
	
	private Connection conexao;
	
	public void cadastrar(Investimento investimento) {
		
		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String query = "INSERT INTO T_SIP_INVESTIMENTO(CD_INVESTIMENTO, CD_USUARIO, DT_TRANSACAO, VL_APLICACAO, VL_RESGATE, VL_RENDIMENTO, VL_IR, VL_IOF) VALUES (SEQ_CD_INVESTIMENTO.NEXTVAL, ?, ?, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(query);
			stmt.setInt(1, investimento.getCodigoUsuario());
			Date data = new Date(investimento.getDataTransacao().getTimeInMillis());
			stmt.setDate(2, data);
			stmt.setDouble(3, investimento.getValorAplicacao());
			stmt.setDouble(4, investimento.getValorResgaste());
			stmt.setDouble(5, investimento.getValorRendimento());
			stmt.setDouble(6, investimento.getValorIR());
			stmt.setDouble(7, investimento.getValorIOF());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
		}
	}
}



	public List<Investimento> listar() {
		List<Investimento> lista = new ArrayList<>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_SIP_INVESTIMENTO");
		    rs = stmt.executeQuery();
		while (rs.next()) {
			int codigoInvestimento = rs.getInt("CD_INVESTIMENTO");
			int codigoUsuario = rs.getInt("CD_USUARIO");
			Date data = rs.getDate("DT_TRANSACAO");
	        Calendar dataTransacao = Calendar.getInstance();
	        dataTransacao.setTimeInMillis(data.getTime());
	        Double valorAplicacao = rs.getDouble("VL_APLICACAO");
	        Double valorResgate = rs.getDouble("VL_RESGATE");
	        Double valorRendimento = rs.getDouble("VL_RENDIMENTO");
	        Double valorIR = rs.getDouble("VL_IR");
	        Double valorIOF = rs.getDouble("VL_IOF");
	        Investimento investimento = new Investimento(codigoInvestimento, codigoUsuario, dataTransacao, valorAplicacao, valorResgate, valorRendimento, valorIR, valorIOF);
	        lista.add(investimento);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	  }
   }


