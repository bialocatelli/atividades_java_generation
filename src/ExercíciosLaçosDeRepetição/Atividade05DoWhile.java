package ExercíciosLaçosDeRepetição;

import java.util.Scanner;

//5- Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números
//digitados.(DO...WHILE)
//26-03-22 Beatriz Locatelli

public class Atividade05DoWhile {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int numero, soma = 0;

		do {
			System.out.println("Digite os números: ");
			numero = entrada.nextInt();

			System.out.printf("%d", numero);

			soma += numero;
		} while (numero != 0);

		System.out.printf("\nA soma é: %d", soma);

		entrada.close();
	}

}
