package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		int corNum = 1;
		String cor;

		ArrayList<String> cores = new ArrayList<String>();// array de notas

		do {
			System.out.println("Escreva a" + corNum + "° cor: ");
			cor = leia.nextLine();
			corNum++;
			cores.add(cor);

		} while (corNum <= 6);
		
		System.out.println("As cores foram: ");
		for (var Cor : cores) {// imprimir cor(es)

			System.out.println(Cor);
		}

		cores.sort(null);// ordenar os elementos(notas)
		System.out.println("Cores ordenadas: ");
		for (var eCor : cores) {// imprimir nota(as)

			System.out.println(eCor);
		}
	}

}
