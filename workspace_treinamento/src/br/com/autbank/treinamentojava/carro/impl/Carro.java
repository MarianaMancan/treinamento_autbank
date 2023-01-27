package br.com.autbank.treinamentojava.carro.impl;


public abstract class Carro {
	
	protected String nome;
	protected String cor;
	protected String ano;
	protected String modelo;
	protected String potencia;
	protected double kilometragem;
	protected String[] nomeDosProprietarios;
	protected boolean carroNovo;
	protected Proprietario proprietario;
	
	
	
	
	
	public Carro() {
		super();
	}
	
	public Carro(String nome, String cor, String ano, String modelo, String potencia, double kilometragem,
			String[] nomeDosProprietarios, boolean carroNovo, Proprietario proprietario) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.ano = ano;
		this.modelo = modelo;
		this.potencia = potencia;
		this.kilometragem = verificar_kilometragem(kilometragem);
		this.nomeDosProprietarios = nomeDosProprietarios;
		this.carroNovo = carroNovo;
		this.proprietario = proprietario;
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
	public void setKilometragem(double kilometragem) {
		this.kilometragem = kilometragem;
	}
	public String[] getNomeDosProprietarios() {
		return nomeDosProprietarios;
	}
	public void setNomeDosProprietarios(String[] nomeDosProprietarios) {
		this.nomeDosProprietarios = nomeDosProprietarios;
	}
	public boolean isCarroNovo() {
		return carroNovo;
	}
	public void setCarroNovo(boolean carroNovo) {
		this.carroNovo = carroNovo;
	}
	public Proprietario getProprietario() {
		return proprietario;
	}
	public void setProprietario(Proprietario proprietario) {
		this.proprietario = proprietario;
	}
	public Double verificar_kilometragem(Double kilometragem){
		
			if(kilometragem>0) {
				return kilometragem;
			}
			System.out.println("A kilometragem precisa ser pelo menos igual  a 0");
			return kilometragem = 0.0;
		
	}
	 public abstract void acelerar();
	
	 public abstract void freiar();
	 
	 public abstract void abastecer();
	 
	
}
