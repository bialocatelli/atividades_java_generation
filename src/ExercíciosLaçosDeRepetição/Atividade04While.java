package ExercíciosLaçosDeRepetição;

import java.util.Scanner;

// Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. 
//Para tanto, a cada uma das pessoas era perguntado:
//idade, sexo (1-feminino / 2-masculino / 3-Outros), 
//e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era agressiva). 
//Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//* o número de pessoas calmas;
//* o número de mulheres nervosas;
//* o número de homens agressivos;
//* o número de outros calmos;
//* o número de pessoas nervosas com mais de 40 anos;
//* o número de pessoas calmas com menos de 18 anos.
//26-03-22 Beatriz Locatelli

public class Atividade04While {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int idade, sexo, caracPsicologica, entradas = 1, pessoaCalma = 0, outrosCalmo = 0, calmoMenor18 = 0,
				mulherNervosa = 0, nervosoMaior40 = 0, homemAgressivo = 0;

		while (entradas <= 2) {
			System.out.println("Informe a idade: ");
			idade = entrada.nextInt();

			System.out.println("Informe o sexo:\n1 - FEMININO \n2 - MASCULINO \n3 - OUTROS");
			sexo = entrada.nextInt();

			switch (sexo) {
			case 1:
				break;

			case 2:
				break;

			case 3:
				break;
			default:
				break;
			}

			System.out.println("Em qual das opções a pessoa se encaixa: (Informe o número relacionado a opção!");
			System.out.println("\n1 - CALMA \n2 - NERVOSA \n3 - AGRESSIVA");
			caracPsicologica = entrada.nextInt();

			switch (caracPsicologica) {
			case 1:
				pessoaCalma++;
				if (idade < 18) {
					calmoMenor18++;
				}
				if (sexo == 3) {
					outrosCalmo++;
				}
				break;

			case 2:
				if (sexo == 1) {
					mulherNervosa++;
				}
				if (idade > 40) {
					nervosoMaior40++;
				}
				break;

			case 3:
				if (sexo == 2) {
					homemAgressivo++;
				}
				break;
			default:
				break;
			}
			entradas++;

		}

		entrada.close();

		System.out.println("PESSOAS CALMAS | QUANTIDADE: " + pessoaCalma + "\n" + "\nMULHERES NERVOSAS | QUANTIDADE: "
				+ mulherNervosa + "\n" + "\nHOMENS AGRESSIVOS | QUANTIDADE: " + homemAgressivo + "\n"
				+ "\nOUTROS CALMOS | QUANTIDADE: " + outrosCalmo + "\n"
				+ "\nPESSOAS NERVOSAS COM MAIS DE 40 ANOS | QUANTIDADE: " + nervosoMaior40 + "\n"
				+ "\nPESSOAS CALMAS COM MENOS DE 18 ANOS | QUANTIDADE: " + calmoMenor18);

	}

}
