package br.com.generation.polimorfismo;

public class TestaAnimal2 {
	
	public static void infoAnimal (Animal dados) {
		dados.nome();
		dados.idade();
		dados.som();
		dados.correr();			
		dados.subir();
	}
	
	public static void main(String[] args) {
							
		infoAnimal(new Cachorro());
		System.out.println();
		infoAnimal(new Cavalo());
		System.out.println();
		infoAnimal(new Preguiça());
		
	}
	
	

}
