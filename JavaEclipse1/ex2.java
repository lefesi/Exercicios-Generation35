package br.com.generation.javasequencial;
import java.util.Scanner;
public class ex2 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		int idadeA, idadeM, idadeD, totalD;
		
		System.out.println("quantos dias você viveu?: ");
		totalD= leia.nextInt();
		idadeA= totalD/365;
		
		idadeM= (totalD%365)/30;
		
		idadeD= (totalD%365) % 30;
		
		System.out.println("idade anos"+ idadeA);
		System.out.println("Idade meses:  "+ idadeM);
		


	}

}
