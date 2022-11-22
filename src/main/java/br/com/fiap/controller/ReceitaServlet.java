package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.factory.DaoFactory;
import br.com.fiap.fintech.dao.ReceitaDao;
import br.com.fiap.model.Receita;


@WebServlet("/receita")
public class ReceitaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ReceitaDao dao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao = DaoFactory.getReceitaDao();
	}
      

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String acao = request.getParameter("acao");
		
		switch(acao) {
		case "cadastrar":
			cadastrar(request, response);
			break;
		}
		
	}

	private void cadastrar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			String valor = request.getParameter("valor");
			String descricao = request.getParameter("descricao");
			int userId = Integer.parseInt(request.getParameter("userId"));
			Receita receita = new Receita(valor, userId, userId, descricao);
			dao.cadastrar(receita);
			request.setAttribute("msg", "cadastro realizado com sucesso");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("erro","Por favor, valide os dados");
		}
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}