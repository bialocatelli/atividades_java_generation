package ExercíciosLaçosDeRepetição;

//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
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

		System.out.println("\nA quantidade de números pares é: " + par);
		System.out.println("\nA quantidade de números ímpares é: " + impar);
	}

}
