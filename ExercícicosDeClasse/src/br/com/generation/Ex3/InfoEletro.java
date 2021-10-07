/*Autor Letícia Ferreira da Silva 
              Data: 07.10.2021
3) Crie uma classe produto eletrônico e apresente os atributos e métodos 
referentes esta classe, em seguida crie um objeto produto eletrônico, defina 
as instancias deste objeto e apresente as informações deste objeto no console*/
package br.com.generation.Ex3;

public class InfoEletro {

	public static void main(String[] args) {
		Eletro info= new Eletro();
		
		info.setDomesticos("TV");
		info.setUsopessoal("Kindle");
		info.setJogos("Xbox");
		
		System.out.println("Exemplo de produto eletrônico doméstico: " + info.getDomesticos());
		System.out.println("Exemplo de produto eletrônico de uso pessoal: " + info.getUsopessoal());
		System.out.println("Exemplo de produto eletrônico de Jogos: " + info.getJogos());
	}
	}
	


