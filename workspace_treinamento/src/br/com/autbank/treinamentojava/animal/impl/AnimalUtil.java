package br.com.autbank.treinamentojava.animal.impl;

import br.com.autbank.treinamentojava.animal.cachorro.Cachorro;
import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.gato.impl.Gato;



public class AnimalUtil {

	
	
	public static void verificaAnimal(Animal animal) {
		
		if(animal instanceof Gato) {
			
			System.out.println("Gato");
			
			animal.emitirSom();	
			((Gato) animal).miar();
		
		}

		if(animal instanceof Cachorro) {
			
			System.out.println("Cachorro");
			
			animal.emitirSom();
			
		  ((Cachorro) animal).latir();
		
		}
	}
}
