package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;
import br.com.autbank.treinamentojava.carro.impl.Gol;

public class TestaCachorroSobrecarga {
	
	public static void main(String[] args) throws Exception {
		
		Labrador cachorro = new Labrador();
        Gol gol = new Gol();
		cachorro.setName("Max");
		cachorro.setCor("marron");
		cachorro.setIdade(3);
		cachorro.setPorte("medio");
		cachorro.setRaça("golden");
		cachorro.latir();
		cachorro.latir("au au");
		cachorro.latir("auuuuuu", "auauau");
		cachorro.latir(1234);
		//Se existisse dois métodos:
        //public void latir(long par) e public void latir(int par)
        //qual método seria chamado no caso latir(1234);
		//o metodo in pois  O tipo de dados long é usado para conter o 
		//número inteiro maior que int não pode conter
		
		if(cachorro.equals(gol)== false) {
			System.out.println("os objetos nao sao iguais");
		}
		System.out.println(cachorro.toString());
	}

}
