package aula_04;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int vetorInt[] = { 4, 5, 7, 6, 10, 1, 3, 2, 9, 8 };
		int numero;
		float[] vetorFloat = new float[5];

		System.out.println("Digite um número: ");
		numero = leia.nextInt();

		for (int i = 0; i < vetorInt.length; i++) {
			if (vetorInt[i] == numero)
				System.out.println("Posição [" + i + "] = " + vetorInt[i]);
			else
				System.out.println("O número " + numero + " não foi encontrado");
		}

		/* Vetor float
		for (int i = 0; i < vetorFloat.length; i++) {

			System.out.println("Digite um valor para a posição [" + i + "]: ");

			vetorFloat[i] = leia.nextFloat();

		}

		// Utlizado apenas para vetor, exibindo dados
		for (float vfloat : vetorFloat) {
			System.out.println(vfloat);
		}
		*/
		
		
		/* Sequencia um vetor pela ordem crescente dos valores
		Arrays.sort(vetorInt);
		for (int vInt : vetorInt) {
			System.out.println(vInt);
		}*/
	}

}
