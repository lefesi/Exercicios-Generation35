
//Autor: Letícia Ferreira da Silva
//Data : 04.10.2021

/*4-	Faça um programa em que permita a entrada de um número qualquer e 
 * exiba se este número é par ou ímpar. Se for par exiba também a 
 * raiz quadrada do mesmo se for ímpar exiba o número elevado ao quadrado.*/
 
package br.com.generation.condicional;

import java.util.Scanner;

public class CondicionalEx4 {
	public static void main(String[] args) {
    
		int A;
		
		Scanner leia = new Scanner(System.in); 

		System.out.println("Escreva um número inteiro: ");
		A= leia.nextInt();
		
		if(A%2 == 0.0) {
		System.out.println("Esse número é Par");
		System.out.println("logo sua raiz : "+ Math.sqrt(A));
		}
		
		else {
			System.out.println("Esse número é impar");
			System.out.println(" logo, o número elevado ao quadrado é: "+ Math.pow(A, 2));
		}
		leia.close();
		}
			
	}


