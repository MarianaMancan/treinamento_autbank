package br.com.autbank.treinamentojava.animal.testes;

import br.com.autbank.treinamentojava.animal.cachorro.Cachorro;
import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.gato.impl.Gato;
import br.com.autbank.treinamentojava.animal.gato.impl.Siames;


public class TestaContratoInterface {

	
	public static void main(String[] args) {
		Siames gatinho = new Siames();
		testaAnimal(gatinho);
	}
	
	
	
	
	public static void  testaAnimal(Animal animal) {
        if(animal instanceof Gato) {
			
			System.out.println("Gato");
	        animal.comer();
			animal.emitirSom();	
			animal.mover();
			((Gato) animal).brincar();
			((Gato) animal).arranhar();
			((Gato) animal).miar();
			((Gato) animal).mover();
			((Gato) animal).ronronar();
		
		}

		if(animal instanceof Cachorro) {
			
			System.out.println("Cachorro");
			animal.comer();
			animal.emitirSom();
		    animal.mover();
		    ((Cachorro) animal).andar();
		    ((Cachorro) animal).latir();
		    ((Cachorro) animal).dormir();
		    
		}
		
	}
}
