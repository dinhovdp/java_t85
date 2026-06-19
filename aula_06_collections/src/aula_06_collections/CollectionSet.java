package aula_06_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Lista individual para add
		Set<String> frutas = new HashSet<String>();
		
		
		//Array para o frutas ADD ALL
		ArrayList <String> listaFrutas = new ArrayList<String> (Arrays.asList("Abacaxi", "Pera"));

		frutas. add("Abacate");
		frutas. add("abacate");
		frutas. add("Morango");
		frutas . add("Maçã");
		frutas. add("Abacate");
		frutas. add("Laranja");

		//Abacaxi e pera
		frutas.addAll(listaFrutas);
		
			//Collection SET nao tem indice, ele ignora valores repetidos, e coloca codigo HASH
			//entao, ele reordena a lista de acordo com o numero gerado ( 7 numeros HASH )
		//então, nao vai sair dentro do print
		
		
		//FOR EACH00000000000000000000000000000000000
		for(String fruta : frutas) {
			System.out.println(fruta);  //lista tudo que esta na "variavel" frutas
			System.out.println(fruta.hashCode()); //lista os codigos HASH
			
		}
		System.out.println("A Fruta Laranja esta presente? " + frutas.contains("Laranja"));
			
			frutas.remove("Laranja");
			
			//repetimnos a condição FOR para varrer novamente a lista 
			
			for(String fruta : frutas) {
				System.out.println(fruta);
			}
		
		
		

		
	}

}
