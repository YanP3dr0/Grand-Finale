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
import br.com.fiap.fintech.dao.InvestimentoDao;
import br.com.fiap.model.Investimento;


@WebServlet("/investimento")
public class InvestimentoServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	private InvestimentoDao dao;
	
	@Override
	public void init() throws ServletException {
		super.init();
		dao = DaoFactory.getInvestimentoDao();
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
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			Calendar dataTransacao = Calendar.getInstance();
			dataTransacao.setTime(format.parse(request.getParameter("data_transacao")));
			double vlAplicacao = Double.parseDouble(request.getParameter("vl_aplicacao"));
			double vlResgate = Double.parseDouble(request.getParameter("vl_resgate"));
			double vlRendimento = Double.parseDouble(request.getParameter("vl_rendimento"));
			double vlIr = Double.parseDouble(request.getParameter("vl_ir"));
			double vlIof = Double.parseDouble(request.getParameter("vl_iof"));
			int userId = Integer.parseInt(request.getParameter("userId"));
			Investimento investimento = new Investimento(userId, dataTransacao, vlAplicacao, vlResgate, vlRendimento, vlIr, vlIof);
			dao.cadastrar(investimento);
			request.setAttribute("msg", "cadastro realizado com sucesso");
		}catch(Exception e){
			e.printStackTrace();
			request.setAttribute("erro","Por favor, valide os dados");
		}
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
