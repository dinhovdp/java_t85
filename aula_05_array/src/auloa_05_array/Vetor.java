package auloa_05_array;

import java.util.Arrays;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		
		
		//o uso de colchetes indica vetor, pode usar antes ou depois da variavel
		// vetor inicializado com dados
		int vetorInteiros [] = {10, 20, 70, 45, 78, 100};
		
		
		//vetor vazio (precisa definir um tamanho, representado por 5 dentro do colchetes) 
		float vetorReais [] = new float [5];
		
		System.out.printf("teste vetorInteiros[2] = %d\n", vetorInteiros[2]);
		
		//para nao repetir varios prints, podemos utilizar o FOR junto com VETOR
			
		
		/* usando o contador ++ é possivel fazer com que o indice de repetição FOR repita com +1
		 * toda vez que ele se repetir, podendo percorrer até o final do Array
		 * Array significa VETOR ou MATRIZ
		 * 
		 * 
		 * //Lembrando que a variavel contador dentro do for é de uso descartavel,
		//e so funciona apenas dentro do proprio for
		 */
		
		for (int contador = 0; contador < 6; contador ++) {
		System.out.printf("este com for: vetorInteiros[%d] = %d\n",contador, vetorInteiros [contador]);
		}
		
		/*Se usarmos a condição LENGTH , inves de definir um numero, ele se adapta ao tamanho dos vetores definidos.
		 * 
		 */
		for (int contador = 0; contador < vetorInteiros.length; contador ++) {
			System.out.printf("Teste com for: vetorInteiros[%d] = %d\n",contador, vetorInteiros [contador]);
			}
		
		
		
		// Inserir dados no vetor de reais
		//que nao tem um valor definido, mas tem o tamanho de 5 espaços
		//
		
		for (int contador = 0; contador < vetorReais.length; contador++) {
		System.out.printf("\nDigite um valor Real para a posição %d: \n", contador);
		vetorReais[contador] = leia.nextFloat();
		}
		
		//consegue MUDAR A ordem em ordem crescente a listagem dos Vetores
				Arrays.sort(vetorReais);
				
				
			//Lista os dados do vetor de REAIS, o arrays.sorte deve ficar antes do print da lista
		for (int contador = 0; contador < vetorReais.length; contador ++) {
			System.out.printf("este com for: vetorReal[%d] = %f\n",contador, vetorReais [contador]);
			}
		
		// isso faz com que a listagem do Array Vetor de tras pra frente
		// se reparar, o length e o contador esta com numero negativo para diminuir
		
		// Listar todos os dados do vetor de reais
		//for (int contador = vetorReais.length - 1; contador >= 0 ; contador -- ) {
			//System.out.printf("vetorReais[%d] = %.2f\n", contador, vetorReais[contador]);
		
		
		
		
		
		System.out.println("\nTamanho do vetor inteiros: " + vetorInteiros.length);
		System.out.println("\nTamanho do vetor reais: " + vetorReais.length);
		
		leia.close();
	//
	
	}

}
