package aula_04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float[][] matriz = new float[2][4];
		float[] vetor = new float[4];
		float media = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int c = 0; c < matriz[i].length; c++) {
				System.out.println("Digite um número: ");
				matriz[i][c] = leia.nextFloat();
				/*
				 * for (int v = 0; v < vetor.length; v++) {
				 * 
				 * media = (matriz[i][c] + matriz[i][c])/c; vetor[v] = media;
				 * System.out.println("Elementos da Diagonal Principal: " + vetor[v]);
				 * 
				 * }
				 */
			}
		}

		for (int i = 0; i < matriz.length; i++) {
			for (int c = 0; c < matriz[i].length; c++) {

				System.out.println("[" + i + "," + c + "] = " + matriz[i][c]);
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			for (int c = 0; c < matriz[i].length; c++) {
				for (int v = 0; v < vetor.length; v++) {
					vetor[v] = (matriz[i][c] + matriz[i][c]);
					System.out.println(vetor[v]);
				}
				/*
				 * for (int v = 0; v < vetor.length; v++) {
				 * 
				 * media = (matriz[i][c] + matriz[i][c])/c; vetor[v] = media;
				 * System.out.println("Elementos da Diagonal Principal: " + vetor[v]);
				 * 
				 * }
				 */
			}

		}
		for (int v = 0; v < vetor.length; v++) {
			System.out.println(vetor[v]);
		
		}

	}

}
