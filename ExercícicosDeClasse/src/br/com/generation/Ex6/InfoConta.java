
     /*Autor Letícia Ferreira da Silva 
              Data: 07.10.2021

6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta 
classe, em seguida crie um objeto conta bancaria, defina as instancias deste objeto
e apresente as informações deste objeto no console.*/

package br.com.generation.Ex6;

public class InfoConta {

	public static void main(String[] args) {
	
		Conta info= new Conta();
		
		info.setBanco("Brasil");
		info.setLimite(10000);
		info.setQuanto(8);
		
		
		info.qualbanco();
		System.out.println("Qual o nome do Banco?: "+ info.getBanco());
		info.qualolimite();
		System.out.println("Qual o limite da conta?: "+ info.getLimite());
		info.naconta();
		System.out.println("Quanto de dinheiro tem na conta?: "+ info.getQuanto());
		
		
		
	
		

	}

}
