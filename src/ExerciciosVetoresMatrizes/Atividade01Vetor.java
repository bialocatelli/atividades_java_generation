package ExerciciosVetoresMatrizes;

////Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade
//e o escreva em seguida. Encontre após a maior pontuação e a apresente.
//04/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class Atividade01Vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] valor = new int[5];
		int maiorPontuacao = 0;

		System.out.println("Digite as pontuações das atividades");
		for (int i = 0; i <= 4; i++) {
			System.out.println("\nInsira a " + (i + 1) + "ª pontuação: ");
			valor[i] = entrada.nextInt();
			if (valor[i] > maiorPontuacao) {
				maiorPontuacao = valor[i];
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			System.out.print(valor[i] + " | ");
		}

		System.out.println("\n\n A maior pontuação nas atividades foi: " + maiorPontuacao);

		entrada.close();

	}

}
