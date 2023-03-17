package aula_03;

import java.util.Scanner;

public class TabuadaV2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero, contador = 1;

		System.out.println("Digite um numero");
		numero = leia.nextInt();

		while (contador <= 10) {
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
			contador++;
			
		}

	}

}
