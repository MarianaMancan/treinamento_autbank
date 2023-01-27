package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TesteCachorroHeranca {

	public static void main(String[] args) throws Exception {
		
		Labrador cachorro = new Labrador();
		cachorro.setName("lulu");
		
		cachorro.andar();
		cachorro.comer();
		cachorro.dormir();
		cachorro.emitirSom();
		cachorro.mover();
	}
}
