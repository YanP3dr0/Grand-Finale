package br.com.fiap.model;

import java.util.Calendar;

public class Usuario {
	
	private int codigoUsuario;
	
	private String cpf;
	
	private String nome;
	
	private String email;
	
	private Calendar nascimento;
	
	private String senha;
	
	public Usuario() {
	}

	public Usuario(String cpf, String nome, String email, Calendar nascimento, String senha) {
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.senha = senha;
	}

	public Usuario(int codigo, String cpf, String nome, String email, Calendar nascimento, String senha) {
		this.codigoUsuario = codigo;
		this.cpf = cpf;
		this.nome = nome;
		this.email = email;
		this.nascimento = nascimento;
		this.senha = senha;
	}

	public int getCodigo() {
		return codigoUsuario;
	}

	public void setCodigo(int codigo) {
		this.codigoUsuario = codigo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Calendar getNascimento() {
		return nascimento;
	}

	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String toString() {
		return "codigo=" + codigoUsuario + ", cpf=" + cpf + ", nome=" + nome + ", email=" + email + ", nascimento="
				+ nascimento.getTime() + ", senha=" + senha;
	}
}
