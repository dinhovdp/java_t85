package aula_06_collections;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicios_colections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
			Queue<String> fila = new LinkedList<String>();
						
			
		System.out.println("\n******************************************");
		System.out.println("***Bem vindo ao nosso sistema de chamados***");
		System.out.println("********************************************");
		System.out.println("********Escolha a opção desejada************");
		System.out.println("											");
		System.out.println("	1 - Adiciona o Cliente a Fila			");
		System.out.println("	2 - Listar todos os Clientes 			");
		System.out.println("	3 - Retirar o Cliente da Fila			");
		System.out.println("	4 - Sair								");
		System.out.println("											");
		System.out.println("********************************************");
		System.out.println("********Escolha a opção desejada************");
		System.out.println("\n******************************************");
		
		int opcao;
		opcao = leia.nextInt();
		

switch (opcao) {
		
		case 1:
				
				System.out.println("	Opção	1 - Adiciona o Cliente a Fila	");
				//adiciona 1 cliente
				
				
					System.out.println("digite o nome do cliente: ");
				fila.add(leia.next());
					
								
			break;
			
		case 2:
				System.out.println("	Opção	2 - Listar todos os Clientes	");
				System.out.println ("Clientes na fila de espera: ");
				for(String cliente : fila) {
				    System.out.println(cliente);
				}
				
				
				
			break;
			
			case 3:			
				System.out.println("	Opção	3 - Retirar o Cliente da Fila	");
				if(fila.isEmpty()) {
					
				    System.out.println("A fila está vazia.");
				}else{
				    System.out.println("Cliente chamado: " + fila.remove());
				}//irá remover 1 pessoa da fila e não dará erro
				
			break;
			
			case 4:
				System.out.println("	Opção	4 - Sair	");
				
				
			break;
			
			
			default:
				System.out.println("Opção Inválida");
				
	
	}
				

			
			leia.close();
		
		
}

}
