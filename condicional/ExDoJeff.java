package br.com.generation.condicional;

import java.util.Scanner;

public class ExDoJeff {

	public static void main(String[] args) {
				
				Scanner leia = new Scanner(System.in);
				
				double numero1, numero2, resultado = 0.0;
				char operacao;
				
				System.out.println("Digite o primeiro número:");
				numero1 = leia.nextDouble();
				
				System.out.println("Digite a operação: ");
				operacao = leia.next().charAt(0);
				
				System.out.println("Digite o segundo número:");
				numero2 = leia.nextDouble();

				if(operacao == '+') {
		      
					resultado = numero1 + numero2;
		         
				}else if(operacao == '-') {
		      
					resultado = numero1 - numero2;
		         
				}
		      else if(operacao == 'x' || operacao == '*') {
		      
					resultado = numero1 * numero2;
		         
				}else if(operacao == '/') {
		      
					resultado = numero1 / numero2;
		         
				}
				System.out.println("Resultado: " + resultado);
				
				 leia.close();
			}
	
               

	}
