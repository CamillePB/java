package aula_05;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		Scanner leia = new Scanner(System.in);
		Set<Integer> setNum = new HashSet<Integer>();// Sem valores repetidos e nem ordenação
		setNum.add(1);
		setNum.add(2);
		setNum.add(3);
		setNum.add(4);
		setNum.add(5);
		setNum.add(6);
		setNum.add(7);
		setNum.add(8);
		setNum.add(9);
		setNum.add(10);

		System.out.println("Digite o número que você deseja encontrar: ");
		numero = leia.nextInt();


		if (setNum.contains(numero))// contem notas
			System.out.println("O número " +numero+ " foi encontrado!");
		else
			System.out.println("O número " +numero+ " não foi encontrado!");

	}

}
