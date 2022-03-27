package ExerciciosProgramacaoSequencial;

//06/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class AtividadeSequencia07 {

	public static void main(String[] args) {
		double a, b, c, d, e, f, x, y;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Dê um valor para os coeficientes abaixo: ");
		System.out.println("a = ");
		a = leia.nextDouble();
		
		System.out.println("b = ");
		b = leia.nextDouble();
		
		System.out.println("c = ");
		c = leia.nextDouble();
		
		System.out.println("d = ");
		d = leia.nextDouble();
		
		System.out.println("e = ");
		e = leia.nextDouble();
		
		System.out.println("f = ");
		f = leia.nextDouble();
		
		x = ((c*e ) - (b*f) / (a*e) - (b*d));
		y = ((a*f) - (c*d) / (a*e) - (b*d));
		
		System.out.println("O calculo dos coeficientes para x é: " + x);
		System.out.println("O calculo dos coeficientes para y é: " + y);
		
		leia.close();
		
		
		

	}

	
}


