package br.com.autbank.treinamentojava.carro.impl;

public class CarroUtil {


		
		public static void verificaCarro(Carro carro) {
			if(carro instanceof Gol) {
				((Gol) carro).abrirVidros();
			}
			if(carro instanceof CarroMarca) {
				((CarroMarca)carro).ligarSom();
			}
		}
	
}
