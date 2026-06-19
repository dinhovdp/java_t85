package aula_06_collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("laranja");
		
		//remove o ultimo da fila da pilha
		pilha.pop();
		
		
		System.out.println ("A cor Azul ela esta na fila?: " + pilha.contains("Azul"));
		
		for(var cor : pilha) {
			System.out.println(cor);
		}
		
		
		
		
	}

}
