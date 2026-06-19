package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CollectionsFila {
	
	//diferenca entre array list, collection lista e collection set
	//voce precisa indicar para adicionar e remover
	//no sett voce indica qual tirar
	//na fila, sempre será o primeiro, nao tem opçoes

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Thiago");
		fila.add("Guilherme");
		fila.add("Higor");
		fila.add("Sara");
		fila.add("Bella");
		
		
		System.out.println ("Sara ela esta na fila?: " + fila.contains("Sara"));
		
		//fila.remove(); irá remover 1 pessoa da fila
		
		//adiciona 1 cliente
		System.out.println("digite um nome do cliente: ");
		fila.add(leia.next());
		
		
		
		
		//var serve para inferir o tipo de dados, ele identifica os dados relacionado a ela e se adequa 
		//por exemplo, abaixo ele vai funcionar como string do tipo texto
		//mas se a variavel tivesse numero como referencia, ela funcionaria como tipo numero inteiro ou decimal.
		
		for(var cliente : fila) {
			System.out.println(cliente);
		}
		
		leia.close();
		
		
	}

}
