package ExerciciosProgramacaoSequencial;

//3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
//expressa em segundos e mostre-o expresso em horas, minutos e segundos.
//06/03/22 - Beatriz Locatelli

import java.util.Scanner;

public class AtividadeSequencial03 {

	public static void main(String[] args) {
		int segundos, minutos, horas, tempo = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o tempo de duração do evento da fábrica em segundos: ");
		segundos = leia.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos % 3600) / 60;
		tempo = (segundos % 3600) % 60;
		
		System.out.println("O evento teve: " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");
		System.out.println(tempo);
		
		leia.close();
		

	}

}
