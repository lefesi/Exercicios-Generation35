
//Autor: Let�cia Ferreira da Silva
//Data : 04.10.2021

/*3-	Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:
�	10-14 infantil
�	15-17 juvenil
�	18-25 adulto
*/

package br.com.generation.condicional;

 import java.util.Scanner;

public class CondicionalEx3 {

	public static void main(String[] args) {
		
      Scanner leia= new Scanner(System.in);
      
      int idade;
      
      System.out.println("Quantos anos voc� tem? : ");
      idade= leia.nextInt();
      
      if (idade>=10 && idade<=14) {
    	  System.out.println("Voc� esta na categoria infantil ");
      }
      else if (idade>=15 && idade<=17) {
        	  System.out.println("Voc� esta na categoria Juvenil");
    	  }
      else if (idade>=18 && idade<=25) {
            	  System.out.println("Voc� esta na categoria Adulto ");
      }
      else {
    	  System.out.println("Sua categora n�o consta."+"\n Cadastro encerrado.");
      }
    	leia.close();
      
	}

}
