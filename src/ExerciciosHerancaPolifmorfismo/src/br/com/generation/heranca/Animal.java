package br.com.generation.heranca;

public class Animal {
	
	//Atributos...
	private String nome;
	private int idade;
	private String deveEmitirSom;
	private String deveCorrer;
	
	//Métodos de acesso e modificação de dados...
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getDeveEmitirSom() {
		return deveEmitirSom;
	}
	public void setDeveEmitirSom(String deveEmitirSom) {
		this.deveEmitirSom = deveEmitirSom;
	}
	public String getDeveCorrer() {
		return deveCorrer;
	}
	public void setDeveCorrer(String deveCorrer) {
		this.deveCorrer = deveCorrer;
	}

}
