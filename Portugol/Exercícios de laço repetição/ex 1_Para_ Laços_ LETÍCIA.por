programa
{
	inclua biblioteca Matematica--> mat
	
	funcao inicio()

	/*1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos. A prefeitura deseja saber:   
a) média do salário da população; 
b) média do número de filhos; 
c) maior salário;
d) percentual de pessoas com salário até R$100,00.*/

	{
		inteiro contador, filhos, totalFilhos = 0, percentual = 0, totalSalario100 = 0
		real salario, totalSalario = 0.0, maiorSalario = 0.0, mediaSalario = 0.0

		para (contador = 0; contador < 4; contador++) {

			escreva("\nInforme seu salário: ")
				leia(salario)			
			escreva("Informe quantos filhos: ")
				leia(filhos)

			se (salario > maiorSalario) { 
				maiorSalario = salario
			}

			se (salario <= 100) {
				totalSalario100 += 1
			}

			// totalSalario = totalSalario + salario
			totalSalario += salario
			totalFilhos += filhos
			percentual = (totalSalario100*100) / 4
			mediaSalario = totalSalario/4
		}
	
		escreva("\n\n  Relatório \n")
		escreva("\n Maior salário.......................:  ", mat.arredondar(maiorSalario, 2))
		escreva("\n Salário médio da População..........:  ", mat.arredondar(mediaSalario, 2))
		escreva("\n Quantidade média de filhos..........: ", totalFilhos/4)
		escreva("\n Percentual com salário até R$100,00.: ", percentual, "%\n\n")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 820; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */