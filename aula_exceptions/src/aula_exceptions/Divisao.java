package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

	static Scanner ler = new Scanner(System.in);

	public static void main(String[] args) {

		int dividendo = 0;
		int divisor = 0;
		boolean loop  = true;
		
		do {
			try {// testa o programa, pega o erro e tenta consertar
				System.out.println("Digite o Dividendo: ");
				dividendo = ler.nextInt();

				System.out.println("Digite o Divisor: ");
				divisor = ler.nextInt();

				divide(dividendo, divisor);
				
				loop = false;
				
			} catch (ArithmeticException e) {
				//System.err.println("Exceção: " + e);// sysout para mostrar erros
				ler.nextLine();
				System.out.println("Não existe divisão por zero");
				
			} catch (InputMismatchException e) {
				//System.err.println("Exceção: " + e);
				ler.nextLine();
				System.out.println("Digite um numero inteiro");
			}finally {
				System.out.println("Sempre serei executada");
			}
			
		} while (loop);

	}

	public static void divide(int dividendo, int divisor) {
		System.out.println("Divisão = " + (dividendo / divisor));
	}

}
