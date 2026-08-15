package aula_05_exercicios;

import java.util.Scanner;

public class Exercicios01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner leia = new Scanner(System.in);
		
		
		
		//o uso de colchetes indica vetor, pode usar antes ou depois da variavel
		// vetor inicializado com dados
		int vetorInteiros [] = {10, 5, 12, 7, 20, 15, 9, 2};
		
	
		  System.out.print("Digite o número que você deseja encontrar: ");
	        int numero = leia.nextInt();

	     // variável para guardar a posição, inicia com -1
	        int posicao = -1;
	             
	        	        

	        for (int buscaVetor = 0; buscaVetor < vetorInteiros.length; buscaVetor++) {
	            if (vetorInteiros[buscaVetor] == numero) {
	                posicao = buscaVetor;
	                break; // se encontrou, sai do loop
	            }
	        }

	        if (posicao != -1) {
	         
	        	  //   variável  for encontrada, significa que ela esta dentro do array
	        	System.out.println("O número " + numero + " está na posição: " + posicao);
	            
	        	
	        	  //  se a variável nao for encontrada, significa que ela esta alem do tamanho do array
	        	//como nao exite posição negativa, isso pode evitar de mexerem na variavel aumentando-a
	        	//para nao atrapalhar na condicao do else.
	        	
	        } else {
	            System.out.println("O número " + numero + " não foi encontrado!");
	        }

	        System.out.println("busca encerrada.");
	        leia.close();
	}

}
