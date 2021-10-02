package br.com.generation.javasequencial;
  
import java.util.Scanner;

public class ex7 {

	public static void main(String[] args) {
		
		Scanner leia= new Scanner(System.in);
	
		double a,b,c,d,e,f, x, y;
		
          System.out.println("escreva o valor de a");
           a= leia.nextInt();
          System.out.println("escreva o valor de b");
          b= leia.nextInt();
          System.out.println("escreva o valor de c");
          c= leia.nextInt();
          System.out.println("escreva o valor de d");
          d= leia.nextInt();
          System.out.println("escreva o valor de e");
          e= leia.nextInt();
          System.out.println("escreva o valor de f");
          f= leia.nextInt();
          
          x= (c*e)-(b*f)/(a*e)-(b*d);
          y= (a*f)-(c*d)/(a*e)-(b*d);
          
          System.out.println("O resultado de x é: " + x);
          System.out.println("O resultado de y é: " + y);
          
          
	}
}	