          /*Autor: Letícia Ferreira da Silva
                    Data: 06.10.2021
                    
4.	Crie um programa que receba valores do usuário para preencher uma matriz 3X3, 
e em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, 
ou seja, diagonal principal.*/

package br.com.generation.ExerciciosdeMatriz;
import java.util.Scanner;
public class ExercícioMatriz4 {

	public static void main(String[] args) {
		Scanner leia= new Scanner(System.in);
		
		double[][] Matriz= new double[3][3];// fla que é uma matriz da o nome depois coloca quantas linhas 
		//e coluas,1º linhas depois colunas 
		
		int matrizS=0, linha=0, coluna=0, diagonalS=0;

				
				for(linha = 0; linha < 3; linha++){

					for(coluna = 0; coluna < 3; coluna ++){
						System.out.printf("Valor da Matriz posição [ " ,linha+1, " ] [ ",coluna+1," ] :");
						Matriz[linha][coluna]= leia.nextInt();
						
					}				
				}
				
					for (linha = 0; linha <3; linha++){

					for(coluna = 0; coluna <3; coluna++){
						
						matrizS += Matriz[linha][coluna];
						
						if(linha == coluna) {
							diagonalS += Matriz[linha][coluna];
						}
						
					}
					
				}

					System.out.printf("A soma da matriz é: " + matrizS);
					System.out.printf("\n\nA soma da diagonal da matriz é: " + diagonalS +"\n\n");

	}

}
