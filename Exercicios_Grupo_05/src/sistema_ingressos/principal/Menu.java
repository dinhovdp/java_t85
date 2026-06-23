package sistema_ingressos.principal;

import java.util.Scanner;

import sistema_ingressos.model.Ingresso; 

public class Menu {
	
	// Constantes de cores para o terminal
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String TEXT_CYAN_BOLD_BRIGHT = "\033[1;96m"; 
	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_BLACK_BACKGROUND_BRIGHT = "\033[0;100m";

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int opcao;
		
		/* 
		 * Espaço destinado para instanciar os objetos do seu 
		 * Sistema de Ingressos (ex: Ingresso i1 = new Ingresso(...);)
		 */
		
		while (true) {
			
			// Início do Menu com cores aplicadas
			System.out.println(ANSI_BLACK_BACKGROUND + TEXT_CYAN_BOLD_BRIGHT);
			System.out.println("***************************************************");
			System.out.println("                                                   ");
			System.out.println("               SISTEMA DE INGRESSOS                ");
			System.out.println("                                                   ");
			System.out.println("***************************************************");
			System.out.println("          1 - Cadastrar Evento                     ");
			System.out.println("          2 - Listar Ingressos Disponíveis         ");
			System.out.println("          3 - Comprar Ingresso                     ");
			System.out.println("          4 - Cancelar Pedido                      ");
			System.out.println("          0 - Sair                                 ");
			System.out.println("                                                   ");
			System.out.println("***************************************************");
			System.out.print("Entre com a opção desejada: ");
			System.out.print(ANSI_RESET); // Reseta a cor para o usuário digitar no padrão do terminal

			opcao = leia.nextInt();

			if (opcao == 0) {
				System.out.println(TEXT_CYAN_BOLD_BRIGHT + "\nSistema de Ingressos - Obrigado pela preferência!" + ANSI_RESET);
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println(TEXT_CYAN_BOLD_BRIGHT + "Cadastrar Evento\n\n" + ANSI_RESET);
					break;
				case 2:
					System.out.println(TEXT_CYAN_BOLD_BRIGHT + "Listar Ingressos Disponíveis\n\n" + ANSI_RESET);
					break;
				case 3:
					System.out.println(TEXT_CYAN_BOLD_BRIGHT + "Comprar Ingresso\n\n" + ANSI_RESET);
					break;
				case 4:
					System.out.println(TEXT_CYAN_BOLD_BRIGHT + "Cancelar Pedido\n\n" + ANSI_RESET);
					break;
				default:
					System.out.println(TEXT_CYAN_BOLD_BRIGHT + "\nOpção Inválida!\n" + ANSI_RESET);
					break;
			}
		}
	}
	
	// Método com as suas informações de desenvolvedor
	
	public static void sobre() {
		System.out.println(TEXT_CYAN_BOLD_BRIGHT + "\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: Edson ");
		System.out.println("Generation Brasil - generation@generation.org");
		System.out.println("://github.com");
		System.out.println("*********************************************************" + ANSI_RESET);
	}
}