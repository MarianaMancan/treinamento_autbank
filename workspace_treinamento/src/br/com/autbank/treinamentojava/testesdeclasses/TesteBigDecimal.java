package br.com.autbank.treinamentojava.testesdeclasses;


import java.math.BigDecimal;

import br.com.autbank.utils.CalculoMat;



public class TesteBigDecimal { 
	
	public static void main(String[] args) {
		
		//Instancie 2 BigDecimal utilizando o método getBigDecimal
		//de CalculoMat.
		BigDecimal num1 = CalculoMat.getBigDecimal("12432");
		BigDecimal num2 = CalculoMat.getBigDecimal("9889682");
		//Verifique se o primeiro é maior que o segundo
		if(CalculoMat.ehMaior(num1, num2)==true) {
			System.out.println("O primeiro numero é maior") ;
		}
	      //Verifique se o primeiro é menor que o segundo
		if(CalculoMat.ehMenor(num1, num2)== true) {
			System.out.println("O primeiro numero é menor");
		}
       
         //Multiplique os dois objetos BigDecimal
		System.out.println(CalculoMat.multiplica(num1, num2));
		
	
	}

}
