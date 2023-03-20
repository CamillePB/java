package aula_04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int[][] matriz = new int[3][3];
		int somaP = 0, somaS = 0;
		String diagonalP = "", diagonalS = "";

		for (int i = 0; i < matriz.length; i++) {
			for (int c = 0; c < matriz.length; c++) {
				System.out.println("Digite um número: ");
				matriz[i][c] = leia.nextInt();
//teste
			}

		}

		for (int i = 0; i < matriz.length; i++) {
			diagonalP += matriz[i][i] + "";
			somaP += matriz[i][i];

			diagonalS += matriz[i][matriz.length - 1 - i] + "";
			somaS += matriz[i][matriz.length - 1 - i];
		}

		System.out.println("Elementos da Diagonal Principal: " + diagonalP);
		System.out.println("Soma dos Elementos da Diagonal Principal: " + somaP);
		System.out.println("Elementos da Diagonal Secundária: " + diagonalS);
		System.out.println("Soma dos Elementos da Diagonal Secundária: " + somaS);
	}

}
