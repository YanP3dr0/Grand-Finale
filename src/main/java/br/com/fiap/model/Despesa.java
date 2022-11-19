package br.com.fiap.model;

public class Despesa {
	
	private int codigoBanco;
	
	private int codigoUsuario;
	
	private String classificacao;
	
	private String valorDebito;

	public Despesa(int codigoBanco, int codigoUsuario, String nomeClassificacao, String valorDebito) {
		this.codigoBanco = codigoBanco;
		this.codigoUsuario = codigoUsuario;
		this.classificacao = nomeClassificacao;
		this.valorDebito = valorDebito;
	}

	public Despesa(int codigoUsuario, String nomeClassificacao, String valorDebito) {
		this.codigoUsuario = codigoUsuario;
		this.classificacao = nomeClassificacao;
		this.valorDebito = valorDebito;
	}
	
	public Despesa() {
	}

	public int getCodigoBanco() {
		return codigoBanco;
	}

	public void setCodigoBanco(int codigoBanco) {
		this.codigoBanco = codigoBanco;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String nomeClassificacao) {
		this.classificacao = nomeClassificacao;
	}

	public String getValorDebito() {
		return valorDebito;
	}

	public void setValorDebito(String valorDebito) {
		this.valorDebito = valorDebito;
	}

	@Override
	public String toString() {
		return "CodigoBanco=" + codigoBanco + ", codigoUsuario=" + codigoUsuario + ", classificacao="
				+ classificacao + ", valorDebito=" + valorDebito;
	}
	
	
}
