
/*Autor: Let�cia Ferreira da Silva
       * Data: 04.12.2021*/

/*1Informar todos os n�meros de 1000 a 1999 que quando divididos por 
 11 obtemos resto = 5. (FOR)*/
 

package Rbr.com.generation.la�osderepeti��o;
 
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
	   
	Scanner leia= new Scanner(System.in);
	
	for (int n = 1000; n>=1000 && n<= 1999; n++ ) {
	
	if( n%11 == 5) {
        System.out.println( n + " Quando divido por 11 o resto � 5.");

	}
	}
		
leia.close();
	}

}
