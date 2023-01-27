package br.com.autbank.treinamentojava.pessoa.impl;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected String cpf;
	
	
	public Pessoa(){
		
	}
	
	public Pessoa(String nome, int idade, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
	}

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
	
	public static boolean verifcar_cpf(String CPF) {

		if(CPF.length()==11 && CPF.matches("[0-9]*")) {
			
			System.out.println("CPF CORRETO");
			
			return true;
			
		}
		System.out.println("O CPF deve ter 11 dígitos!");	
		return false;	
		
	}
	
}
