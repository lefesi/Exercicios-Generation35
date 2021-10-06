
          /*Autor: Letícia Ferreira da Silva
                    Data: 06.10.2021

3.	Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição das matrizes N1 e N2;
b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma posição das matrizes N1 e N2.*/

package br.com.generation.ExerciciosdeMatriz;

import java.util.Scanner;

public class ExercícioMatriz3 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
		double[][] N1= new double[4][6]; 
		double[][] N2= new double[4][6];
		double[][] M1= new double[4][6];
		double[][] M2= new double[4][6];


		for(int linha=0; linha<N1.length ; linha++){
			for(int coluna=0; coluna<N1.length; coluna++){
			System.out.printf("Escreva o valor de N1 [%d %d]", linha,coluna);
			N1[linha][coluna]= leia.nextDouble();	
				
			}
		}	
		System.out.println();
		for(int linha=0; linha<N2.length ; linha++){
			for(int coluna=0; coluna <N2.length ; coluna++){
			System.out.printf("Escreva o valor de N2 [%d %d]", linha,coluna);
			N2[linha][coluna]= leia.nextDouble();	
			}
			
		}
			System.out.println("\n\nM1 = N1 + N2");
			for( int linha = 0; linha < M1.length; linha++) {
				for (int coluna = 0; coluna <M1[linha].length; coluna++) {
					M1[linha][coluna] = N1[linha][coluna] + N2[linha][coluna];
					System.out.printf("["+M1[linha][coluna]+"] ");
				}
				System.out.println();
			} 
			System.out.println("\n\nM2 = N1 - N2");
			
			for( int linha = 0; linha < M2.length; linha++) {
				for (int coluna = 0; coluna <M2[linha].length; coluna++) {
					M2[linha][coluna] = N1[linha][coluna] - N2[linha][coluna];
					System.out.printf("["+M2[linha][coluna]+"]");
				}
				System.out.println();
			}
			leia.close();
			
		}
	}


