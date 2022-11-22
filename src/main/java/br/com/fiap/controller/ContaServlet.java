package br.com.fiap.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.factory.DaoFactory;
import br.com.fiap.fintech.dao.ContaBancariaDao;
import br.com.fiap.model.ContaBancaria;


@WebServlet("/conta")
public class ContaServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private ContaBancariaDao dao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao = DaoFactory.getContaBancariaDao();
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
			int agencia = Integer.parseInt(request.getParameter("agencia"));
			int nmConta = Integer.parseInt(request.getParameter("nm_conta"));
			int dgConta = Integer.parseInt(request.getParameter("dg_conta"));
			String saldo = request.getParameter("saldo");
			int userId = Integer.parseInt(request.getParameter("userId"));
			ContaBancaria conta = new ContaBancaria(userId, agencia, nmConta, dgConta, saldo);
			dao.cadastrar(conta);
			request.setAttribute("msg", "cadastro realizado com sucesso");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("erro","Por favor, valide os dados");
		}
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
