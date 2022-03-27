package ExerciciosProgramacaoSequencial;

//5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
//aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
//respectivamente.
//06/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class AtividadeSequencial05 {

	public static void main(String[] args) {
		double nota1, nota2, nota3, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite abaixo as 3 notas do aluno.");
		System.out.println("\nDigite a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		nota3 = leia.nextDouble();
		
		nota1 = nota1 *2;
		nota2 = nota2 *3;
		nota3 = nota3 *5;
		
		media = (nota1 + nota2 + nota3) /10;
		
		System.out.println("A média do aluno é: " + media);
		
		leia.close();
		
		

	}

}
