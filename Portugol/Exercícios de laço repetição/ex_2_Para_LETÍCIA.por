programa
{
         /*AUTOR:letícia Ferreira da Silva
           DATA: 27/09/2021*/
	
	funcao inicio()
	{
		                                 //PARA
		/*2- Desenvolver um sistema que efetue a soma de todos os números ímpares que são  
		 múltiplos de três e que se encontram no conjunto dos números de 1 até 500.*/

		 inteiro soma = 0, contador

		 para( contador= 1; contador>= 1 e contador<= 500; contador++){
		 	
		 	se(contador%3 == 0)

		 	soma+= contador
		 }

		 	escreva("A soma de todos os impares multiplos de 3: ", soma, "\n")
		 
		 
		 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 413; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */