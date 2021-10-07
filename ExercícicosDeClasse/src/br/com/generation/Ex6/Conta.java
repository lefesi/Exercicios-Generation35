       /*Autor Letícia Ferreira da Silva 
              Data: 07.10.2021

6) Crie uma classe conta bancaria e apresente os atributos e métodos referentes esta 
classe, em seguida crie um objeto conta bancaria, defina as instancias deste objeto
e apresente as informações deste objeto no console.*/
package br.com.generation.Ex6;

public class Conta {
	
	int quanto;
	String banco;
	int limite;
	
	void naconta() {
		System.out.println("Escrevendo quanto tem na conta... ");
	}
	
	void qualbanco() {
		System.out.println("Escrevendo qual o banco... ");
	}
	
	void qualolimite() {
		System.out.println("Escrevendo qual o limite da conta... ");
	}
	
	
	public int getQuanto() {
		return quanto;
	}
	public void setQuanto(int quanto) {
		this.quanto = quanto;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getLimite() {
		return limite;
	}
	public void setLimite(int limite) {
		this.limite = limite;
	}
	
	
	

}
