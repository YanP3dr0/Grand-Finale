package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Receita;
import br.com.fiap.singleton.ConnectionManager;

public class ReceitaDao {
	
	private Connection conexao;
	
	public void cadastrar(Receita receita) {
		
		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String query = "INSERT INTO T_SIP_RECEITA(CD_RECEITA, VL_CREDITO, CD_USUARIO, CD_CLASSIFICACAO, NM_CLASSIFICACAO) VALUES (SEQ_CD_RECEITA.NEXTVAL, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(query);
			stmt.setString(1, receita.getValorCredito());
			stmt.setInt(2, receita.getCodigoUsuario());
			stmt.setInt(3, receita.getCodigoClassificacao());
			stmt.setString(4, receita.getNomeClassificacao());
			stmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public List<Receita> listar() {
	    List<Receita> lista = new ArrayList<>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_SIP_RECEITA");
	   	  rs = stmt.executeQuery();
	  
	    while (rs.next()) {
	    	int codigoReceita = rs.getInt("CD_RECEITA");
	    	String valorCredito = rs.getString("VL_CREDITO");
	    	int codigoUsuario = rs.getInt("CD_USUARIO");
	    	int codigoClassificacao = rs.getInt("CD_CLASSIFICACAO");
	    	String nomeClassificacao = rs.getString("NM_CLASSIFICACAO");
	        Receita receita = new Receita(codigoReceita, valorCredito, codigoUsuario, codigoClassificacao, nomeClassificacao);
	        lista.add(receita);
	      }
	    } catch (SQLException e) {
	      e.printStackTrace();
	    }finally {
	      try {
	        stmt.close();
	        rs.close();
	        conexao.close();
	      } catch (SQLException e) {
	        e.printStackTrace();
	      }
	    }
	    return lista;
	  }

}
