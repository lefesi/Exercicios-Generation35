
//Autor: Let�cia Ferreira da Silva
//Data : 04.10.2021

/*4-	Fa�a um programa em que permita a entrada de um n�mero qualquer e 
 * exiba se este n�mero � par ou �mpar. Se for par exiba tamb�m a 
 * raiz quadrada do mesmo se for �mpar exiba o n�mero elevado ao quadrado.*/
 
package br.com.generation.condicional;

import java.util.Scanner;

public class CondicionalEx4 {
	public static void main(String[] args) {
    
		int A;
		
		Scanner leia = new Scanner(System.in); 

		System.out.println("Escreva um n�mero inteiro: ");
		A= leia.nextInt();
		
		if(A%2 == 0.0) {
		System.out.println("Esse n�mero � Par");
		System.out.println("logo sua raiz : "+ Math.sqrt(A));
		}
		
		else {
			System.out.println("Esse n�mero � impar");
			System.out.println(" logo, o n�mero elevado ao quadrado �: "+ Math.pow(A, 2));
		}
		leia.close();
		}
			
	}


