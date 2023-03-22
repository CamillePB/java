package aula_05;

import java.util.ArrayList;
import java.util.Scanner;

public class Lista {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		ArrayList<Double> notas = new ArrayList<Double>();// array de notas

		int opcao = 0;
		double nota = 0.0;

		do {
			System.out.println("1 -Cadastrar nota");
			System.out.println("2 -Listar notas");
			System.out.println("3 -Buscar um nota");
			System.out.println("4 -Remover uma nota");
			System.out.println("5 -Atualizar uma nota");
			System.out.println("6 -Ordenar");
			System.out.println("7 -Sair");
			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				System.out.println("1 -Cadastrar nota");
				System.out.println("Digite uma nota");
				nota = leia.nextDouble();

				notas.add(nota);// adicionar nota no array notas
				break;

			case 2:
				System.out.println("2 -Listar notas");
				if (notas.isEmpty()) { // notas está vazio
					System.out.println("Não há notas cadastradas");
				} else {
					for (var eNota : notas)// imprimir nota(as)
						System.out.println(eNota);
				}
				break;

			case 3:
				System.out.println("3 -Buscar um nota");
				System.out.println("Digite uma nota");
				nota = leia.nextDouble();

				if (notas.contains(nota))// contem notas
					System.out.println("A nota está loaclizada na posição: " + notas.indexOf(nota));
				else
					System.out.println("Nota não cadastrada");

				break;

			case 4:
				System.out.println("4 -Remover uma nota");
				System.out.println("Digite uma nota");
				nota = leia.nextDouble();

				notas.remove(nota);
				break;

			case 5:
				System.out.println("5 -Atualizar uma nota");
				System.out.println("Digite a nota atual: ");
				nota = leia.nextDouble();

				System.out.println("Digite a nova nota");
				var novaNota = leia.nextDouble();

				notas.set(notas.indexOf(nota), novaNota);
				break;
				
			case 6:
				notas.sort(null);//ordenar os elementos(notas)
				
				for (var eNota : notas)// imprimir nota(as)
					System.out.println(eNota);
				break;
				
			case 7:
				System.out.println("6 -Sair");
				break;

			default:
				if (opcao > 6)
					System.out.println("Opção inválida!");
			}

		} while (opcao != 6);
	}

}
