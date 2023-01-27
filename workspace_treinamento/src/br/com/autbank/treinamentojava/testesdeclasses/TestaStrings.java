package br.com.autbank.treinamentojava.testesdeclasses;

public class TestaStrings {
	
	public static void main(String[] args) {
		String s = "Teste de strings        ";
	
		//replace substitui as opisiçoes ou as letras selecionadas
		//O parâmetro oldChar representa o caractere que será substituído
		//pelo valor no parâmetro newChar. 
		System.out.println(s.replace("de", "das"));
		///o metodo trim substitui os espaços em branco antes e depois da palavra
		System.out.println(s.trim());
		//toLowerCase deixa todos as letras em minusculo
		System.out.println(s.toLowerCase());
		//to string traz uma representação textual de uma instância de um objeto
		System.out.println(s.toString());
		//substring retorna uma parte específica de uma determinada String
		System.out.println(s.substring(0, 4));
		//charAT Retorna o caractere em uma localização específica em uma String.
		System.out.println(s.charAt(6));
		//lenght retorna a quantida de caracteres
		System.out.println(s.length());
        //Imprimam novamente o valor de s. Ele foi alterado?
		System.out.println(s); //não foi alterado pois nao atribuimos nenhuma manipulaçao de 
		// string para a string
		//para alterar precisaremos fazer assim:
		s = s.replace("de", "das");
		System.out.println(s);
}
}
