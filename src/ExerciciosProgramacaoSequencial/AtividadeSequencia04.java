package ExerciciosProgramacaoSequencial;

//4. Escreva um sistema que leia tr�s n�meros inteiros e positivos (A, B, C) e
//calcule a seguinte express�o: D = R + S /2, onde R = (A + B)� e S = (B + C) �.
//06/03/22 - Beatriz Locatelli
											

import java.util.Scanner;

public class AtividadeSequencia04 {

	public static void main(String[] args) {
		int A, B, C, R, S, D;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite tr�s n�meros inteiros e positivos: ");
		A = leia.nextInt();
		B = leia.nextInt();
		C = leia.nextInt();
		
			if(A >= 0);
			if(B >= 0);
			if(C >= 0);
			else {
				System.out.println("Os n�meros digitados n�o s�o inteiros e positivos. Digite novamente!");
			}
		
		R = (A + B) * (A + B);
		S = (B + C) * (B + C);
		D = (R + S) / 2;
		
		System.out.println("O resultada da express�o D = R + S /2 �: " + D);
		
		leia.close();
	}

}
