package aula_06_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicios_01_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

        ArrayList<String> cores = new ArrayList<>(); 

        // Repita o contador de cores começando de 1 e menor de 5, com um incremento de ++
        // Imprima o incremento 
        // string cor = leia o texto e  pula uma linha
        

        for (int contaCor = 1; contaCor <= 5; contaCor++) {
            System.out.print("Digite a " + contaCor + "ª cor: ");
            String cor = leia.nextLine();

            cores.add(cor);
        }
        
        //************************************************************

        // Mostrar as cores digitadas
        System.out.println("\nLista de cores:");

        // string texto, "cor" e array "cores"
        //imprima na tela a lista das cores 
        for (String cor : cores) {
            System.out.println(cor);
        }

        // Ordenar em ordem crescente
        Collections.sort(cores);

        
        
        // Mostrar ordenadas
        System.out.println("\nLista em ordem crescente:");

        for (String cor : cores) {
            System.out.println(cor);
        }

        leia.close();
    

	}

}
