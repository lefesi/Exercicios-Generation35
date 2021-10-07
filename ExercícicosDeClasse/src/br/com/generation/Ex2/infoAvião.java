
   /*Autor Letícia Ferreira da Silva 
         Data: 07.10.2021
 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto avião, defina as instancias deste objeto e apresente 
as informações deste objeto no console.*/

package br.com.generation.Ex2;

public class infoAvião {

	public static void main(String[] args) {
	
       Avião info= new Avião();
       
		info.setDestino("Paris");
		info.setQunantpassage(500);
		info.setQuanttripulação(40);
		
		System.out.println("Qual o destino desse voo?:  " + info.getDestino());
		System.out.println("Quantas pessao há na tripulação?: " + info.getQuanttripulação());
		System.out.println("O voo possui quantos passageniros?: "+ info.getQunantpassage());
		
	}

}
