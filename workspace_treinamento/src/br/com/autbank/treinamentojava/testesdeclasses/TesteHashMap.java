package br.com.autbank.treinamentojava.testesdeclasses;
import java.util.HashMap;
public class TesteHashMap {

	
	public static void main(String[] args) {
		
		
		
		HashMap<Integer,String> list = new HashMap<Integer,String>();
	  
	
	    list.put(0, "Fernando");
	    list.put(1,"Elis");
	    list.put(2, "Gabriel");
	    list.put(3, "Lara");
	    
	    for(int i=0;i<list.size();i++) {
	    	System.out.println(list.get(i));
	    }
	    
	}
}
