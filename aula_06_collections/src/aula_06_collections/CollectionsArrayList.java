package aula_06_collections;

import java.util.ArrayList;
import java.util.Comparator;


public class CollectionsArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//usa o sinal < > para definir uma sub tipagem de dado que o objeto vai guardar
		//o Integer ele guarda numero inteiros
		//
		//ao usar o ponto na variavel da Integer(collection, ele ira dar uma lista de objetos)
		
		
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		numeros.add(7);
		
		//para listar, podemos usar o metodo FOR
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		//aqui voce pega o valor do objeto da lista, no caso get 3 deve retornar o valor 7
		System.out.println("O Objeto esta presente no indice 5: " + numeros.get(3));
		
		//aqui nos pegamos a posição que o objeto esta localizado
		//deve usar o valor retornado do sys.out anterior
		//deve retornar o numero 3, pois começa 0 , 1 , 2 , 3. e o 3 está na linha 4.
		System.out.println("O Indice do objeto 5: " + numeros.indexOf(7));
		
		
		
		System.out.println("\n******************************");
		System.out.println("Trocado o numero 7 pelo 25 com indexOF");
		System.out.println("******************************");
		
		
		
		//com o comando set , podemos trocar o numero do indice, no caso, a linha 4 (numeros.get(3))
		//sera trocado de 7 para o numero 25
		numeros.set(3, 25);
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		
		//ordenaçao crescente
		numeros.sort(null);
		
		//****************************************************************
		System.out.println("******************************");
		System.out.println("Ordenação Crescente");
		System.out.println("Retirado a primeira linha com numero.remove");
		//****************************************************************
		
		
		
		//aqui ele retirará a primeira da lista, indicada com o numero 0
		numeros.remove(0);
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		//****************************************************************
		System.out.println("******************************");
		System.out.println("Ordenação Decrescente");
		//****************************************************************
		
		//ordenaçao decrescente
		numeros.sort(Comparator.reverseOrder());
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
		
		
		
	}

}
