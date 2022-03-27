package ExerciciosProgramacaoSequencial;

//O custo ao consumidor de um carro novo � a soma do custo de f�brica com a percentagem do distribuidor
//e dos impostos (aplicados ao custo de f�brica).
//Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%, 
//escrever um sistema que leia o custo de f�brica de um carro e escreva o custo ao consumidor.
//06/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class AtividadeSequencial08 {

	public static void main(String[] args) {
		double custoConsumidor, custoFabrica, percentagemDistribuidor = 0.28, impostos = 0.45;

		Scanner leia = new Scanner(System.in);

		System.out.println("Calculo do custo de um novo carro ao consumidor\n");
		System.out.println("Digite o valor do custo de f�brica do carro: R$ ");
		custoFabrica = leia.nextDouble();

		percentagemDistribuidor = custoFabrica + (custoFabrica * percentagemDistribuidor);
		impostos = custoFabrica + (custoFabrica * impostos);

		custoConsumidor = custoFabrica + percentagemDistribuidor + impostos;

		System.out.println("O valor do custo do carro para o consumidor �: R$ " + custoConsumidor);
		
		leia.close();
	}

}
