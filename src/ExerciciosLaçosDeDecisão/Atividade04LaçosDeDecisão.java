package ExerciciosLa?osDeDecis?o;

import java.util.Scanner;

//4- Fa?a um programa em que permita a entrada de um n?mero qualquer e exiba se este n?mero ? par ou ?mpar. 
//Se for par exiba tamb?m a raiz quadrada do mesmo; se for ?mpar exiba o n?mero elevado ao quadrado.
//26-03-22 Beatriz Locatelli

public class Atividade04La?osDeDecis?o {

	public static void main(String[] args) {
		double n;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um n?mero abaixo. Se ele for par, exibiremos a raiz quadrada, se for ?mpar exibiremos o n?mero elevado ao quadrado:");
		n = leia.nextDouble();

		if (n % 2 == 0) {
			System.out.println("Esse ? um n?mero par!" + "\nSua ra?z quadrada ?: " + Math.sqrt(n));
		} else {
			System.out.println("Esse ? um n?mero ?mpar!" + "\nElevado ao quadrado fica: " + Math.pow(n, 2));

		}

		leia.close();
	}

}
