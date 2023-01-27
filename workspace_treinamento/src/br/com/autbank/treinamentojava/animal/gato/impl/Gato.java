package br.com.autbank.treinamentojava.animal.gato.impl;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;

public abstract class Gato implements Animal {
   
	public String cor;
	public int idade;
	public String nome;
	public String raça;
	
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRaça() {
		return raça;
	}
	public void setRaça(String raça) {
		this.raça = raça;
	}
	
    public abstract void miar();
	public abstract void brincar();
	public abstract void arranhar();
	public abstract void ronronar();
}
