package aula_05;

import java.util.HashSet; //estrutura de dados tipo map(valores com chave - Present)
import java.util.Iterator;
import java.util.Set;

public class ColecaoSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> setFrutas = new HashSet<String>();//Sem valores repetidos e nem ordenação
	
		setFrutas.add("Abacate");
		setFrutas.add("Banana");
		setFrutas.add("Jaboticaba");
		setFrutas.add("Kiwi");
		setFrutas.add("Maçã");
		setFrutas.add("Morango");
		setFrutas.add("Pêra");
		setFrutas.add("Jaboticaba");
		setFrutas.add("KIWI");
		

		//listar elementos da Collection set
		Iterator<String> isetFrutas = setFrutas.iterator();
		while (isetFrutas.hasNext()) {
			System.out.println(isetFrutas.next());
		}
		
		for(var fruta : setFrutas)
			System.out.println(fruta.hashCode());//chave dos itens
		
		System.out.println("Existe a fruta manga? "+ setFrutas.contains("manga"));
		
		setFrutas.remove("Kiwi");
		
		for(var fruta : setFrutas)
			System.out.println(fruta);//chave dos itens
	}

}
