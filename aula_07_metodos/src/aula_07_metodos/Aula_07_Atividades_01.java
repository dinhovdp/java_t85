package aula_07_metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aula_07_Atividades_01 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		/*
		 * Conteúdos trabalhados nesta atividade:
			Laços de repetição  = OK , utilizado o FOR
			Collections e Data Structures = OK, utilizado ArrayList
			Manipulação de dados em coleções
			Criação e utilização de functions
			Entrada e saída de dados
		 */
		
		Scanner leia = new Scanner(System.in);

	ArrayList<Integer> numeros = new ArrayList<Integer>();
	
	for (int contador = 1; contador <= 5; contador++) {
        System.out.print("Digite a(o) " + contador + "ª Numero: ");
        
	numeros.add(leia.nextInt());	}
        
	//para listar, podemos usar o metodo FOR

		System.out.println("\nOs numeros digitados são:");
	for(Integer numero: numeros) {
		System.out.println(numero);	}
	
	 
        leia.close();
	
	}
	public static int soma(ArrayList<Integer> numeros) {
		System.out.println("Soma: " + soma(numeros));
		 
		int soma = 0;

		for (Integer numero : numeros) {
		    soma += numero;
		}

		return soma;
		    
		    
		    
		    
		
		 
	 }

}


