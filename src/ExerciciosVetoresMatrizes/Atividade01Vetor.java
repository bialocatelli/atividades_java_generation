package ExerciciosVetoresMatrizes;

////Fa�a um programa que crie um vetor por leitura com 5 valores de pontua��o de uma atividade
//e o escreva em seguida. Encontre ap�s a maior pontua��o e a apresente.
//04/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class Atividade01Vetor {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[] valor = new int[5];
		int maiorPontuacao = 0;

		System.out.println("Digite as pontua��es das atividades");
		for (int i = 0; i <= 4; i++) {
			System.out.println("\nInsira a " + (i + 1) + "� pontua��o: ");
			valor[i] = entrada.nextInt();
			if (valor[i] > maiorPontuacao) {
				maiorPontuacao = valor[i];
			}
			System.out.println();
		}
		for (int i = 0; i <= 4; i++) {
			System.out.print(valor[i] + " | ");
		}

		System.out.println("\n\n A maior pontua��o nas atividades foi: " + maiorPontuacao);

		entrada.close();

	}

}
