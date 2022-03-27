package br.com.generation.heranca;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		Cavalo ca1 = new Cavalo();
		Preguiça p1 = new Preguiça();
		
		
		c1.setNome("Paçoca");
		c1.setIdade(5);
		c1.setDeveCorrer("pouco");
		c1.setDeveEmitirSom("latido");
		c1.setRaça("Vira lata");
		
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("Deve correr: " + c1.getDeveCorrer());
		System.out.println("Deve emitir som: " + c1.getDeveEmitirSom());
		System.out.println("Raça: " + c1.getRaça());
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
		p1.setDeveCorrer("não");
		p1.setDeveEmitirSom("não");
		p1.setFloresta("Tropical");
		
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade());
		System.out.println("Deve correr: " + p1.getDeveCorrer());
		System.out.println("Deve emitir som: " + p1.getDeveEmitirSom());
		System.out.println("Floresta: " + p1.getFloresta());

	}

}
