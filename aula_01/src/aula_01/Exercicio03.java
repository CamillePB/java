package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 DecimalFormat df = new DecimalFormat("###,###,##0.00");
			
			Scanner leia = new Scanner(System.in);
			
			float salarioB, adicionalN, horaExtra, desconto, salarioL;

			System.out.println("Digite seu salário bruto:");
			salarioB = leia.nextFloat();
			
			System.out.println("Digite o adicional noturno:");
			adicionalN = leia.nextFloat();
			
			System.out.println("Digite o valor da hora extra:");
			horaExtra = leia.nextFloat();
			
			System.out.println("Digite o desconto:");
			desconto = leia.nextFloat();
			
			salarioL = (salarioB + adicionalN + (horaExtra * 5)) - desconto;
			
			System.out.println("Salário Liquido: " + df.format(salarioL));
	}

}
