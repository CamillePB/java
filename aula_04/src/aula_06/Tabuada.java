package aula_06;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int numero;
		
		System.out.println("Digite um numero");
		numero = leia.nextInt();
		
		for(int contador = 1; contador <= 10; contador++) 
			System.out.println(numero + " x " + contador + " = " + (numero * contador));
		

	}

}
