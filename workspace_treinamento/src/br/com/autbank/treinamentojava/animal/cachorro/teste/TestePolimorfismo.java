package br.com.autbank.treinamentojava.animal.cachorro.teste;

import br.com.autbank.treinamentojava.animal.cachorro.Labrador;
import br.com.autbank.treinamentojava.animal.gato.impl.Siames;
import br.com.autbank.treinamentojava.animal.impl.AnimalUtil;

public class TestePolimorfismo {

	public static void main(String[] args) throws Exception {
		
		Siames a = new Siames();
		Labrador b = new Labrador();
		
		//Quais métodos são acessíveis através desta variável de referência?
		//Qual objeto foi criado na memória?
	    //já que gato implementa a interface animal e siames extends a class gato, todos os
		// metodos presentes em Animal e gato existem em siames
		
		a.setNome("lala ");
		a.ronronar();
		a.arranhar();
		a.comer();
		a.brincar();
		a.ronronar();
		a.mover();
		a.miar();
		
		//Da mesma forma Cachorro implementa a interface animal e Labrador extende cachorro
		//dessa forma temos acesso a todos metodos ou atributos presentes em animal e cachorro
		
		b.setName("NINO ");
		b.emitirSom();
		b.andar();
		b.comer();
		b.dormir();
		b.mover();
		b.latir();
		
		AnimalUtil.verificaAnimal(a);
	}
	
	
}
