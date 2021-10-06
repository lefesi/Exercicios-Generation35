

             /*Autor: Letícia Ferreira da Silva
                    Data: 06.10.2021
   1.	Faça um programa que crie um vetor por leitura com 5 
   valores de pontuação de uma atividade e o escreva em seguida. 
   Encontre após a maior pontuação e a apresente.*/                  


package br.com.generation.ExercíciosVetor;

import java.util.Scanner;

public class ExercícoVetor1 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		int [] nota= new int[5];
		double maiorN=0.0;
		
		for( int cont=0; cont<nota.length; cont++) {//esse contador vai ler a primeira linha e nós inserimos  anota nele
			System.out.println("Escreva uma as notas" );	
			nota[cont]= leia.nextInt();
			
			if(nota[cont]> maiorN) {
				maiorN = nota[cont];
			}
		}
		System.out.println("A maior nota é "+ maiorN);
		leia.close();
		}
}
