package aula_06_collections;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Exercicios_collections_stack {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		int opcao = 0;
		
		do {
			System.out.println("\n******************************************");
			System.out.println("***Bem vindo ao nosso sistema de chamados***");
			System.out.println("********************************************");
			System.out.println("********Escolha a opção desejada************");
			System.out.println("											");
			System.out.println("	1 - Adicionar um Novo Livro				");
			System.out.println("	2 - Listar todos os Livros 			");
			System.out.println("	3 - Retirar o Livro da Pilha			");
			System.out.println("	4 - Sair								");
			System.out.println("											");
			System.out.println("********************************************");
			System.out.println("********Escolha a opção desejada************");
			System.out.println("\n******************************************");
			
			 opcao = leia.nextInt();

			switch(opcao) {
			 case 1:
				    leia.nextLine();
		        	System.out.println("O nome do livro: ");
		        	 String nomeLivro = leia.nextLine();
		        	 pilha.push(nomeLivro);
		        	 break;
		        
			 case 2:
				    if (pilha.isEmpty()) {
				        System.out.println("Sem livros!");
				    } else {
				        System.out.println("Livros disponiveis: " + pilha);
				    }
				    break;
		     
		     case 3:
				    pilha.remove();
		        	System.out.println("Retirar um livro da lista: ");
		     break;
		     
		     
			 case 0:
		        	System.out.print("\nVocê saiu do sistema.");
		     break;
		     
			 default:
		        	System.out.println("Opção Invalida!");
			}
			
		} while (opcao != 0);
	   
	leia.close();
			
			}
}
		
		
		
		
		
		
		
	