package ExerciciosProgramacaoSequencial;

//4. Escreva um sistema que leia três números inteiros e positivos (A, B, C) e
//calcule a seguinte expressão: D = R + S /2, onde R = (A + B)² e S = (B + C) ².
//06/03/22 - Beatriz Locatelli
											

import java.util.Scanner;

public class AtividadeSequencia04 {

	public static void main(String[] args) {
		int A, B, C, R, S, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite três números inteiros e positivos: ");
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		
			if(A >= 0);
			if(B >= 0);
			if(C >= 0);
			else {
				System.out.println("Os números digitados não são inteiros e positivos. Digite novamente!");
			}
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) / 2;
		
		System.out.println("O resultada da expressão D = R + S /2 é: " + D);
		
		leia.close();
	}

}
