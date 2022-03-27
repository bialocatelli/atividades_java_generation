package ExercíciosLaçosDeRepetição;

import java.util.Scanner;

//3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. 
//O programa termina quando idade for =-99. (WHILE)
//26-03-22 Beatriz Locatetlli

public class Atividade03While {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade = 0, cont21 = 0, cont50 = 0;

		while (idade != -99) {

			System.out.println("Digite as idades (Só irá finalizar quando a idade for -99): ");
			idade = entrada.nextInt();
			if (idade < 21 && idade > 0) {
				cont21++;
			} else if (idade > 50) {
				cont50++;
			}
		}

		System.out.println("O total de pessoas com menos de 21 anos é: " + cont21);
		System.out.println("O total de pessoas com mais de 50 anos é: " + cont50);

		entrada.close();
	}

}