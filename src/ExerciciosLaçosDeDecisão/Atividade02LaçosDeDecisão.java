package ExerciciosLa�osDeDecis�o;

import java.util.Scanner;

//2- Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.
//26-03-22 Beatriz Locatelli

public class Atividade02La�osDeDecis�o {

	public static void main(String[] args) {

		int n1, n2, n3;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite tr�s n�meros inteiros que os colocarei em ordem crescente: ");
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();

		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();

		System.out.println("Digite o terceiro n�mero: ");
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
