package br.com.autbank.treinamentojava.animal.cachorro;

import java.util.Arrays;

import br.com.autbank.treinamentojava.animal.cachorro.dt.FalhaAoCriarCachorroException;

public class Labrador extends Cachorro{
	
	public Labrador() {
		System.out.println("Dentro do Construtor default");
	}
	

	public Labrador(int idade) {
		super();
		this.idade = idade;
		System.out.println("Dentro do Construtor com parametro idade");
	}
	

    public Labrador(String[] vacinas) {
		super();
		this.vacinas = vacinas;
		System.out.println("Dentro do Construtor com parametro Vacinas");
	}
    
	public Labrador(String[] vacinas, String cor, int idade, String name) throws Exception {
		super();
		this.vacinas = vacinas;
		this.cor = verifica_cor(cor);
		this.idade = idade;
		this.name = verifica_nome(name);
	}

	public String verifica_cor(String cor) throws Exception {
		if(cor == null || cor == "") {
			throw new FalhaAoCriarCachorroException();
		}
		return cor;
		
	}
	
	public String verifica_nome(String nome) throws Exception{
		if(nome == null || nome == "") {
			throw new FalhaAoCriarCachorroException();
		}
		return nome;
	}

	
	@Override
	public String toString() {
		return "Labrador [vacinas=" + Arrays.toString(vacinas) + ", cor=" + cor + ", idade=" + idade + ", "
				+ "name=" + name +
				", porte= " + porte + ", raça= " + raça + "]";
	}

	
	public String[] vacinas;
	public String cor;
	public int idade;
	private String name;
	//public String name;
	// String name;
	
	//O que deve ser feito para que as variáveis tenham modificadores
	//diferentes de public e ainda possam ser manipuladas?
	//a criação dos metodos gets and sets
	
	
	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) throws Exception {

		if(idade>0)	{
			this.idade = idade;
		}	
		else {
			throw new FalhaAoCriarCachorroException();
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) throws Exception{
	 if(name == null || name == "") {
		 throw new Exception("Nome não pode ser vazio!");
	 }
		this.name = name;
	}
	
	public void latir(){
		System.out.println(name + " está latindo!");
	}
	
	public void comer() {
		System.out.println(name + " está comendo!");
	}
	public void dormir() {
		System.out.println(name + " está dormindo!");
	}
	
	public String[] getVacinas() {
		return vacinas;
	}

	public void setVacinas(String[] vacinas) {
		this.vacinas = vacinas;
	}


	@Override
	public void andar() {
		// TODO Auto-generated method stub
		System.out.println(name + " está andando!");
	}


	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		System.out.println( "AU AU");
		
	}


	@Override
	public void mover() {
		// TODO Auto-generated method stub
		System.out.println(name + " está se movendo!");
	}


	@Override
	public void latir(String latido) {
		// TODO Auto-generated method stub
		System.out.println(name + " está dizendo " + latido);
	}


	@Override
	public void latir(String latido1, String latido2) {
		// TODO Auto-generated method stub
		System.out.println(name + " está dizendo " + latido1 + " " + latido2);
	}


	@Override
	public void latir(long par) {
		// TODO Auto-generated method stub
		System.out.println("ENTROU NO LONG");
	}


	@Override
	public void latir(int par) {
		// TODO Auto-generated method stub
		System.out.println("ENTROU NO INT");
	}


	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}


}
