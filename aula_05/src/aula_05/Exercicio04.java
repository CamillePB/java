package aula_05;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Stack<String> livros = new Stack<String>();

		int opcao = 0, cont = 0;
		String book;

		do {
			System.out.println("1 -Adicionar Livro na pilha");
			System.out.println("2 -Listar todos os livros");
			System.out.println("3 -Retirar livro");
			System.out.println("4 -Sair");
			opcao = leia.nextInt();
			
			leia.nextLine();//pular o nextInt
			
			switch (opcao) {
			case 1:
				System.out.println("1 -Adicionar Livro na pilha\"");
				System.out.println("Digite o nome do livro: ");
				book = leia.nextLine();

				livros.push(book);// adicionar
				System.out.println("Livro adicionado!");
				break;

			case 2:
				System.out.println("2 -Listar todos os livros\"");
				if (livros.isEmpty()) { // está vazio
					System.out.println("A Pilha está vazia!");
				} else {
					for (var Books : livros)// imprimir
						System.out.println(Books);
				}
				break;

			case 3:
				System.out.println("3 -Retirar livro");
				if (livros.isEmpty()) { // está vazio
					System.out.println("A Pilha está vazia");
				} else {
					System.out.println("Um Livro foi retirado da pilha!");
					livros.pop();//remover elemento
					System.out.println(livros);
				}				

				break;

			case 4:
				System.out.println("Programa Finalizado!");
			cont++;
				break;

			default:
				if (opcao > 4)
					System.out.println("Opção inválida!");
			}

		} while (cont == 0);
			}

}
