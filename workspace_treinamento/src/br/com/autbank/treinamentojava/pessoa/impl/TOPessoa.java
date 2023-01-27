package br.com.autbank.treinamentojava.pessoa.impl;

import java.util.Date;

public class TOPessoa {
	
	protected String nome;
	protected int idade;
	protected String cpf;
	protected Date datanascimento;
	
	
	public TOPessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) throws TENomeNaoInformadoException {
		if(nome == null || nome == "") {
			throw new TENomeNaoInformadoException();
		}
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) throws TEIdadeNaoInformadaException {
		if( idade < 0) {
			throw new TEIdadeNaoInformadaException();
		}
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) throws TECpfNaoInformadoException {
		if(cpf == null || cpf == "" || cpf.length() != 11) {
			
			throw new TECpfNaoInformadoException();
		}
		this.cpf = cpf;
		
	}
	public Date getDatanascimento() {
		return datanascimento;
	}
	
	public void setDatanascimento(Date datanascimento) throws TEDataDeNascimentoNaoInformadaException {
		if(datanascimento == null ) {
		 throw new	TEDataDeNascimentoNaoInformadaException();
		}
		this.datanascimento = datanascimento;
	}
	
	
	

}
