package ExerciciosVetoresMatrizes;

import java.util.Scanner;

//4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e em seguida, exiba a soma dos valores dela
//e a soma dos valores da primeira diagonal, ou seja, diagonal principal.
//26-03-22 Beatriz Locatelli

public class Atividade04Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int[][] matriz = new int[2][4];
		int soma = 0, somaDiagonal = 0;

		for (int l = 0; l <= 2; l++) {
			for (int c = 0; c <= 2; c++) {
				System.out.println("Insira o valor da " + (c + 1) + "º linha da " + (l + 1) + " coluna na matriz: ");
				matriz[l][c] = entrada.nextInt();
				soma += matriz[l][c];
				if (l == c) {
					somaDiagonal += matriz[l][c];
				}
			}
		}

		System.out.println("A soma de todos os valores da matriz é de: " + soma);
		System.out.println("A soma de todos os valores da diagonal principal é: " + somaDiagonal);

		entrada.close();
	}

}
