package br.com.fiap.model;

import java.util.Calendar;

public class Investimento {
	
	private int codigoInvestimento;
	
	private int codigoUsuario;
	
	private Calendar dataTransacao;
	
	private Double valorAplicacao;
	
	private Double valorResgaste;
	
	private Double valorRendimento;
	
	private Double valorIR;
	
	private Double valorIOF;
	

	public Investimento(int codigoInvestimento, int codigoUsuario, Calendar dataTransacao, Double valorAplicacao, Double valorResgaste,
			Double valorRendimento, Double valorIR, Double valorIOF) {
		this.codigoInvestimento = codigoInvestimento;
		this.codigoUsuario = codigoUsuario;
		this.dataTransacao = dataTransacao;
		this.valorAplicacao = valorAplicacao;
		this.valorResgaste = valorResgaste;
		this.valorRendimento = valorRendimento;
		this.valorIR = valorIR;
		this.valorIOF = valorIOF;
	}
	
	public Investimento(int codigoUsuario, Calendar dataTransacao, Double valorAplicacao, Double valorResgaste,
			Double valorRendimento, Double valorIR, Double valorIOF) {
		this.codigoUsuario = codigoUsuario;
		this.dataTransacao = dataTransacao;
		this.valorAplicacao = valorAplicacao;
		this.valorResgaste = valorResgaste;
		this.valorRendimento = valorRendimento;
		this.valorIR = valorIR;
		this.valorIOF = valorIOF;
	}

	public int getCodigoInvestimento() {
		return codigoInvestimento;
	}

	public void setCodigoInvestimento(int codigoInvestimento) {
		this.codigoInvestimento = codigoInvestimento;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getDataTransacao() {
		return this.dataTransacao.getTime().toLocaleString();
	}
	
	public Calendar getDataTransacaoCalendar() {
		return this.dataTransacao;
	}

	public void setDataTransacao(Calendar dataTransacao) {
		this.dataTransacao = dataTransacao;
	}

	public Double getValorAplicacao() {
		return valorAplicacao;
	}

	public void setValorAplicacao(Double valorAplicacao) {
		this.valorAplicacao = valorAplicacao;
	}

	public Double getValorResgaste() {
		return valorResgaste;
	}

	public void setValorResgaste(Double valorResgaste) {
		this.valorResgaste = valorResgaste;
	}

	public Double getValorRendimento() {
		return valorRendimento;
	}

	public void setValorRendimento(Double valorRendimento) {
		this.valorRendimento = valorRendimento;
	}

	public Double getValorIR() {
		return valorIR;
	}

	public void setValorIR(Double valorIR) {
		this.valorIR = valorIR;
	}

	public Double getValorIOF() {
		return valorIOF;
	}

	public void setValorIOF(Double valorIOF) {
		this.valorIOF = valorIOF;
	}

	public String toString() {
		return "codigoInvestimento=" + codigoInvestimento + ", codigoUsuario=" + codigoUsuario
				+ ", dataTransacao=" + dataTransacao.getTime() + ", valorAplicacao=" + valorAplicacao + ", valorResgaste="
				+ valorResgaste + ", valorRendimento=" + valorRendimento + ", valorIR=" + valorIR + ", valorIOF="
				+ valorIOF;
	}
	
	
	
	
	
	
	
	
	
	
}
