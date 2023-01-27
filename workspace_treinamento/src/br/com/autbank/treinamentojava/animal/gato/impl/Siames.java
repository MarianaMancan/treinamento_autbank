package br.com.autbank.treinamentojava.animal.gato.impl;

public class Siames extends Gato{

	@Override
	public void emitirSom() {
		
		System.out.println("miau miau");
		
	}

	@Override
	public void mover() {

		System.out.println(nome + "está se movendo");
	}

	@Override
	public void comer() {
		
		System.out.println(nome + "está comendo");
		
	}

	@Override
	public void brincar() {
		
		System.out.println(nome + "está brincando");
		
	}

	@Override
	public void arranhar() {
		
		System.out.println(nome + "está arranhando");
		
	}

	@Override
	public void ronronar() {
		
		System.out.println(nome + "está ronronando");
		
	}

	@Override
	public void miar() {
		// TODO Auto-generated method stub
		System.out.println(nome + "está miando");
	}

}
