/*Autor Let�cia Ferreira da Silva 
              Data: 07.10.2021
3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos 
referentes esta classe, em seguida crie um objeto produto eletr�nico, defina 
as instancias deste objeto e apresente as informa��es deste objeto no console*/
package br.com.generation.Ex3;

public class InfoEletro {

	public static void main(String[] args) {
		Eletro info= new Eletro();
		
		info.setDomesticos("TV");
		info.setUsopessoal("Kindle");
		info.setJogos("Xbox");
		
		System.out.println("Exemplo de produto eletr�nico dom�stico: " + info.getDomesticos());
		System.out.println("Exemplo de produto eletr�nico de uso pessoal: " + info.getUsopessoal());
		System.out.println("Exemplo de produto eletr�nico de Jogos: " + info.getJogos());
	}
	}
	


