package br.com.autbank.treinamento.pessoa.testes;

import br.com.autbank.treinamentojava.pessoa.impl.Pessoa;
import br.com.autbank.treinamentojava.pessoa.impl.TENomeNaoInformadoException;
import br.com.autbank.treinamentojava.pessoa.impl.TOPessoa;

public class TestePessoa {
	
	
	public static void main(String[] args) throws TENomeNaoInformadoException {
		
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 =new Pessoa("Ana",32,"12345678888");
		
		pessoa1.setCpf("4297443321");
		pessoa1.setIdade(20);
		pessoa1.setNome("Claudia");
		
		
		
		System.out.println("FIXA PESSOA1");
		System.out.println("Nome :" + pessoa1.getNome());
		System.out.println("CPF: " + pessoa1.getCpf());
		System.out.println("Idade: " + pessoa1.getIdade());
			
			
		System.out.println("/nFIXA PESSOA2");
		System.out.println("Nome :" + pessoa2.getNome());
		System.out.println("CPF: " + pessoa2.getCpf());
		System.out.println("Idade: " + pessoa2.getIdade());
		
		Pessoa.verifcar_cpf(pessoa1.getCpf());
		Pessoa.verifcar_cpf(pessoa2.getCpf());
		
		
		TOPessoa pessoa3 = new TOPessoa();
		pessoa3.setNome(null);
	}
 //Uma declaração com o modificador public pode ser acessada de qualquer 
//lugar e por qualquer entidade que possa visualizar a classe a que ela pertence.
	
//Os membros da classe definidos como não podem ser acessados ou usados por 
//nenhuma outra classe. Esse modificador não se aplica às classes, somente para 
//seus métodos e atributos. Esses atributos e métodos também 
//não podem ser visualizados pelas classes herdadas.	
	
	
//O modificador protected torna o membro acessível às classes do mesmo pacote ou 
//através de herança, seus membros herdados não são acessíveis a outras classes 
//fora do pacote em que foram declarados.
	
//A classe e/ou seus membros são acessíveis somente por classes do mesmo pacote,
//na sua declaração não é definido nenhum tipo de modificador, sendo este 
//identificado pelo compilador.	

}
