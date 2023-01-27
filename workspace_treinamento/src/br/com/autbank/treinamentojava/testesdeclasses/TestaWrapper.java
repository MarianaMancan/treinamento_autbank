package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaWrapper {

	public static void main(String[] args) {
		
		int i = 10;
		//Crie uma String
		String st = Integer.toString(i);
		System.out.println(st);
		//Com a String, crie um Float
		float f = Float.parseFloat(st);
		System.out.println(f);
		//Com o Float, crie um Double
		Double D = Double.parseDouble(String.valueOf(f));
		System.out.println(D);
		//Com o Double, crie um double
		double d = (double) D;
		System.out.println(d);
		//Com o double, crie novamente uma String
		String newSt = String.valueOf(d);
		System.out.println(newSt);
		//Com a String, crie um novo int
		int newI = Integer.parseInt(newSt);
		
	}
}
