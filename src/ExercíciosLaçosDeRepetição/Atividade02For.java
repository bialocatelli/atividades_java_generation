package Exerc�ciosLa�osDeRepeti��o;

//2- Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
//26-03-22 Beatriz Locatelli

public class Atividade02For {

	public static void main(String[] args) {
		int par = 0, impar = 0;

		for (int i = 0; i <= 10; i++) {
			System.out.println(i);

			if (i % 2 == 0) {
				par++;
			}
			if (i % 2 != 0) {
				impar++;

			}

		}

		System.out.println("\nA quantidade de n�meros pares �: " + par);
		System.out.println("\nA quantidade de n�meros �mpares �: " + impar);
	}

}
