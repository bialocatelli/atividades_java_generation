package br.com.generation.interface01;

public class TestaInterfaceAnimal {

	public static void main(String[] args) {
		
		Cachorro ch = new Cachorro();
		
		ch.somAnimal();
		System.out.println();
		
		Cavalo cv = new Cavalo();
		
		cv.somAnimal();
		System.out.println();
		
		Preguiça pr = new Preguiça();
		
		pr.somAnimal();


	}

}
