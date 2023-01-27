package br.com.autbank.treinamentojava.exercicioarrays;

public class TesteArrays {
	
	public static void main(String[] args){
		
		String[] array1 = {"pos1",null,"","","posic2",null,null,"posc2"};
		
		
		 trataArrays(array1);
		
	}
	
	
	public static void trataArrays(String[] array) {
		
	
		for(int i = 0;i<array.length;i++) {
				
			if(array[i]!= null ) {
				if(array[i].isEmpty()== false) {
			array[i] = Integer.toString(array[i].length());
			System.out.println(array[i]);
				}
		}
		
	}
		return;
	}
	
}

 

