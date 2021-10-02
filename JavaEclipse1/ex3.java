package br.com.generation.javasequencial;

 import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
	
		double horas, segundos, divisaoH, minutos, divisaoM, divisaoS, um;
		
		System.out.println("escrva o tempo do evento em segundos:");
		segundos= leia.nextInt();
		horas= 60*60;
		divisaoH= segundos/horas;
				
		System.out.println("duração do evento em horas " + divisaoH);
		
		minutos= 60;
		divisaoM= segundos/minutos;
		
		System.out.println("Duração do evento em minutos" + divisaoM);
		
		um=1;
		
		divisaoS= segundos/um;
		
		System.out.println("duração do evento em segundos"+ divisaoS);
		
		
		
		
		
				
		
		
		

	}

}
