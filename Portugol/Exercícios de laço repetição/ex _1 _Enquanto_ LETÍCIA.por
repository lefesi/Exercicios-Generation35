programa
{      /*AUTOR:letícia Ferreira da Silva
         DATA: 27/09/2021*/
	
	funcao inicio()
	{
	                                 // ENQUANTO
       /*1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no 
        * final o total do somatório,a média e o total de valores lidos. O programa deve fazer 
        * as leituras dos valores enquanto o usuário 
       estiver fornecendo valores positivos. Ou seja, o programa deve parar quando o usuário
       fornecer um valor negativo.*/

       inteiro contador=0,num= 0, somaN = 0, media //fornecer o tipo de variavel
     
		//a repetição enquneto precisa de uma condição que no caso é >=a 0
       enquanto( contador>=0){//assim vai fazer um looping infinito
       escreva("numero positivo: ")//o usuario ira colocar um numero que seja positivo
       leia(num)
      // leia(cont)//ira ler o umero que o usuario colocou.
       //contador= contador++// sera agregado sempre mais 1 ao número

       contador++// ele vai adicionar sempre mais 1 ao contador 
       somaN += num 

       media= somaN/contador
       escreva(" \nO  soma total dos números: \n", somaN)
       
       escreva(" A media dos da soma: ", media)

       escreva("\nQuantos numeros foram somados: \n", contador  )
       
       
       }

       
       
      
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1322; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */