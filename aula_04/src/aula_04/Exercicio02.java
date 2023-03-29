package aula_04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float[][] matriz = new float[2][4];
		float[] media = new float[2];
		float soma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int c = 0; c < matriz[i].length; c++) {
				System.out.printf("Digite a %d nota do %d participante", c + 1, i + 1);
				matriz[i][c] = leia.nextFloat();
				soma += matriz[i][c];
			}
			media[i] = soma / matriz[i].length;
			soma = 0.0f;
		}
		
		for(int i = 0; i < media.length; i++) {
			System.out.println(media[i]);
			
		}

		for(float nota : media) {
			System.out.println("Nota: " + nota);
		}

	}

}
