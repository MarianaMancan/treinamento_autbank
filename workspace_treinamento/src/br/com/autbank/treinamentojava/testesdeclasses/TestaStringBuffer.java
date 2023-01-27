package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaStringBuffer {

	 public static void main(String[] args) {
		 StringBuffer sb = new StringBuffer("TESTE");
		 
		 //o metodo append é usado para anexar a string
		 
		 System.out.println( sb.append("m"));
		 
		 //o metodo delete é para deletar caracteres nos indices
		 System.out.println(sb.delete(2, 4));
		 
		 // é usado para inverter os caracteres no StringBuffer. O método faz com
		  //que essa sequência de caracteres seja substituída pelo inverso da sequência. 
		 System.out.println(sb.reverse());
		 
		 //Concatene neste objeto a String “de StringBuffer”
		 System.out.println(sb.append("de StringBuffer"));
		 
		 //Remova “de” e imprima no console.
		 System.out.println(sb.delete(4, 6));
		 
		 //Chame o método deleteCharAt(-20). O que acontece?
		 System.out.println(sb.deleteCharAt(-20));
		 //gera excecçao
	 }
}
