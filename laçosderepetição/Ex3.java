      /*Autor: Letícia Ferreira da Silva
             * Data: 04.12.2021*/

/*3-	Solicitar a idade de várias pessoas e imprimir: 
Total de pessoas com menos de 21 anos. Total de pessoas 
com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)/*/


package Rbr.com.generation.laçosderepetição;

import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		
		int idade, menos=0, mais=0;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Qual a sua idade? ");
		idade= leia.nextInt();
		
		while (idade!=-99){// se for diferente de -99 vai rodar se não ele para o programa.
			
           if(idade<=21) {
        	   menos++;
           }
           if(idade>=50) {//A proposta desse if é =! do outro por isso 2 ifs
        	   mais++;    // Para ser else ou else if a variavel deve ser a mesma.
        	              // ou a mesma lógica. É um if para cada situação.
           }
          
           System.out.println("Para parar digite -99");
           idade= leia.nextInt();
           }
            System.out.println("A quantidade de pessoas com menos de 21 anos é: "+ menos);
            System.out.println("A quantidade de pessoas com mais de 50 anos é: "+ menos); 
     
            leia.close();
	}

}
