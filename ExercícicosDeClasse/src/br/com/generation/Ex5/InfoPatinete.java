package br.com.generation.Ex5;

public class InfoPatinete {

	public static void main(String[] args) {
		
		Patinete info= new Patinete();
		
		info.setCor("Dourado");
		info.setMaterial("A�o");
		info.setPre�o(200);

		System.out.println("Qual a cor do Patinete?: "+ info.getCor());
		System.out.println("Qual o material do patinete?: "+ info.getMaterial());
		System.out.println("Qual o pre�o do patinete?: "+ info.getPre�o());
	}

}
