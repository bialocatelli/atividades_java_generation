package ExerciciosProgramacaoSequencial;

//Construa um programa em c que, tendo como dados de entrada dois pontos
//quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula que efetua tal cáculo é:
// d = (x2 - x1)² +(y2 - y1)² - Esses valores estão dentro da raíz.
//06/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class AtividadeSequencial06 {

	public static void main(String[] args) {
		
		double x1, x2, y1, y2, P1, P2, d;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Escreva os valores para os seguintes pontos: ");
		System.out.println("x1 = ");
		x1 = leia.nextDouble();
		
		System.out.println("x2 = ");
		x2 = leia.nextDouble();
		
		System.out.println("y1 = ");
		y1 = leia.nextDouble();
		
		System.out.println("y2 = ");
		y2 = leia.nextDouble();
		
		P1 = (x2 - x1) * (x2 - x1);
		P2 = (y2 - y1) * (y2 - y1);
		
		d = Math.sqrt((P1+P2));
		
		System.out.println("A distância entre os pontos x,y é de: " + d);
		
		leia.close();

	}

}
