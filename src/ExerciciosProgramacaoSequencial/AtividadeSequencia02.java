package ExerciciosProgramacaoSequencial;

//Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a
//expressa em anos, meses e dias.
//06/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class AtividadeSequencia02 {

	public static void main(String[] args) {
		int anos, meses, dias;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva sua idade em dias: ");
		dias = leia.nextInt();
		
		anos = dias / 365;
		meses = dias / 30;
		dias = 365 * anos;
		
		System.out.println("Sua idade em anos é: "  + anos);
		System.out.println("Sua idade em meses é: "  + meses);
		System.out.println("Sua idade em dias é: "  + dias);
		
		leia.close();
		}

	}


