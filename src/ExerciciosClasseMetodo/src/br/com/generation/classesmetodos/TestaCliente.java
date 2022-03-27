package br.com.generation.classesmetodos;

public class TestaCliente {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente(); // c1 --> objeto
		
		c1.nome = "João";
		c1.endereco = "Rua das Macieiras, 47.";
		c1.telefone = "11988996670";
		
		System.out.println(c1.nome);
		System.out.println(c1.endereco);
		System.out.println(c1.telefone);
		
		c1.comprar();
		c1.pagar();
		System.out.println();
		

	}

}
