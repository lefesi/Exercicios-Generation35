       /*Autor Letícia Ferreira da Silva 
                  Data: 07.10.2021

4) Crie uma classe funcionário e apresente os atributos e métodos referentes 
esta classe, em seguida crie um objeto funcionário, defina as instancias 
deste objeto e apresente as informações deste objeto no console.*/
package br.com.generation.Ex4;

public class Funcionário {
	
	String nome;
	int   idade;
	String função;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFunção() {
		return função;
	}
	public void setFunção(String função) {
		this.função = função;
	}

}
