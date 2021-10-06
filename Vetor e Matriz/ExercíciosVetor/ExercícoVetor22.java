
          /*Autor: Letícia Ferreira da Silva
                    Data: 06.10.2021

2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
A seguir determine e imprima a média aritmética dos lançamentos, contabilize e 
apresente também quantas foram as ocorrências da maior pontuação.*/


package br.com.generation.ExercíciosVetor;

import java.util.Scanner;

public class ExercícoVetor22 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		int [] dado= new int[10];
		
		int  maiorD= 0 , quantosmaiorD= 0, contagem;
		double media=0.0, soma=0.0;
		
		boolean dadovalido = false;

		 for( contagem = 0 ; contagem < 10 ;contagem++){
			 
			 	while(dadovalido!= true){		
			 System.out.printf("\nescreva o valor do dado de 1 a 6 do ", contagem+1,"º dado:" );
				dado[contagem]= leia.nextInt();
			 
			 	if(dado[contagem] >=1 && dado[contagem] <=6){
			 		dadovalido= true;

			 	soma+= dado[contagem];
			 			
			 	if(dado[contagem]> maiorD){
			 		maiorD = dado[contagem];
			 		quantosmaiorD= 0;
			 		
			 	}
			 
			 	if(dado[contagem] == maiorD){
			 		quantosmaiorD++;
			 	}
			 	}
			 	else  {
			 		dadovalido= false;
			 System.out.printf("valor invalido");
			 	}
			 	
			 		
			 	}
			 	    dadovalido= false;
			 }

		 System.out.println("A média foi de: "+soma/10);
		 System.out.println("\n maior dado foi: " +maiorD+ " E ele se repitiu " +quantosmaiorD+ " vezes");
			 
 leia.close();

	}

}
