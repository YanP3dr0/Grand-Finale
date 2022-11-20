package br.com.fiap.model;

public class Despesa {
	
	private int codigo;
	
	private int codigoUsuario;
	
	private String classificacao;
	
	private String valorDebito;

	public Despesa(int codigo, int codigoUsuario, String nomeClassificacao, String valorDebito) {
		this.codigo = codigo;
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
		return "CodigoBanco=" + codigo + ", codigoUsuario=" + codigoUsuario + ", classificacao="
				+ classificacao + ", valorDebito=" + valorDebito;
	}
	
	
}
