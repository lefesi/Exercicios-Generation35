package br.com.generation.javasequencial;
import java.util.Scanner;
public class ex8 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		double custoF, custoC, valorI, valorD;
		
		System.out.println("Escreva o valor do carro no custo da f�brica: ");
		custoF= leia.nextInt();
		
		valorI= 0.28;
		valorD= 0.45;
		
		custoC= custoF + (custoF * valorI) + (custoF * valorD);

		System.out.println("O valor a custo de f�brica inserido � de: R$ " + custoF);
		System.out.println("O custo de um carro novo � de :R$ " + custoC);

	}

}
