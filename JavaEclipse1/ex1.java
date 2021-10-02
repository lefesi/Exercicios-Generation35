package br.com.generation.javasequencial;
	import java.util.Scanner; 
	
public class ex1 {

	public static void main(String[] args) {
		
		
	  Scanner leia = new Scanner(System.in);
		
	  
     int diaAtual, mesAtual, anoAtual, diaNascimento , mesNascimento, anoNascimento, total;
     
     System.out.println("qual o dia do seu nascimento? ");
     diaNascimento= leia.nextInt();
      
     System.out.println("Qual o mes em dia do seu nascimento?  ");
     mesNascimento= leia.nextInt();
     
     System.out.println("Qual o ano do seu nascimento?: ");
     anoNascimento= leia.nextInt();
     
     System.out.println("dia atual: ");
    diaAtual= leia.nextInt();
    
    System.out.println( "mês atual : ");
    mesAtual= leia.nextInt();
    
    System.out.println("ano atual");
    anoAtual=leia.nextInt(); 
    
    total= (anoAtual - anoNascimento) *365 + (mesAtual* 30 + diaAtual)-(mesNascimento *30 + diaNascimento);
    
    System.out.println("sua idade em dias é" + total+ "dias");	
  		
  
    		
    
   
    	
     
    		 
     
     
     
     
     
	}
	

}
