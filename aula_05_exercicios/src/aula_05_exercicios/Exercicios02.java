package aula_05_exercicios;

import java.util.Scanner;

public class Exercicios02 { 


		public static void main(String[] args) {
			

			
			Scanner leia = new Scanner(System.in);
			
			
			int matrizInteiros [] [] = {
					{10, 22, 33},
					{44, 55, 66},
					{75, 80, 90} };
			
			
			
			System.out.println("A Lista e posições da Matriz é: ");
			for (int linha = 0; linha < matrizInteiros.length; linha++) {
												
			for (int coluna = 0; coluna < matrizInteiros.length; coluna++) {
			System.out.printf("matrizInteiros [%d] [%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
									
				}
			}		
			
			//uma variavel para amarzenar o resultado do for
			int soma = 0;
			
			System.out.println("\nOs numeros da diagonal principal é: ");
			for (int i = 0; i < matrizInteiros.length; i++) {
				soma += matrizInteiros[i][i];
			    System.out.print(matrizInteiros[i][i] + " ");
			  			
			}
			System.out.println("Soma: " + soma);
		
			
		{
			//uma variavel para amarzenar o resultado do for
			int soma1 = 0;

			System.out.println("\nOs numeros da diagonal secundaria é: ");

			
			// Acessa a diagonal secundária,
			//começando no canto superior direito e indo até o canto inferior esquerdo.
			
			for (int i = 0; i < matrizInteiros.length; i++) {
			    soma1 += matrizInteiros[i][matrizInteiros.length - i - 1];
			    System.out.print(matrizInteiros[i][matrizInteiros.length - i - 1] + " ");
			}

			System.out.println("Soma: " + soma1);
		}
			
			
				leia.close();
			}

		}
		 