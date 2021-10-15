package br.com.generation.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/*Autor: Let�cia Ferreira da Silva
               Data: 14.10.2021
3- Crie uma um programa para trabalhar com estoque de uma loja, o programa dever�
trabalhar com Collection do tipo List do Java para manipular os dados desse estoque, o
programa dever� atender as seguintes funcionalidades:
	Armazenar dados da List
	Remover dados da list;
	Atualizar dados da list.
	Apresentar todos os dados da list.*/

public class Loja {

	public static void main(String[] args) {
		
		Collection<String> estoque = new ArrayList();
		
		String estoque1= "Estoque de t�nis 36";
		String estoque2= "Estoque de t�nis 38";
		String estoque3= "Estoque de t�nis 40 ";
		String estoque4= "Estoque de botas 38";
		
		// 1� parte Armazenar dados da List
		estoque.add(estoque1);//posi��o 0
		estoque.add(estoque2);//posi��o 1
		estoque.add(estoque3);
		estoque.add(estoque4);
		//System.out.println(estoque);
		
		/*2� parte Remover dados da list;
		estoque.remove(estoque2);
		System.out.println(estoque);*/
		
		//3� parte Atualizar dados da list.
		Collection<String> estoquenovo = Arrays.asList("Estoque de botas 36\nEstoque de botas 40");
		estoque.addAll(estoquenovo);
		//System.out.println(estoque);
		
		//4�Apresentar todos os dados da list
		for(String i : estoque) {
			System.out.println(i);
			
		}
		 
		 
		
	}

}
