package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.ContaBancaria;
import br.com.fiap.singleton.ConnectionManager;

public class ContaBancariaDao {
	
	private Connection conexao;
	
	public void cadastrar(ContaBancaria contaBancaria) {
		
		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String query = "INSERT INTO T_SIP_CONTA_BANCARIA(CD_BANCO, CD_USUARIO, CD_AGENCIA, NR_CONTA, DG_CONTA, VL_SALDO) VALUES (SEQ_CD_BANCO.NEXTVAL, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(query);
			stmt.setInt(1, contaBancaria.getCodigoUsuario());
			stmt.setInt(2, contaBancaria.getAgencia());
			stmt.setInt(3, contaBancaria.getNumeroConta());
			stmt.setInt(4, contaBancaria.getDigitoConta());
			stmt.setString(5, contaBancaria.getSaldo());
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
	
	public List<ContaBancaria> listar() {
	    List<ContaBancaria> lista = new ArrayList<ContaBancaria>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_SIP_CONTA_BANCARIA");
	   	  rs = stmt.executeQuery();
	  
	    while (rs.next()) {
	    	int codigo = rs.getInt("CD_BANCO");
	    	int codigoUsuario = rs.getInt("CD_USUARIO");
	    	int agencia = rs.getInt("CD_AGENCIA");
	    	int numeroConta = rs.getInt("NR_CONTA");
	    	int digitoConta = rs.getInt("DG_CONTA");
	        String saldo = rs.getString("VL_SALDO");
	        ContaBancaria contaBancaria = new ContaBancaria(codigo, codigoUsuario, agencia, numeroConta, digitoConta, saldo);
	        lista.add(contaBancaria);
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
