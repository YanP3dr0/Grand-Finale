package br.com.fiap.controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.factory.DaoFactory;
import br.com.fiap.fintech.dao.UsuarioDao;
import br.com.fiap.model.Usuario;

@WebServlet("/cadastro")
public class CadastroServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private UsuarioDao dao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao = DaoFactory.getUsuarioDao();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			String nome = request.getParameter("nome");
			String cpf = request.getParameter("cpf");
			String email = request.getParameter("email");
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(format.parse(request.getParameter("dataNascimento")));
			String senha = request.getParameter("senha");
			Usuario usuario = new Usuario(cpf, nome, email, dataNascimento, senha);
			dao.cadastrar(usuario);
			request.setAttribute("msg", "Usuário cadastrado com sucesso");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("erro","Por favor, valide os dados");
		}
		request.getRequestDispatcher("cadastro.jsp").forward(request, response);		
	}
	
	
	
	
	
	
	

}
