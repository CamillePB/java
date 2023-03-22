package aula_05;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack<String> pilha = new Stack<String>();
		
		pilha.add("Brenda");
		pilha.add("Camille");
		pilha.add("Michelle");
		pilha.add("Katarina");
		pilha.add("Gabriel");
		
		for(var elemento : pilha)
			System.out.println(elemento);
		
		System.out.println("Retirar elemento: ");
		pilha.pop();//excluir elemento automaticamente - Primeiro elemento adicionado
		System.out.println(pilha);
		
		
		System.out.println("Adicionar elemento: ");
		pilha.push("Reynaldo");//adicionar elemento - Ultimo lugar da fila
		System.out.println(pilha);
		
		System.out.println(pilha.size());//imprime a quantidade de elementos
	}

}
