package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TestesCachorro {

	public static void main(String[] args) throws Exception{
		
		Labrador novocachorro;
		Labrador novocachorro2;
		String[] nomevacinas = {"astrazenica","jhonson","pfizer","butanta"};
		//para chamar construtor com o parametro idade
		novocachorro = new Labrador(1);
		//para chamar construtor vazio
		//novocachorro = new Labrador();
		//para chmar construtor com o parametro vacinas
		novocachorro2 = new Labrador(nomevacinas);
		novocachorro.setCor("Marrom");
		novocachorro.setIdade(1);
		novocachorro.setName("MAX");
		novocachorro.setVacinas(nomevacinas);
		
		System.out.println( novocachorro.getCor());
		System.out.println( novocachorro.getIdade());
		System.out.println(novocachorro.getName());
		novocachorro.comer();
		novocachorro.dormir();
		novocachorro.latir();
		
		
	}
}
