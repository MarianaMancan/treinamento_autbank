package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TesteCachorroInterface  {
    //Crie um método main e dentro desse método tente instanciar a
	//interface. Como ter acesso aos métodos?
	//usamos o extends para ter acesso aos metodos de uma interface
	public static void main(String[] args) {
		
		Labrador cachorro = new Labrador();
		
		cachorro.comer();
		cachorro.mover();
		
	}
}
