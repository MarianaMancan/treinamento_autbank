package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TesteCachorroEstruturaRepeticao {
	
	public static void main(String[] args) throws Exception {
		
		
		String[] listavacinas = {"Antirrábica","Vacina contra Leishmaniose","Vacina contra giárdia","Vacina contra Gripe Canina"};
		Labrador cachorro1 = new Labrador(listavacinas,"dourado",1,"MARLYN");
		Labrador cachorro2 = new Labrador(listavacinas,"marron",3,"Jujuba");
		
		System.out.println("FIXA 1");
		System.out.println("Nome : " + cachorro1.getName());
		System.out.println("Cor : " + cachorro1.getCor());
		
		for(int i = 0;i<cachorro1.getVacinas().length;i++) {
			System.out.println("Vacina :" + cachorro1.getVacinas()[i]);
		}
		
		System.out.println("\n FIXA 2");
		System.out.println("Nome : " + cachorro2.getName());
		System.out.println("Cor : " + cachorro2.getCor());
		
		for(int i = 0;i<cachorro2.getVacinas().length;i++) {
			System.out.println("Vacina :" + cachorro2.getVacinas()[i]);
		}
		
	}

}
