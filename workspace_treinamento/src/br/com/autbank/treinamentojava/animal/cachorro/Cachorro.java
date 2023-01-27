package br.com.autbank.treinamentojava.animal.cachorro;

import br.com.autbank.treinamentojava.animal.cachorro.dt.Animal;
import br.com.autbank.treinamentojava.animal.cachorro.dt.FalhaAoCriarCachorroException;

public abstract class Cachorro implements Animal{
	
	public Cachorro() {
		super();
	}



	public String porte;
	public String raça;
	public int idade;
	public String nome;
	public String cor;
	public String[] vacinas;
	
	public Cachorro(String porte, String raça, int idade, String nome, String cor, String[] vacinas) throws Exception {
		super();
		this.porte = porte;
		this.raça = raça;
		this.idade = idade;
		this.nome = verifica_nome(nome);
		this.cor = verifica_cor(cor);
		this.vacinas = vacinas;
	}
	
	/*public String verifica_cor(String cor) throws Exception {
		if(cor == null || cor == "") {
			throw new Exception("COR NAO PODE SER NULA OU VAZIA!");
		}
		return cor;
		
	}
	
	public String verifica_nome(String nome) throws Exception{
		if(nome == null || nome == "") {
			throw new Exception("NOME NAO PODE SER NULO OU VAZIO!");
		}
		return nome;
	}

	*/ 
	public String verifica_cor(String cor) throws Exception {
		if(cor == null || cor == "") {
			throw new FalhaAoCriarCachorroException();
		}
		return cor;
		
	}
	
	public String verifica_nome(String nome) throws Exception{
		if(nome == null || nome == "") {
			throw new FalhaAoCriarCachorroException();
		}
		return nome;
	}

	
	public int getIdade() {
		return idade;
	}

/*	public void setIdade(int idade) throws Exception {
		
		
		if(idade>0)	{
			this.idade = idade;
		}	
		else {
			throw new Exception("Idade inválida!");
		}
	
	}
*/
	public void setIdade(int idade) throws Exception {
		
		
		if(idade>0)	{
			this.idade = idade;
		}	
		else {
			throw new FalhaAoCriarCachorroException();
		}
	
	}
	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String getRaça() {
		return raça;
	}

	public void setRaça(String raça) {
		this.raça = raça;
	}

	public abstract void latir();
	
	public abstract void latir(String latido);
	
	public abstract void latir(String latido1,String latido2);
	
	public abstract void andar();
	
	public  abstract void dormir();
	
	public abstract void latir(long par);
	
	public abstract void latir(int par);
	


public  abstract void comer();
}
