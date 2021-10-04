programa
{
	
	funcao inicio()
	{
		/*2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. 
		Faça um programa que gere um vetor com os lançamentos, escreva esse vetor.
		A seguir determine e imprima a média aritmética dos lançamentos, contabilize 
		e apresente também quantas foram as ocorrências da maior pontuação.*/

		inteiro dado[10], maiorD= 0 , quantosmaiorD= 0, contagem
		real media=0.0, soma=0.0
		logico dadovalido = falso 


		 para( contagem = 0 ; contagem < 10 ;contagem++){
		 
		 	enquanto(dadovalido!= verdadeiro){		
		 escreva("\nescreva o valor do dado de 1 a 6 do ", contagem+1,"º dado:" )
		 leia(dado[contagem])
		 
		 	se(dado[contagem] >=1 e dado[contagem] <=6){
		 		dadovalido= verdadeiro

		 	soma+= dado[contagem]
		 			
		 	se(dado[contagem]> maiorD){
		 		maiorD = dado[contagem]
		 		quantosmaiorD= 0 
		 		
		 	}
		 
		 	se(dado[contagem] == maiorD){
		 		quantosmaiorD++
		 	}
		 	}
		 	senao {
		 		dadovalido= falso
                escreva("valor invalido")
		 	}
		 	
		 		
		 	}
		 	    dadovalido= falso
		 }

		 	escreva ("A média foi de: "+soma/10)
		 	escreva("\n maior dado foi: " +maiorD+ " E ele se repitiu " +quantosmaiorD+ " vezes")
		 



	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 682; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */