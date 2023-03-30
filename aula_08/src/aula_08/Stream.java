package aula_08;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	
		for(var n : numeros)
			System.out.println(n);
		
		List<Integer> numerosStream = numeros.stream()
		        .map(n -> n*n*n)
		        .collect(Collectors.toList());
		System.out.println(numerosStream);
		
		List<Integer> numerosPares = numeros.stream()//buscar projeto
		        .filter(n -> n%2 == 0)//parecio com um if
		        .collect(Collectors.toList());
		System.out.println(numerosPares);
		
		List<Integer> numerosDecrescente = numeros.stream()
		        .sorted(Comparator.reverseOrder())//reverteu a ordem == decrescente
		        .collect(Collectors.toList());
		System.out.println(numerosDecrescente);
		
		long contaPares = numeros.stream()
		        .filter(n -> n%2 == 0)
		        .count();//Quantidade de numeros pares
		System.out.println(contaPares);
		
		
	}

}
