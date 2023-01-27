package br.com.autbank.treinamentojava.testesdeclasses;

import java.util.ArrayList;

public class TestaArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> array1 = new ArrayList();
		
		array1.add("Brazil");
		array1.add("EUA");
		array1.add("México");
		array1.add("Nova zelandia");
		array1.add("Russia");
		array1.add(5, "Japão");
		array1.add(6, "China");
		
		if(array1.isEmpty()== true) {
			System.out.println("Array está vazio");
		}
		else {
			System.out.println("Array não está vazio");
		}
		
		array1.remove(0);
		array1.remove(5);
		
		array1.set(2, "Canada");
		
		String[] str = (String[]) array1.toArray(new String[array1.size()]);
	}
}
