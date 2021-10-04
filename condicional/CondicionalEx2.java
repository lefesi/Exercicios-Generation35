
//Autor: Letícia Ferreira da Silva
//Data : 04.10.2021

/*2-	Faça um programa que entre com três números e coloque em ordem crescente.*/

package br.com.generation.condicional;

     import java.util.Scanner;
     
public class CondicionalEx2 {

	public static void main(String[] args) {
	
        
		Scanner leia= new Scanner(System.in);
		
		int A, B, C;
		
		System.out.println("Escreva o valor de A:");
		A= leia.nextInt();
		
		System.out.println("Escreva o valor de B:");
		B= leia.nextInt();
		
		System.out.println("Escreva o valor de C:");
		C= leia.nextInt();
	
		if(A<=B && A<=C && B<=C) {
			System.out.println("A ordem crescente é " + A+" "+B+" "+ C );
		}
	 else if(A<=B && A<=C && B<=C){
			System.out.println("A ordem crescente é: "+ A+" " + C+" " + B );
	 }
	 else if(B<=A && B<=C && A<=C){
			System.out.println("A ordem crescente é: "+ B +" "+ A+" " + C );
	 }
	 else if(B<=A && B<=C && C<=A){
			System.out.println("A ordem crescente é: "+ B+" " + C+" "+ A );
	 }
	 else if(C<=A && C<=B && A<=B){
			System.out.println("A ordem crescente é: "+ C+" "+ A+" "+B );
	 }
	 else {
		}
		leia.close();
		
	}
	
	
	
	
	

}
