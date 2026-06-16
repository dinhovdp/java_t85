package aula_04_repeticoes;

import java.util.Scanner;

public class TabuadaDoWhile {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

	Scanner leia = new Scanner(System.in);
			
			int numero;
			int contador = 1;
			
			System.out.println("Digite um numero inteiro: ");
			numero = leia.nextInt();
			
			// Laço de repetição utilizando o do While
			
			do {
			
			System.out.printf("%d x %d = %d\n", numero, contador, numero * contador);
			contador++;
			} while(contador <= 10);
			
			
			
			
			
			leia.close();
			
	}

}
