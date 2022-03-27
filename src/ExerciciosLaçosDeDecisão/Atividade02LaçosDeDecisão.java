package ExerciciosLaçosDeDecisão;

import java.util.Scanner;

//2- Faça um programa que entre com três números e coloque em ordem crescente.
//26-03-22 Beatriz Locatelli

public class Atividade02LaçosDeDecisão {

	public static void main(String[] args) {

		int n1, n2, n3;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite três números inteiros que os colocarei em ordem crescente: ");
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();

		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();

		if (n1 < n2) {
			if (n2 < n3) {
				System.out.println(n1 + ", " + n2 + ", " + n3);
			} else if (n1 < n3) {
				System.out.println(n1 + ", " + n3 + ", " + n2);
			} else {
				System.out.println(n3 + ", " + n1 + ", " + n2);
			}
		} else if (n2 < n3) {
			if (n1 < n3) {
				System.out.println(n2 + ", " + n1 + ", " + n3);
			} else {
				System.out.println(n2 + ", " + n3 + ", " + n1);
			}

		} else {
			System.out.println(n3 + ", " + n2 + ", " + n1);
		}
		leia.close();
	}

}
