
        /*Autor: Let�cia Ferreira da Silva
             * Data: 04.12.2021*/

/*5-Crie um programa que leia um n�mero do teclado at� que encontre um n�mero igual a zero. 
No final, mostre a soma dos n�meros digitados.(DO...WHILE)*/

package Rbr.com.generation.la�osderepeti��o;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		
Scanner leia= new Scanner(System.in);

     int n=0, num=0, soma=0;
   do {
	   
   System.out.println("Escreva um numero interio: "); 
   n= leia.nextInt(); 
    if (n!=0)
    n++;   
    
   }while (n!=0) ;
	   
   System.out.println("A somo dos numeros digitados: "+ n);
	}
}
