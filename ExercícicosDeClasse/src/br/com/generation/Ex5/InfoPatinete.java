package br.com.generation.Ex5;

public class InfoPatinete {

	public static void main(String[] args) {
		
		Patinete info= new Patinete();
		
		info.setCor("Dourado");
		info.setMaterial("Aço");
		info.setPreço(200);

		System.out.println("Qual a cor do Patinete?: "+ info.getCor());
		System.out.println("Qual o material do patinete?: "+ info.getMaterial());
		System.out.println("Qual o preço do patinete?: "+ info.getPreço());
	}

}
