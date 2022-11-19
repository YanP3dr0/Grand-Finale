package br.com.fiap.model;

public class ContaBancaria {
	
	private int codigoBanco;
	
	private int codigoUsuario;
	
	private int agencia;
	
	private int numeroConta;
	
	private int digitoConta;
	
	private String saldo;
	
	
	public ContaBancaria() {
	}
	
	public ContaBancaria(int codigoUsuario, int agencia, int numeroConta, int digitoConta, String saldo) {
		this.codigoUsuario = codigoUsuario;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.digitoConta = digitoConta;
		this.saldo = saldo;
	}

	public ContaBancaria(int codigo, int codigoUsuario, int agencia, int numeroConta, int digitoConta, String saldo) {
		this.codigoBanco = codigo;
		this.codigoUsuario = codigoUsuario;
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.digitoConta = digitoConta;
		this.saldo = saldo;
	}

	public int getCodigo() {
		return codigoBanco;
	}

	public void setCodigo(int codigo) {
		this.codigoBanco = codigo;
	}

	public int getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(int codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getDigitoConta() {
		return digitoConta;
	}

	public void setDigitoConta(int digitoConta) {
		this.digitoConta = digitoConta;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String toString() {
		return "codigo=" + codigoBanco + ", codigoUsuario=" + codigoUsuario + ", agencia=" + agencia
				+ ", numeroConta=" + numeroConta + ", digitoConta=" + digitoConta + ", saldo=" + saldo;
	}
}
