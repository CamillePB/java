package aula_03;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		int idade, sexo = 0, genero = 0, esporte, contador = 0, futebolFeminino = 0, maiores18Volei = 0, gamesTNBF = 0;
		char continua = 'S';

		while (continua == 'S') {

			System.out.println("Digite sua idade: ");
			idade = leia.nextInt();

			do {
				System.out.println("Digite o sexo (1-M/2-F/3-T/4-NB): ");
				sexo = leia.nextInt();
			} while (sexo < 1 || sexo > 4);

			if (sexo == 3 || sexo == 4) {
				System.out.println("Digite o gênero (1-M/2-F): ");
				genero = leia.nextInt();
			}

			System.out.println("Digite o seu esporte favorito (1-Futebol/2-Voleibol/3-Basquete/4-Games): ");
			esporte = leia.nextInt();

			contador++;

			if (sexo == 2 && esporte == 1) {
				futebolFeminino++;
				// futebolFeminino = (futebolFeminino * 100) / contador;
			}

			if (idade >= 18 && esporte == 2) {
				maiores18Volei++;
				// maiores18Volei = (maiores18Volei * 100) / contador;
			}

			if ((sexo == 3 || sexo == 4) && genero == 2 && esporte == 4) {
				gamesTNBF++;
				// gamesTNBF = (gamesTNBF * 100) / contador;
				genero = 0;
			}

			System.out.println("Deseja continuar (S/N)? ");
			continua = leia.next().toUpperCase().charAt(0);
		}

		System.out.println("Fichas preenchidas: " + contador);
		System.out.println("Pessoas do sexo feminino que gostam de futebol: " + futebolFeminino);
		System.out.println("Pessoas maiores de 18 anos que gostam de voleibol: " + maiores18Volei);
		System.out
				.println("Pessoas Trans e Não Binárias que se identificam com o gênero feminino e que gostam de games: "
						+ gamesTNBF);

	}

}
