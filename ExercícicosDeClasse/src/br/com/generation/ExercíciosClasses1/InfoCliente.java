        /*Autor Let�cia Ferreira da Silva 
                  Data: 07.10.2021
1) Crie uma classe cliente e apresente os atributos e m�todos referentes esta classe, 
em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
informa��es deste objeto no console.*/

package br.com.generation.Exerc�ciosClasses1;

public class InfoCliente {

	public static void main(String[] args) {
	

	Cliente info= new Cliente();
	
      info.setNome("Let�cia");
      info.setPre�ocompra(100);
      info.setTipodecompra("Roupas");
      
      System.out.println("Nome do cliente: " + info.getNome());
      System.out.println("Quantos o cliente gastou: " + info.getPre�ocompra()+ "R$");
      System.out.println("Qual o tipo de compra o cliente fez? "+info.getTipodecompra());
	}	
}