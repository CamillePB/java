package aula_02;

import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		NumberFormat nfMoeda = NumberFormat.getCurrencyInstance();

		int cargo;
		float salario;
		String nome;

		System.out.println("Digite o nome: ");
		nome = leia.nextLine();

		System.out.println("Digite salário: ");
		salario = leia.nextFloat();

		System.out.println("1\tGerente");
		System.out.println("2\tVendedor");
		System.out.println("3\tSupervisor");
		System.out.println("4\tMotorista");
		System.out.println("5\tEstoquista");
		System.out.println("6\tTécnico de TI");

		System.out.println("Escolha o cargo:");
		cargo = leia.nextInt();

		switch (cargo) {

		case 1:
			salario = salario + ((salario * 10) / 100);
			System.out.println("Nome: " + nome + "\nCargo: Gerente " + "\nSalário: " + nfMoeda.format(salario));
			break;
		case 2:
			salario = salario + ((salario * 7) / 100);
			System.out.println("Nome: " + nome + "\nCargo: Vendedor " + "\nSalário: " + nfMoeda.format(salario));
			break;
		case 3:
			salario = salario + ((salario * 9) / 100);
			System.out.println("Nome: " + nome + "\nCargo: Supervisor " + "\nSalário: " + nfMoeda.format(salario));
			break;
		case 4:
			salario = salario + ((salario * 6) / 100);
			System.out.println("Nome: " + nome + "\nCargo: Motorista " + "\nSalário: " + nfMoeda.format(salario));
			break;
		case 5:
			salario = salario + ((salario * 5) / 100);
			System.out.println("Nome: " + nome + "\nCargo: Estoquista " + "\nSalário: " + nfMoeda.format(salario));
			break;
		case 6:
			salario = salario + ((salario * 8) / 100);
			System.out.println("Nome: " + nome + "\nCargo: Técnico de TI " + "\nSalário: " + nfMoeda.format(salario));
			break;
		default:
			System.out.println("Operação inválida");

		}
	}

}
