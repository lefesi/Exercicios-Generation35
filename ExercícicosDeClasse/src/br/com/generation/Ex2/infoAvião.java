
   /*Autor Let�cia Ferreira da Silva 
         Data: 07.10.2021
 2) Crie uma classe avi�o e apresente os atributos e m�todos referentes esta classe, 
em seguida crie um objeto avi�o, defina as instancias deste objeto e apresente 
as informa��es deste objeto no console.*/

package br.com.generation.Ex2;

public class infoAvi�o {

	public static void main(String[] args) {
	
       Avi�o info= new Avi�o();
       
		info.setDestino("Paris");
		info.setQunantpassage(500);
		info.setQuanttripula��o(40);
		
		System.out.println("Qual o destino desse voo?:  " + info.getDestino());
		System.out.println("Quantas pessao h� na tripula��o?: " + info.getQuanttripula��o());
		System.out.println("O voo possui quantos passageniros?: "+ info.getQunantpassage());
		
	}

}
