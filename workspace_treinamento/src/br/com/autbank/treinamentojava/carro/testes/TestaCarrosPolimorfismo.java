package br.com.autbank.treinamentojava.carro.testes;

import br.com.autbank.treinamentojava.carro.impl.CarroMarca;
import br.com.autbank.treinamentojava.carro.impl.CarroUtil;
import br.com.autbank.treinamentojava.carro.impl.Gol;

public class TestaCarrosPolimorfismo {

    public static void main(String[] args) {
    	
    	  Gol carroGol = new Gol();
    	  CarroMarca carrox = new CarroMarca();
    	  
    	  carroGol.setNome("CarroGOl");
    	  carroGol.setAno("2012");
    	  carroGol.setModelo("Gol");
    	  carroGol.setPotencia("1.0");
    	  carroGol.setKilometragem(100);
    	  carroGol.setCor("azul");
    	  
    	  carrox.setNome("carrox");
    	  carrox.setModelo("ferrari");
    	  carrox.setKilometragem(0);
    	  carrox.setPotencia("3.1");
    	  carrox.setAno("2023");
    	  carrox.setCor("vermelho");
    	  
    	  carrox.acelerar();
    	  carrox.abastecer();
    	  carrox.freiar();
    	  
    	  carroGol.abastecer();
    	  carroGol.freiar();
    	  carroGol.acelerar();
    	  
    	  
    	  System.out.println("\n fixa 1: ");
    	  System.out.println("nome: " + carroGol.getNome());
    	  System.out.println("cor: " + carroGol.getCor() );
    	  System.out.println("modelo: " + carroGol.getModelo());
    	  System.out.println("potencia: " + carroGol.getModelo());
    	  System.out.println("kilometragem :" + carroGol.getModelo());
    	  System.out.println("Ano: " + carroGol.getAno());
    	  
    	  
    	  System.out.println("\n fixa 2: ");
    	  System.out.println("nome: " + carrox.getNome());
    	  System.out.println("cor: " + carrox.getCor() );
    	  System.out.println("modelo: " + carrox.getModelo());
    	  System.out.println("potencia: " + carrox.getModelo());
    	  System.out.println("kilometragem :" + carrox.getModelo());
    	  System.out.println("Ano: " + carrox.getAno());
    	  
    	  
    	  CarroUtil.verificaCarro(carrox);
    	  CarroUtil.verificaCarro(carroGol);
    }
}
