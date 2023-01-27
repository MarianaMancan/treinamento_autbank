package br.com.autbank.treinamentojava.carro.impl;

public class Proprietario {
	
	public String nome;
	public int idade;
	public char sexo;
	public int anoHabilitacao;
	
	
	public Proprietario(String nome, int idade, char sexo, int anoHabilitacao) {
		super();
		this.nome = valida_nome(nome);
		this.idade = valida_idade(idade);
		this.sexo = valida_sexo(sexo);
		this.anoHabilitacao = valida_anoHabilitacao(anoHabilitacao);
	}
	
	public int valida_idade(int idade) {
		if(idade >= 18) {
			return idade;
		}
	 return	idade = 18;
	}
	
	
	public int valida_anoHabilitacao(int anoHabilitacao) {
		if(anoHabilitacao >= 1920 && anoHabilitacao <= 2014) {
			return anoHabilitacao;
		}
	return anoHabilitacao = 1920;	
	}
	
	public char valida_sexo(char sexo) {
		if(sexo == 's' || sexo == 'S' || sexo == 'f' || sexo == 'F') {
			return sexo;
		}
	return sexo = 'M';	
	}
	
	public String valida_nome(String nome){
		if(nome == null || nome == "") {
			return nome = "Nome não informado";
		}
	return nome;
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
	public char getSexo() {
		return sexo;
	}
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public int getAnoHabilitacao() {
		return anoHabilitacao;
	}
	public void setAnoHabilitacao(int anoHabilitacao) {
		this.anoHabilitacao = anoHabilitacao;
	}

	

}
