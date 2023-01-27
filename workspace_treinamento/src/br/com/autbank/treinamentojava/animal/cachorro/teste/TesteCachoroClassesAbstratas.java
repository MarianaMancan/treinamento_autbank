package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TesteCachoroClassesAbstratas {

//Crie um método main e tente instanciar a classe abstrata. Como

//é possível ter acesso aos métodos e variáveis dessa classe? Se elas

//não podem ser instanciadas elas podem ter construtores?
	
//Para ter um objeto de uma classe abstrata é necessário criar uma classe
//mais especializada herdando dela e então instanciar essa nova classe. 
//Os métodos da classe abstrata devem então serem sobrescritos nas classes filhas.
//classe abstratas podem ter construtores
	
	public static void main(String args[]) throws Exception {
		
		Labrador filhote1 = new Labrador();
		
		filhote1.setCor("branco");
		filhote1.setName("JUCA");
		filhote1.setPorte("medio");
		filhote1.setRaça("labrador");
		
		filhote1.andar();
		
	}
	


}
