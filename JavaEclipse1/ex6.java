package br.com.generation.javasequencial;

import java.util.Scanner;


public class ex6 {
 
	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		
		double x1, x2, y1, y2, d, a, b, pp;
	
	System.out.println("escreva o valor de x1");
		x1= leia.nextInt();
		
		System.out.println("escreva o valor de y1");
		y1= leia.nextInt();
		
		System.out.println("escreva o valor de x2");
		x2= leia.nextInt();
		
		System.out.println("escreva o valor de y2");
		y2= leia.nextInt();
		
		a=Math.pow((x2-x1),2);
		b=Math.pow((y2-y1),2);
		
	
		d = Math.sqrt(a+b);

		System.out.println("a distancia entre os pontos é: " +d);
		
	}
}	



