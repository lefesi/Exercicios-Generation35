package br.com.generation.javasequencial;
import java.util.Scanner; 
public class ex5 {

	public static void main(String[] args) {
	
     Scanner leia= new Scanner(System.in);
     
     double n1,n2,n3, peso1, peso2, peso3, peso4, nota1, nota2, nota3, quantiP, final12, final1;
     
     System.out.println("escreva nota 1");
     n1= leia.nextInt();
     
     System.out.println("escreva nota 2");
     n2= leia.nextInt();
     
     System.out.println("escreva nota 3");
     n3= leia.nextInt();
     
     peso1= 2;
     peso2= 3;
     peso3= 5;
     nota1= n1*peso1;
     nota2= n2*peso2;
     nota3= n3*peso3;
     
     quantiP=3;
     
     final1= nota1+nota3+nota2;
     final12= final1/peso3;
     
     System.out.println("meida final: " + final12);
     
     
     
     
     
	}
	

}
