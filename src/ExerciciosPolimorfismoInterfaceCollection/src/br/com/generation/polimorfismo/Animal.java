package br.com.generation.polimorfismo;

//Superclasse
public abstract class Animal {//Com a classe abstrata quem tem acesso ao ImprimeAnimal, não consegue ter acesso a raiz do código que é o Animal, para a segurança do software.

	String nome;

	public void somAnimal() {
		System.out.println("Animal emite o som... ");
	}


}
