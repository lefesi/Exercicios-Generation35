package br.com.generation.condicional;
  
//Autor: Let�cia Ferreira da Silva
//Data : 04.10.2021

   /*1-Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.*/



import java.util.Scanner;

public class CondicionalEx01 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Escreva o valor de A");
		A = leia.nextInt();
		
		System.out.println("Escreva o valor de B");
		B = leia.nextInt();
		
		System.out.println("Escreva o valor de C");
		C = leia.nextInt();
		
		if(A>B && A>C){
		System.out.println("A possui o maior valor: "+ A);
		} 
		else if(B>A && B>C){
		System.out.println("B possui o maior valor: "+ B);
	    } 
		
		else{
		System.out.println("C possui o maior valor: "+ C);
		}
		
		leia.close();
			
	}

}
