       /*Autor: Let�cia Ferreira da Silva
             * Data: 04.12.2021*/

     /*2-	Ler 10 n�meros e imprimir quantos s�o pares e 
              quantos s�o �mpares. (FOR)*/

package Rbr.com.generation.la�osderepeti��o;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int par= 0, impar=0, nume=0;
		
		for( int n=0; n<10; n++)/*esse � o contador, vai rodar o bloco for 10X*/{
			System.out.println("Escreva um n�mero:");
			nume= leia.nextInt();
			
			if (n%2==0) {
			 
				par++; //cada vez que rodar ele vai acrescentar +1 no par.
			}
			
			 else {
				 impar++; //Cada vez que rodar ele vai acrescentar +1 no impar. 
			 }
			
		}
		
		System.out.println("A qauntidade de numeros paraes � " + par);
		System.out.println("A qauntidade de numeros paraes � " + impar); 
		
		leia.close();
	}
	}


