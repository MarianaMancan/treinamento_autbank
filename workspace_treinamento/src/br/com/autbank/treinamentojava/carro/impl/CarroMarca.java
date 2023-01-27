package br.com.autbank.treinamentojava.carro.impl;

public class CarroMarca  extends Carro{
	


	protected String nome;
	protected String cor;
	protected String ano;
	protected String modelo;
	protected String potencia;
	protected double kilometragem;
	protected String[] nomeDosProprietarios;
	protected boolean carroNovo;
	protected Proprietario proprietario;
	int qtdCriada;

	
	

	public CarroMarca(String nome, String cor, String ano, String modelo, String potencia, double kilometragem,
			String[] nomeDosProprietarios, boolean carroNovo, Proprietario proprietario) {
		super();
		this.nome = valida_nome(nome);
		this.cor = cor;
		this.ano = ano;
		this.modelo = modelo;
		this.potencia = potencia;
		this.kilometragem = valida_kilometragem(kilometragem);
		this.nomeDosProprietarios = nomeDosProprietarios;
		this.carroNovo = carroNovo;
		this.proprietario = proprietario;
		this.qtdCriada ++;
	}

	public CarroMarca() {
		super();
	}

	public double valida_kilometragem(double kilometragem) {
		if(this.carroNovo == true) {
		 return	kilometragem = 0;
		}
		if(kilometragem == 0) {
			System.out.println("A kilometrage deve ser diferente de 0 para carros usados");
		}
		return kilometragem;
	}
	
	public String valida_nome(String nome) {
		if(nome == "" || nome == null) {
			return nome = proprietario.nome;
		}
		return nome;
	}
	
	
	public Proprietario getProprietario() {
		return proprietario;
	}

	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}

	public boolean isCarroNovo() {
		return carroNovo;
	}

	public void setCarroNovo(boolean carroNovo) {
		this.carroNovo = carroNovo;
	}

	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getAno() {
		return ano;
	}
	
	public void setAno(String ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getPotencia() {
		return potencia;
	}
	
	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}
	
	public double getKilometragem() {
		return kilometragem;
	}
	
	public void setKilometragem(Double kilometragem) {
		this.kilometragem = kilometragem;
	}
	
	public String[] getNomeDosProprietarios() {
		return nomeDosProprietarios;
	}
	
	public void setNomeDosProprietarios(String[] nomeDosProprietarios) {
		this.nomeDosProprietarios = nomeDosProprietarios;
	}

	public void somaKilometragem(double valor) {
		this.setKilometragem(getKilometragem() + valor);
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println(nome + " está acelerando chegando a 250 km/h");
	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub
		System.out.println(nome + " possui o freio com tempo de resposta de 3 segundos");
	}

	@Override
	public void abastecer() {
		// TODO Auto-generated method stub
		System.out.println(nome + " precisa abastecer");
	}
	
	public void ligarSom() {
		System.out.println(nome + " está ligando o som");
	}
	
}
