package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.fiap.factory.DaoFactory;
import br.com.fiap.fintech.dao.UsuarioDao;


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private UsuarioDao dao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao = DaoFactory.getUsuarioDao();
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.invalidate();
		request.getRequestDispatcher("index.jsp").forward(request, response);
	}
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String senha = request.getParameter("senha");
		
		if(dao.validaUsuario(email, senha) == true) {
			HttpSession session = request.getSession();
			session.setAttribute("user", email);
			String msg = "Um login foi realizado";
		}else {
			request.setAttribute("erro", "Usuário e/ou senha inválidos");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		}
		request.getRequestDispatcher("testaBusca.jsp").forward(request, response);
	}

}
