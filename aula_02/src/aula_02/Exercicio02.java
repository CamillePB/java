package aula_02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner  leia = new Scanner (System.in);
		
		int n;
		
		System.out.println("Digite um número: ");
		n = leia.nextInt();
		
		if((n%2) == 0) {
			if(n >= 0) {
				System.out.println("O Número 2 é par e positivo!");
				}
			else {
				System.out.println("O Número -2 é par e negativo!");
			}
			}
		else if((n%2) != 0) {
			if(n <= 0) {
				System.out.println("O Número -3 é ímpar e negativo!");
				}
			else {
				System.out.println("O Número 3 é ímpar e positivo!");
			}
			}
		
		
	}

}
