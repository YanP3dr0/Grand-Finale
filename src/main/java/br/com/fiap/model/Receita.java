package br.com.fiap.model;

public class Receita {
	
	private int codigoReceita;
	
	private String valorCredito;
	
	private int codigoUsuario;
	
	private int codigoClassificacao;
	
	private String nomeClassificacao;


	public Receita() {
	}
	
	public Receita(String valorCredito, int codigoUsuario, int codigoClassificacao, String nomeClassificacao) {
		this.valorCredito = valorCredito;
		this.codigoUsuario = codigoUsuario;
		this.codigoClassificacao = codigoClassificacao;
		this.nomeClassificacao = nomeClassificacao;
	}

	public Receita(int codigoReceita, String valorCredito, int codigoUsuario, int codigoClassificacao,
			String nomeClassificacao) {
		this.codigoReceita = codigoReceita;
		this.valorCredito = valorCredito;
		this.codigoUsuario = codigoUsuario;
		this.codigoClassificacao = codigoClassificacao;
		this.nomeClassificacao = nomeClassificacao;
	}

	public String getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(String valorCredito) {
		this.valorCredito = valorCredito;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public int getCodigoClassificacao() {
		return codigoClassificacao;
	}

	public void setCodigoClassificacao(int codigoClassificacao) {
		this.codigoClassificacao = codigoClassificacao;
	}

	public String getNomeClassificacao() {
		return nomeClassificacao;
	}

	public void setNomeClassificacao(String nomeClassificacao) {
		this.nomeClassificacao = nomeClassificacao;
	}

	public int getCodigoReceita() {
		return codigoReceita;
	}

	public void setCodigoReceita(int codigoReceita) {
		this.codigoReceita = codigoReceita;
	}

	@Override
	public String toString() {
		return "codigoReceita=" + codigoReceita + ", valorCredito=" + valorCredito + ", codigoUsuario="
				+ codigoUsuario + ", codigoClassificacao=" + codigoClassificacao + ", nomeClassificacao="
				+ nomeClassificacao;
	}
}
