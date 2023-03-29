package aula_05;

import java.util.LinkedList;
import java.util.Queue; //fila (o primeiro que entrar, sai)

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Brenda");
		fila.add("Camille");
		fila.add("Michelle");
		fila.add("Katarina");
		fila.add("Gabriel");
		
		for(var elemento : fila)
			System.out.println(elemento);
		
		System.out.println("Retirar elemento: ");
		fila.poll();//excluir elemento automaticamente - Primeiro elemento adicionado
		System.out.println(fila);
		
		System.out.println("Adicionar elemento: ");
		fila.add("Reynaldo");//adicionar elemento - Ultimo lugar da fila
		System.out.println(fila);
		
		System.out.println(fila.size());//imprime a quantidade de elementos
	}

}
