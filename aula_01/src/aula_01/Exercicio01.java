package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DecimalFormat df = new DecimalFormat("###,###,##0.00");
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;

		System.out.println("Digite seu salário:");
		salario = leia.nextFloat();
		
		System.out.println("Digite seu abono:");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Salario Atual: " + df.format(novoSalario));
	}

}
