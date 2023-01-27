package br.com.autbank.treinamentojava.carro.impl;

public class Gol extends Carro {

	protected String nome;
	protected String cor;
	protected String ano;
	protected String modelo;
	protected String potencia;
	protected double kilometragem;
	protected String[] nomeDosProprietarios;
	protected boolean carroNovo;
	protected Proprietario proprietario;
	
	public Gol() {
		super();
	}

	public Gol(String nome, String cor, String ano, String modelo, String potencia, double kilometragem,
			String[] nomeDosProprietarios, boolean carroNovo, Proprietario proprietario) {
		super(nome, cor, ano, modelo, potencia, kilometragem, nomeDosProprietarios, carroNovo, proprietario);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		System.out.println(nome + " está acelerando chegando a 100 km/h");
		
	}

	@Override
	public void freiar() {
		// TODO Auto-generated method stub
		System.out.println(nome + " tem o freio com tempo de resposta de 10 segundos ");
	}

	@Override
	public void abastecer() {
		// TODO Auto-generated method stub
		System.out.println(nome + " precisa abastecer");
	}
	
	public void abrirVidros(){
		
		System.out.println(nome + " está abrindo os vidros");
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

	
}
