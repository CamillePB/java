package aula_03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int idade = 0, cont = 1, menor21 = 0, maior51 = 0;

		while (cont <= 5 && idade>=0) {
			System.out.println("Digite a idade:");
			idade = leia.nextInt();
			if (idade < 21)
				menor21++;
			else if (idade > 50) {
				maior51++;
				}
			cont++;
		}
		System.out.println("Pessoas menores que 21: " + menor21);
		System.out.println("Pessoas maiores que 50: " + maior51);
	}
	

}
