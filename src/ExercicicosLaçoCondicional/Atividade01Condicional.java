package ExercicicosLaçoCondicional;

import java.util.Scanner;

//1) João, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. 
//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de São Paulo (50 quilos) 
//deve pagar um multa de R$ 4,00 por quilo excedente. João precisa que você faça um sistema que leia a variável P (peso de tomates) e
//verifique se há excesso. Se houver, gravar na variável E (Excesso) e na variável M o valor da multa que João deverá pagar. 
//Caso contrário mostrar tais variáveis com o conteúdo ZERO.
//26-03-22 Beatriz Locatelli

public class Atividade01Condicional {

	public static void main(String[] args) {
		double peso, quilosExcesso, multa = 4.00, valorDaMulta;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o peso do tomate em quilos: ");
		peso = leia.nextDouble();

		quilosExcesso = peso - 50;
		valorDaMulta = quilosExcesso * multa;

		if (peso > 50) {
			System.out.println("\nO peso excedido em quilos foi de " + quilosExcesso);
			System.out.println("\nVocê irá pagar multa no valor de " + valorDaMulta);

		} else {
			System.out.println("\nO peso excedido em quilos foi de: " + 0);
			System.out.println("\nVocê irá pagar multa no valor de: " + valorDaMulta * 0);

		}
		leia.close();
	}

}
