package ExerciciosLa�osDeDecis�o;

import java.util.Scanner;

//1- Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
//26-03/2022 Beatriz Locatelli

public class Atividade01La�osDeDecis�o {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros inteiros e te direi qual � o maior: ");
		System.out.println("Digite o primeiro n�mero: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		n3 = leia.nextInt();
		
		
		
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("O primeiro n�mero, valor " + n1 + " � o de maior valor.");
		} else if ((n2 > n1) && (n2 > n3)) {
			System.out.println("O segundo n�mero, valor " + n2 + " � o de maior valor.");
		} else if ((n3 > n1) && (n3 > n2)) {
			System.out.println("O terceiro n�mero, valor " + n3 + " � o de maior valor.");
		} else {
			System.out.println("Os tr�s n�meros s�o iguais");
		}
		
		leia.close();
	
		
	}

}
