package ExerciciosLaçosDeDecisão;

import java.util.Scanner;

//4- Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
//26-03-22 Beatriz Locatelli

public class Atividade04LaçosDeDecisão {

	public static void main(String[] args) {
		double n;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número abaixo. Se ele for par, exibiremos a raiz quadrada, se for ímpar exibiremos o número elevado ao quadrado:");
		n = leia.nextDouble();

		if (n % 2 == 0) {
			System.out.println("Esse é um número par!" + "\nSua raíz quadrada é: " + Math.sqrt(n));
		} else {
			System.out.println("Esse é um número ímpar!" + "\nElevado ao quadrado fica: " + Math.pow(n, 2));

		}

		leia.close();
	}

}
