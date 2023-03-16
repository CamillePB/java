package aula_02;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  leia = new Scanner (System.in);
		
		int operacao;
		float n1, n2;
		
		System.out.println("Digite um número: ");
		n1 = leia.nextFloat();
		
		System.out.println("Digite mais um número: ");
		n2 = leia.nextFloat();
		
        System.out.println("1\tSoma");
        System.out.println("2\tSubtração");
        System.out.println("3\tMultiplicação");
        System.out.println("4\tDivisão");
        
        System.out.println("Escolha uma operação matemática:");
        operacao = leia.nextInt();

		switch(operacao) {
		
		case 1:
			System.out.println("Soma: " + n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case 2:
			System.out.println("Subtração: " + n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case 3:
			System.out.println("Multiplicação: " + n1 + " x " + n2 + " = " + (n1 * n2));
			break;
		case 4:
			System.out.println("Divisão: " + n1 + " / " + n2 + " = " + (n1 / n2));
			break;
		
		default:
			System.out.println("Operação inválida");
				
		}
	}

}
