package br.com.generation.heranca;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo ca1 = new Cavalo();
		Pregui�a p1 = new Pregui�a();
		
		
		c1.setNome("Pa�oca");
		c1.setIdade(5);
		c1.setDeveCorrer("pouco");
		c1.setDeveEmitirSom("latido");
		c1.setRa�a("Vira lata");
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Deve correr: " + c1.getDeveCorrer());
		System.out.println("Deve emitir som: " + c1.getDeveEmitirSom());
		System.out.println("Ra�a: " + c1.getRa�a());
		System.out.println();
		
		ca1.setNome("Foguete");
		ca1.setIdade(10);
		ca1.setDeveCorrer("bastante");
		ca1.setDeveEmitirSom("sim");
		ca1.setFazenda("Fazenda cantinho dos cavalos");
		
		System.out.println("Nome: " + ca1.getNome());
		System.out.println("Idade: " + ca1.getIdade());
		System.out.println("Deve correr: " + ca1.getDeveCorrer());
		System.out.println("Deve emitir som: " + ca1.getDeveEmitirSom());
		System.out.println("Fazenda: " + ca1.getFazenda());
		System.out.println();        
		
		p1.setNome("Juju");
		p1.setIdade(8);
		p1.setDeveCorrer("n�o");
		p1.setDeveEmitirSom("n�o");
		p1.setFloresta("Tropical");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Deve correr: " + p1.getDeveCorrer());
		System.out.println("Deve emitir som: " + p1.getDeveEmitirSom());
		System.out.println("Floresta: " + p1.getFloresta());

	}

}
