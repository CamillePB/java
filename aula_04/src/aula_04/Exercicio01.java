package aula_04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int vetorInt[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numero;
		boolean num = false;

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		for (int i = 0; i < vetorInt.length; i++) {
			if (vetorInt[i] == numero) {
				System.out.println("O número " + numero + " está na posição " + i);
				num = true;
			}

		}

		if (num == false) {
			System.out.println("O número " + numero + " não foi encontrado");
		}
	}

}
