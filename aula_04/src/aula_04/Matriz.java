package aula_04;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int[][] matrizInt = { { 10, 15, 35 }, { 70, 120, 140 }, { 50, 100, 150 } };
		float[][] matrizFloat = new float[2][3];

		for (int i = 0; i < matrizInt.length; i++) {
			for (int c = 0; c < matrizInt.length; c++) {
				System.out.println(matrizInt[i][c]);
			}

		}
		for (int i = 0; i < matrizFloat.length; i++) {
			for (int c = 0; c < matrizFloat[i].length; c++) {
				System.out.println("Digite um número");
				matrizFloat[i][c] = leia.nextInt();
			}
		}
		for (int i = 0; i < matrizFloat.length; i++) {
			for (int c = 0; c < matrizFloat[i].length; c++) {
				System.out.println(matrizFloat[i][c]);
			}
		}
	}

}
