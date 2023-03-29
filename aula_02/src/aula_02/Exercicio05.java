package aula_02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		// NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		int idade;
		boolean doacao = false;
		String nome, pergunta;

		System.out.println("Digite o nome: ");
		
		nome = leia.nextLine();

		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();

		System.out.println("Primeira doação? (S/N) ");
		leia.skip("\\R?");
		pergunta = leia.nextLine().toUpperCase();

		if (pergunta == "S")
			doacao = true;

		if (idade >= 60 && idade <= 69) {
			if (doacao)
				System.out.println(nome + " não está apto(a)");
			else
				System.out.println(nome + " está apto(a)");
		} else if (idade <= 18 || idade >= 69)
			System.out.println(nome + " não está apto(a)");
		else
			System.out.println(nome + " está apto(a)");

	}

}
