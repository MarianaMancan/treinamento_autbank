package br.com.autbank.treinamentojava.testes;


import br.com.autbank.treinamentojava.animal.cachorro.Labrador;

public class TesteCachorroException {
	
	public static void main(String[] args) throws Exception {
		String[] listavacinas = {"Antirrábica","Vacina contra Leishmaniose","Vacina contra giárdia","Vacina contra Gripe Canina"};
		Labrador cachorro = new Labrador();
		try {
			cachorro.setIdade(-32);
			cachorro.setName(null);
		}catch(Exception e) {
			System.out.println("exceção capturada");
		}

		
		Labrador labrador = new Labrador(listavacinas,"",-1,"");
			
		Labrador labrador2 = new Labrador(listavacinas,"branco",-1,"");
		//a execução do programa parou pois geramos um exceção
	}

}
