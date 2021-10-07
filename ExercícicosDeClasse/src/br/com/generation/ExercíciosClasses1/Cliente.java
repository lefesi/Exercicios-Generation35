        /*Autor Letícia Ferreira da Silva 
                  Data: 07.10.2021
1) Crie uma classe cliente e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto cliente, defina as instancias deste objeto e apresente as 
informações deste objeto no console.*/

package br.com.generation.ExercíciosClasses1;

public class Cliente {
	
	private String nome;
	private int    preçocompra;
	private String tipodecompra;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPreçocompra() {
		return preçocompra;
	}
	public void setPreçocompra(int preçocompra) {
		this.preçocompra = preçocompra;
	}
	public String getTipodecompra() {
		return tipodecompra;
	}
	public void setTipodecompra(String tipodecompra) {
		this.tipodecompra = tipodecompra;
	}
	
	
	
			

}

