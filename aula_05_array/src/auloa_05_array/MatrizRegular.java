package auloa_05_array;

import java.util.Scanner;

public class MatrizRegular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		//Matriz irregular, é quando o numero de linha e coluna diferentes
		
		int matrizInteiros [] [] = {
				{10, 15, 20},
				{55, 55, 60},
				{75, 80, 85} };
		
		for (int linha = 0; linha < matrizInteiros.length; linha++) {
			
										//ao usar o [linha] ele ira ler a linha em caso de irregular.
			for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				System.out.printf("matrizInteiros [%d] [%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
								
			}
		}		
			 
			leia.close();
		}
	 
	}
	 