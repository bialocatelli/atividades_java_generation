package ExerciciosVetoresMatrizes;

import java.util.Scanner;

//2. Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos, 
//escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também
//quantas foram as ocorrências da maior pontuação.
//26-03-22 Beatriz Locatelli

public class Atividade02Vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] valor = new int[10];
		int maiorValor = 0, soma = 0, quantidadeMaiorResultado = 0;
		double media = 0;

		System.out.println("Os números que saíram nos dados foram: ");

		for (int i = 0; i < 9; i++) {
			System.out.println("Digite o " + (i + 1) + "º resultado do dado: ");
			valor[i] = entrada.nextInt();
			if (maiorValor < valor[i]) {
				maiorValor = valor[i];
			}
		}

		for (int i = 0; i <= 9; i++) {
			System.out.print(valor[i] + " | ");
			soma += valor[i];
			if (maiorValor == valor[i]) {
				quantidadeMaiorResultado += 1;
			}

		}

		media = soma / 10;

		System.out.println("A maior pontuação foi: " + maiorValor);
		System.out.println("A quantidade de vezes que ela foi atingida: " + quantidadeMaiorResultado);
		System.out.println("A média dos resultados foi de: " + media);

		entrada.close();
	}

}
