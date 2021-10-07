
    /*Autor Letícia Ferreira da Silva 
         Data: 07.10.2021
 2) Crie uma classe avião e apresente os atributos e métodos referentes esta classe, 
em seguida crie um objeto avião, defina as instancias deste objeto e apresente 
as informações deste objeto no console.*/


package br.com.generation.Ex2;

public class Avião {
	
	private String destino;
	private int qunantpassage;
	private int quanttripulação;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getQunantpassage() {
		return qunantpassage;
	}
	public void setQunantpassage(int qunantpassage) {
		this.qunantpassage = qunantpassage;
	}
	public int getQuanttripulação() {
		return quanttripulação;
	}
	public void setQuanttripulação(int quanttripulação) {
		this.quanttripulação = quanttripulação;
	}
	

}
