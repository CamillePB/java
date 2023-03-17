package aula_06;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int numero, total = 0;

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				total = numero + total;
			}

		} while (numero >= 0);
		System.out.println("Total: " + total);

	}

}
