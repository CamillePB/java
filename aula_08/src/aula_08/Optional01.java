package aula_08;

import java.util.Optional;

public class Optional01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] palavras = new String[10];
		
		palavras[5] = "OLA";
		
		Optional<String> checaNulo = Optional.ofNullable(palavras[5]);// chega nulo
		
		if(checaNulo.isPresent()) {//se não for nulo
		String palavra = palavras[5].toLowerCase();//converte toda String por minusculo
		System.out.println(palavra);
		}else
			System.out.println("A palavra é nula");
	}

}
