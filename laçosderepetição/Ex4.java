
      /*Autor: Let�cia Ferreira da Silva
             * Data: 04.12.2021*/
/*4-	Uma empresa desenvolveu uma pesquisa para saber as caracter�sticas psicol�gicas 
 * dos indiv�duos de uma regi�o. Para tanto, a cada uma das pessoas era perguntado: idade, 
 * sexo (1-feminino / 2-masculino / 3-Outros), e as op��es (1, se a pessoa era calma; 2, se a 
 * pessoa era nervosa e 3, se a pessoa era agressiva). Pede-se para elaborar um sistema que 
 * permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
 
�	o n�mero de pessoas calmas; 
�	o n�mero de mulheres nervosas; 
�	o n�mero de homens agressivos; 
�	o n�mero de outros calmos;
�	o n�mero de pessoas nervosas com mais de 40 anos; 
�	o n�mero de pessoas calmas com menos de 18 anos.*/


package Rbr.com.generation.la�osderepeti��o;
  
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
	int idade=0, sexo=0, carac=0, pes=0, cal=0, fem=0, hom=0, outr=0, mais=0, menos=0, num=0;
	
	Scanner leia= new Scanner(System.in);
	
	
	
	while(pes!=100) {
		System.out.println("Quantos anos voc� tem...? ");
		idade= leia.nextInt();
		
		System.out.println("Quantos seu sexo? Escolha entre 1,2 e 3");
		sexo= leia.nextInt();
		
		System.out.println("Quais suas caracteristicas? Escolha entre 1,2,3");
		carac= leia.nextInt();
		
		if( carac==1) {//Pessoas calmas
			cal++;
		}
	    if(sexo==1 && carac==2 ) {//N�mero de mulheres 1 nervosas 2
	    	fem++;
	    }
	    if(sexo==2 && carac==3){//N�mero de homens 2 agressivos 3;
	    	hom++;
	    }
	    if (sexo==3 && carac==1){//N�mero de outros 3 calmos 1;
	    	outr++;
	    }
	    if (carac==1 && idade>=40){//N�mero de pessoas nervosas com mais de 40 anos;
    	mais++;	
		}	
	   if(carac==1 && idade<=18){//n�mero de pessoas calmas com menos de 18 anos
	   menos++;		
	   }
	   System.out.println("Para parar a pesqueisa digite o n�mero 100");
	   pes=leia.nextInt();
	   
	}	
    System.out.println(" O n�mero de pessoas calmas �Pessoas calmas" + cal);
	System.out.println("N�mero de mulheres  nervosas : "+ fem);
	System.out.println("N�mero de homens agressivos : "+ hom);
	System.out.println("N�mero de outros  calmos : " + outr); 
	System.out.println("N�mero de pessoas nervosas com mais de 40 anos: "+ mais);
	System.out.println("n�mero de pessoas calmas com menos de 18 anos" +menos);
	
	leia.close();
}
}
	


