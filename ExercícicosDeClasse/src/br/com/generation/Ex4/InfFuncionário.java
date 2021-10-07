package br.com.generation.Ex4;

public class InfFuncionário {

	public static void main(String[] args) {
		Funcionário info = new Funcionário();
		
      info.setNome("Zé");
      info.setIdade(36);
      info.setFunção("Astronauta");
      
      System.out.println("Qual o nome do funcionário?: "+ info.getNome());
      System.out.println("Qual a idade deo funcionário?: "+ info.getIdade());
      System.out.println("Qual a função do funionário?: "+ info.getFunção());
	}

}
