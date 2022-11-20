package br.com.fiap.fintech.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.model.Usuario;
import br.com.fiap.singleton.ConnectionManager;

public class UsuarioDao {
	
	private Connection conexao;
	
	public void cadastrar(Usuario usuario) throws SQLException {
		
		PreparedStatement stmt = null;
		
			conexao = ConnectionManager.getInstance().getConnection();
			String query = "INSERT INTO T_SIP_USUARIO(CD_USUARIO, NR_CPF, NM_USUARIO, DS_EMAIL, DT_NASCIMENTO, DS_SENHA) VALUES (SEQ_CD_USUARIO.NEXTVAL, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(query);
			stmt.setString(1, usuario.getCpf());
			stmt.setString(2, usuario.getNome());
			stmt.setString(3, usuario.getEmail());
			Date data = new Date(usuario.getNascimento().getTimeInMillis());
			stmt.setDate(4, data);
			stmt.setString(5, usuario.getSenha());
			stmt.executeUpdate();
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
	}
	
	public List<Usuario> listar() {
	    List<Usuario> lista = new ArrayList<Usuario>();
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	    stmt = conexao.prepareStatement("SELECT * FROM T_SIP_USUARIO");
	    rs = stmt.executeQuery();
	  
	    while (rs.next()) {
	    	int codigo = rs.getInt("CD_USUARIO");
	    	String cpf = rs.getString("NR_CPF");
	    	String nome = rs.getString("NM_USUARIO");
	        String email = rs.getString("DS_EMAIL");
	        Date data = rs.getDate("DT_NASCIMENTO");
	        Calendar dataNascimento = Calendar.getInstance();
	        dataNascimento.setTimeInMillis(data.getTime());
	        String senha = rs.getString("DS_SENHA");
	        Usuario usuario = new Usuario(codigo, cpf, nome, email, dataNascimento, senha);
	        lista.add(usuario);
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
	
	public Usuario buscaPorEmail(String emailBusca) {
		Usuario usuario = null;
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_SIP_USUARIO WHERE DS_EMAIL= ?");
	      stmt.setString(1, emailBusca);
	      rs = stmt.executeQuery();
	  
	    while (rs.next()) {
	    	int codigo = rs.getInt("CD_USUARIO");
	    	String cpf = rs.getString("NR_CPF");
	    	String nome = rs.getString("NM_USUARIO");
	        String email = rs.getString("DS_EMAIL");
	        Date data = rs.getDate("DT_NASCIMENTO");
	        Calendar dataNascimento = Calendar.getInstance();
	        dataNascimento.setTimeInMillis(data.getTime());
	        String senha = rs.getString("DS_SENHA");
	        usuario = new Usuario(codigo, cpf, nome, email, dataNascimento, senha);
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
	    return usuario;
	}
	
	public boolean validaUsuario(String email, String senha) {
	    PreparedStatement stmt = null;
	    ResultSet rs = null;
	    try {
	      conexao = ConnectionManager.getInstance().getConnection();
	      stmt = conexao.prepareStatement("SELECT * FROM T_SIP_USUARIO WHERE DS_EMAIL= ?");
	      stmt.setString(1, email);
	      rs = stmt.executeQuery();
	      String senhaCadastrada = "";
	      
	      while(rs.next()) {
	    	  senhaCadastrada = rs.getString("DS_SENHA");
	      }
	      if(senha.equals(senhaCadastrada.strip())) {
	    	  return true;
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
	    return false;
	}

}
