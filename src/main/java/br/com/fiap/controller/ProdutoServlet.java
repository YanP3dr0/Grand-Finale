package br.com.fiap.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.model.Produto;


@WebServlet("/produto")
public class ProdutoServlet extends HttpServlet {
	
	private static List<Produto> lista = new ArrayList<Produto>();
	
	private static final long serialVersionUID = 1L;
	
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setAttribute("produtos", lista);
      request.getRequestDispatcher("lista-produtos.jsp").forward(request, response);
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {				
		String nome = request.getParameter("nome");
		int qtd = Integer.parseInt(request.getParameter("quantidade"));
		double valor = Double.parseDouble(request.getParameter("valor"));
		
		Produto produto = new Produto(nome, qtd, valor);
		lista.add(produto);
		
		request.setAttribute("msg","Produto cadastrado!");
		request.getRequestDispatcher("cadastro-produto.jsp").forward(request, response);
	}

}
