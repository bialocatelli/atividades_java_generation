package ExerciciosProgramacaoSequencial;

//Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e
//dias e mostre-a expressa apenas em dias.

import java.util.Scanner;

public class AtividadeSequencial01 {

	public static void main(String[] args) {

		int a, m, d, dias;

		Scanner leia = new Scanner(System.in);

		System.out.println("Escreva sua idade em anos: ");
		a = leia.nextInt();

		System.out.println("Escreva sua idade em meses: ");
		m = leia.nextInt();

		System.out.println("Escreva sua idade em dias: ");
		d = leia.nextInt();

		dias = ((a * 365) + (m * 30) + d);

		System.out.println("Sua idade em dias é: " + dias);

		leia.close();
	}

}
