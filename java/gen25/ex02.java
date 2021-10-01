package br.com.generation.gen25;
 
import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia= new Scanner(System.in);
		
		int anos, meses, dias, totalD;
 
		System.out.println("escreva qauntos dias vc ja viveu: ");
		
		totalD= leia.nextInt();
		
		anos= totalD/365;
		
		meses= (totalD%365)/30;
		
		dias = (totalD%365) % 30;
		
		System.out.println("a idade é: "+ anos);
		System.out.println("MESES: "+ meses);
		System.out.println("DIAS: "+ dias);
		
		leia.close();

	}

}
