package Exerc�ciosLa�osDeRepeti��o;

import java.util.Scanner;

//Escrever um programa que receba v�rios n�meros inteiros no teclado. E no final imprimir a m�dia dos n�meros m�ltiplos de 3. Para sair digitar
//0(zero).(DO...WHILE)
//26-3-22 Beatriz Locatelli

public class Atividade06DoWhile {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double numero, somaMultiplos = 0, count = 0, media = 0;

		System.out.println("PARA FINALIZAR A EXECU��O DO PROGRAMA DIGITE 0");
		do {
			System.out.println("Digite um numero: ");
			numero = entrada.nextDouble();

			if (numero != 0) {
				if (numero % 3 == 0) {
					count++;
					somaMultiplos = somaMultiplos + numero;
				}
			}

			media = somaMultiplos / count;
		} while (numero != 0);
		System.out.printf("\nM�dia dos m�ltiplos de 3 = %.2f", media);

		entrada.close();
	}
}
