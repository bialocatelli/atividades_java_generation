package ExerciciosLa�osDeDecis�o;

import java.util.Scanner;

//3- Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra: 10-14 infantil, 15-17 juvenil
//18-25 adulto.
//26-03-22 Beatriz Locatelli

public class Atividade03La�osDeDecis�o {

	public static void main(String[] args) {
		int idade;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		if ((idade >= 10) && (idade <= 14)) {
			System.out.println("Voc� est� na categoria infantil!");
		} else if ((idade >= 15) && (idade <= 17)) {
			System.out.println("Voc� est� na categoria juvenil!");
		} else if ((idade >= 18) && (idade <= 25)) {
			System.out.println("Voc� est� na categoria adulto!");
		} else {
			System.out.println("Sua idade n�o est� enquadrada em nenhuma das categorias. ");
		}

		leia.close();
	}
}
