       /*Autor: Letícia Ferreira da Silva
             * Data: 04.12.2021*/

     /*2-	Ler 10 números e imprimir quantos são pares e 
              quantos são ímpares. (FOR)*/

package Rbr.com.generation.laçosderepetição;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int par= 0, impar=0, nume=0;
		
		for( int n=0; n<10; n++)/*esse é o contador, vai rodar o bloco for 10X*/{
			System.out.println("Escreva um número:");
			nume= leia.nextInt();
			
			if (n%2==0) {
			 
				par++; //cada vez que rodar ele vai acrescentar +1 no par.
			}
			
			 else {
				 impar++; //Cada vez que rodar ele vai acrescentar +1 no impar. 
			 }
			
		}
		
		System.out.println("A qauntidade de numeros paraes é " + par);
		System.out.println("A qauntidade de numeros paraes é " + impar); 
		
		leia.close();
	}
	}


