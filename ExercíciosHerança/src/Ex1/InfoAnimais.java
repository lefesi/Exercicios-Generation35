package Ex1;

public class InfoAnimais {

	public static void main(String[] args) {
		
	Cachorro cao= new Cachorro(); 
	Cavalo cav= new Cavalo();
	Preguiça pe= new Preguiça();
		
		cao.setNome("dog");
		cao.setIdade(3);
		cao.setSom("Latidos");
		cao.setCorrer("Ele corre");
		
		cav.setNome("Horse");
		cav.setIdade(1);
		cav.setCorrer("Ele corre");
		cav.setSom("Relinchar");
		
		pe.setNome("Fofa");
		pe.setIdade(5);
		pe.setSobe("Ela sobe em árvores");
		pe.setSom("Silêncio");
		
		System.out.println("Qual o nome do animal?: "+ cao.getNome());
		System.out.println("Qual a idade  animal?: "+ cao.getIdade());
		System.out.println("Qual a habilidade do animal?: "+ cao.getCorrer());
		System.out.println("Qual o som emitido?: "+ cao.getSom());
		System.out.println();
		
		System.out.println("Qual o nome do animal?: "+ cav.getNome());
		System.out.println("Qual a idade  animal?: "+ cav.getIdade());
		System.out.println("Qual a habilidade do animal?: "+ cav.getCorrer());
		System.out.println("Qual o som emitido?: "+ cav.getSom());
		System.out.println();
		
		System.out.println("Qual o nome do animal?: "+ pe.getNome());
		System.out.println("Qual a idade  animal?: "+ pe.getIdade());
		System.out.println("Qual a habilidade do animal?: "+ pe.getSobe());
		System.out.println("Qual o som emitido?: "+ pe.getSom());


	}

}
