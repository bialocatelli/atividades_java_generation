package ExerciciosLaçosDeDecisão;

import java.util.Scanner;

//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
//26-03/2022 Beatriz Locatelli

public class Atividade01LaçosDeDecisão {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros e te direi qual é o maior: ");
		System.out.println("Digite o primeiro número: ");
		n1 = leia.nextInt();
		
		System.out.println("Digite o segundo número: ");
		n2 = leia.nextInt();
		
		System.out.println("Digite o terceiro número: ");
		n3 = leia.nextInt();
		
		
		
		if ((n1 > n2) && (n1 > n3)) {
			System.out.println("O primeiro número, valor " + n1 + " é o de maior valor.");
		} else if ((n2 > n1) && (n2 > n3)) {
			System.out.println("O segundo número, valor " + n2 + " é o de maior valor.");
		} else if ((n3 > n1) && (n3 > n2)) {
			System.out.println("O terceiro número, valor " + n3 + " é o de maior valor.");
		} else {
			System.out.println("Os três números são iguais");
		}
		
		leia.close();
	
		
	}

}
