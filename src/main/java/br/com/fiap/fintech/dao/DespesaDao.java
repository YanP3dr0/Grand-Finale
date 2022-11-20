package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fiap.model.Despesa;
import br.com.fiap.singleton.ConnectionManager;

public class DespesaDao {

	private Connection conexao;

	public void cadastrar(Despesa despesa) {

		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String query = "INSERT INTO T_SIP_DESPESA(CD_DESPESA, CD_USUARIO, NM_CLASSIFICACAO, VL_DEBITO) VALUES (SEQ_CD_DESPESA.NEXTVAL, ?, ?, ?)";
			stmt = conexao.prepareStatement(query);
			stmt.setInt(1, despesa.getCodigoUsuario());
			stmt.setString(2, despesa.getClassificacao());
			stmt.setString(3, despesa.getValorDebito());
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
	
	public void atualizar(Despesa despesa) {

		PreparedStatement stmt = null;

		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String query = "UPDATE T_SIP_DESPESA SET NM_CLASSIFICACAO = ?, VL_DEBITO = ? WHERE CD_DESPESA = ?";
			stmt = conexao.prepareStatement(query);
			stmt.setString(1, despesa.getClassificacao());
			stmt.setString(2, despesa.getValorDebito());
			stmt.setInt(3, despesa.getCodigo());
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
	
	public void remover(int codigo) {
		
		PreparedStatement stmt = null;
		
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			String query = "DELETE FROM T_SIP_DESPESA WHERE CD_DESPESA = ?";
			stmt = conexao.prepareStatement(query);
			stmt.setInt(1, codigo);
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

	public List<Despesa> listar() {
		List<Despesa> lista = new ArrayList<Despesa>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_SIP_DESPESA");
			rs = stmt.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("CD_DESPESA");
				int codigoUsuario = rs.getInt("CD_USUARIO");
				String classificacao = rs.getString("NM_CLASSIFICACAO");
				String valorDebito = rs.getString("VL_DEBITO");
				Despesa despesa = new Despesa(codigo, codigoUsuario, classificacao, valorDebito);
				lista.add(despesa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
	
	public List<Despesa> listarPorUsuario(int codigoUsuarioBusca) {
		List<Despesa> lista = new ArrayList<Despesa>();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		try {
			conexao = ConnectionManager.getInstance().getConnection();
			stmt = conexao.prepareStatement("SELECT * FROM T_SIP_DESPESA WHERE CD_USUARIO = ?");
		    stmt.setInt(1, codigoUsuarioBusca);
			rs = stmt.executeQuery();

			while (rs.next()) {
				int codigo = rs.getInt("CD_DESPESA");
				int codigoUsuario = rs.getInt("CD_USUARIO");
				String classificacao = rs.getString("NM_CLASSIFICACAO");
				String valorDebito = rs.getString("VL_DEBITO");
				Despesa despesa = new Despesa(codigo, codigoUsuario, classificacao, valorDebito);
				lista.add(despesa);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
