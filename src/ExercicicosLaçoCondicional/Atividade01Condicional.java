package ExercicicosLa�oCondicional;

import java.util.Scanner;

//1) Jo�o, homem de bem, comprou um microcomputador para controlar o rendimento di�rio de seu trabalho. 
//Toda vez que ele traz um peso de tomate maior que o estabelecido pelo regulamento do estado de S�o Paulo (50 quilos) 
//deve pagar um multa de R$ 4,00 por quilo excedente. Jo�o precisa que voc� fa�a um sistema que leia a vari�vel P (peso de tomates) e
//verifique se h� excesso. Se houver, gravar na vari�vel E (Excesso) e na vari�vel M o valor da multa que Jo�o dever� pagar. 
//Caso contr�rio mostrar tais vari�veis com o conte�do ZERO.
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
			System.out.println("\nVoc� ir� pagar multa no valor de " + valorDaMulta);

		} else {
			System.out.println("\nO peso excedido em quilos foi de: " + 0);
			System.out.println("\nVoc� ir� pagar multa no valor de: " + valorDaMulta * 0);

		}
		leia.close();
	}

}
