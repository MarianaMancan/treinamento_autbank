package br.com.autbank.treinamentojava.animal.cachorro.dt;

public class FalhaAoCriarCachorroException extends Exception{
	
	public static void main(String[]args) {
		System.out.println("ERROR AO CRIAR CACHORRO");
	}
 /// para gerar essa exceção é necessario criar “catch (FalhaAoCriarCachorroException
 //	e) ou throw new FalhaAoCriarCachorroException
	
//Como você faria para que esta exceção pudesse receber
//	uma mensagem como parâmetro?
//Passando no construtor da mensagem dessa forma
//public UsuarioNaoLogado (String message){
//    super(message);
//}
}
