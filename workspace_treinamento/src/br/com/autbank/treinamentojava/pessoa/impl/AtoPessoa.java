package br.com.autbank.treinamentojava.pessoa.impl;

import br.com.autbank.treinamentojava.pessoa.dt.ITOPessoa;

public abstract class AtoPessoa implements ITOPessoa{
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereço() {
		return endereço;
	}

	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}

	protected String nome;
	protected int idade;
	protected String cpf;
	protected String endereço;
	
	public AtoPessoa() {
		super();
	}

	public AtoPessoa(String nome, int idade, String cpf, String endereço) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.endereço = endereço;
	}

	
	

}
