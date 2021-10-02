package br.com.generation.javasequencial;
import java.util.Scanner;

import java.math.*;  

public class ex4 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int A, B, C;
		double D, R, S;
		
		System.out.println("escreva o valor de A");
		A= leia.nextInt();
		
		System.out.println("escreva o valor de B");
		B= leia.nextInt();
		
		System.out.println("escreva o valor de C");
		C= leia.nextInt();
		
		R= Math.pow((A+B),2);
		S= Math.pow((C+B),2);
		
		D= (R+S)/2;
		
		System.out.println("O resultado de D é: " + D);
		
		
		
		
		
	
		

	}

}
