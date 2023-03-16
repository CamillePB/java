package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("###,###,##0.00");

		Scanner leia = new Scanner(System.in);

		float n1, n2, n3, n4, dif1;

		System.out.println("Digite o primeiro numero:");
		n1 = leia.nextFloat();

		System.out.println("Digite o segundo numero:");
		n2 = leia.nextFloat();

		System.out.println("Digite o terceiro numero:");
		n3 = leia.nextFloat();

		System.out.println("Digite o quarto numero:");
		n4 = leia.nextFloat();

		dif1 = (n1 * n2) - (n3 * n4);

		System.out.println("Diferença: " + df.format(dif1));
	}

}
