package aula_05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);

		Queue<String> cliBank = new LinkedList<String>();

		int opcao = 0;
		String cliente;

		cliBank.add("ccccliente");

		do {
			System.out.println("1 -Adicionar um novo cliente");
			System.out.println("2 -Listar todos os clientes");
			System.out.println("3 -Chamar cliente");
			System.out.println("4 -Sair");
			opcao = leia.nextInt();
			
			leia.nextLine();//pular o nextInt
			
			switch (opcao) {
			case 1:
				System.out.println("1 -Cadastrar cliente");
				System.out.println("Digite o nome do cliente: ");
				cliente = leia.nextLine();

				cliBank.add(cliente);// adicionar
				System.out.println("Cliente Adicionado!");
				break;

			case 2:
				System.out.println("2 -Listar clientes");
				if (cliBank.isEmpty()) { // está vazio
					System.out.println("Não há clientes cadastrados");
				} else {
					for (var Cli : cliBank)// imprimir
						System.out.println(Cli);
				}
				break;

			case 3:
				System.out.println("3 -Chamar cliente");
				if (cliBank.isEmpty()) { // está vazio
					System.out.println("Não há clientes na fila");
				} else {
					System.out.println("O Cliente foi Chamado!");
					cliBank.poll();
					System.out.println(cliBank);
				}

				break;

			case 4:
				System.out.println("Programa Finalizado!");
				break;

			default:
				if (opcao > 4)
					System.out.println("Opção inválida!");
			}

		} while (opcao != 4);
	}

}
