package br.com.autbank.treinamentojava.carro.testes;

import br.com.autbank.treinamentojava.carro.impl.CarroMarca;
import br.com.autbank.treinamentojava.carro.impl.Proprietario;

public class TestaCarros {

	public static void main(String[] args) {
		
		
		String[] proprietariosFox = {"julia","roberto"};
		String[] proprietariosHonda = {"André","Ricardo"};
		Proprietario proprietarioFox = new Proprietario("André",30,'M',2000);
		Proprietario proprietarioHonda = new Proprietario("Julia",26,'f',2002);
		CarroMarca fox;
		CarroMarca honda;
		fox = new CarroMarca("Fox","Vermelho","2016","sedan","1.6",200.00,proprietariosFox,false,proprietarioFox);
		honda = new CarroMarca("honda fit","prata","2014","sedan","1.6",300.00,proprietariosHonda,false,proprietarioHonda);
		fox.somaKilometragem(200);
		honda.somaKilometragem(100);
		
		System.out.println("KILOMETRAGEM SOMADA FOX  " + fox.getKilometragem());
		System.out.println("KILOMETRAGEM SOMADA HONDA " + honda.getKilometragem());
		
		System.out.println("\n FIXA FOX: ");
		System.out.println("   NOME: " + fox.getNome());
		System.out.println("   Cor: " + fox.getCor());
		System.out.println("   Ano: " + fox.getAno());
		System.out.println("   Modelo: " + fox.getModelo());
		System.out.println("   Potencia: " + fox.getPotencia());
		System.out.println("   kilometrgaem: " + fox.getKilometragem());
		System.out.println("   Proprietario1: " + fox.getNomeDosProprietarios()[0]);
		System.out.println("   Proprietario2: " + fox.getNomeDosProprietarios()[1]);
		
		
		System.out.println("\n FIXA HONDA: ");
		System.out.println("   NOME: " + honda.getNome());
		System.out.println("   Cor: " + honda.getCor());
		System.out.println("   Ano: " + honda.getAno());
		System.out.println("   Modelo: " + honda.getModelo());
		System.out.println("   Potencia: " + honda.getPotencia());
		System.out.println("   kilometrgaem: " + honda.getKilometragem());
		System.out.println("   Proprietario1: " + honda.getNomeDosProprietarios()[0]);
		System.out.println("   Proprietario2: " + honda.getNomeDosProprietarios()[1]);
		
		fox.setCor("branca");
		
		System.out.println("\n FIXA FOX: ");
		System.out.println("   NOME: " + fox.getNome());
		System.out.println("   Cor: " + fox.getCor());
		System.out.println("   Ano: " + fox.getAno());
		System.out.println("   Modelo: " + fox.getModelo());
		System.out.println("   Potencia: " + fox.getPotencia());
		System.out.println("   kilometrgaem: " + fox.getKilometragem());
		System.out.println("   Proprietario1: " + fox.getNomeDosProprietarios()[0]);
		System.out.println("   Proprietario2: " + fox.getNomeDosProprietarios()[1]);
		
		
	}
	
}
