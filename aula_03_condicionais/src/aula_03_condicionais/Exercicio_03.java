package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	String nome; 
	
	
	
		System.out.println("Digite o seu nome: ");
		nome = leia.nextLine();
		
		System.out.println("Olá, " + nome + "\nSeja bem vindo ao nosso sistema de colaboradores!\n"
				+ "Selecione a opção para descobrir qual foi o percentual de Reajuste de Salario"
				+ "\nE o novo valor reajustado!");
		
		System.out.println("********************************************");
		System.out.println("		 Opções de CARGOS					");
		System.out.println("********************************************");
		System.out.println(" Por favor, escolha dentre as opções abaixo	");
		System.out.println("										    ");
		System.out.println("	1 - GERENTE		4 - MOTORISTA			");
		System.out.println("	2 - VENDEDOR	  	5 - ESTOQUISTA 	    ");
		System.out.println("	3 - SUPERVISOR	 	6 - TECNICO DE TI   ");
		System.out.println("											");
		System.out.println("   Entre com qualquer tecla para Encerrar 	");
		System.out.println("											");
		System.out.println("********************************************");
					
	
		
		
	int opcao;
					
		System.out.println("Escolha a Opção Desejada: ");
		opcao = leia.nextInt();
		
		if (opcao >= 1 || opcao <= 6) {
			System.out.println("Você escolheu um cargo corretamente.\n");
			
		}else {
				System.out.println("Você escolheu uma opção invalida");
		}
		
		int num1 = 0;
		System.out.println("Insira o valor do salário: ");
		num1 = leia.nextInt();
		
	
		
		float resultado = 0.2f;
		float gerente = 0.10f;
		float vendedor = 0.07f;
		float supervisor = 0.09f;
		float motorista = 0.06f;
		float estoquista = 0.05f;
		float tecnicoTi = 0.08f;
	
		switch (opcao) {
		
		case 1:
			System.out.printf(" 1 - A opção selecionada é GERENTE.\n"
					+ "O Reajuste salarial foi de: 10%%");
			
			resultado = num1 + (num1 * gerente);
			System.out.printf(" O seu novo salario é %.2f", resultado);
			System.out.println("\n!!!Obrigado por utilizar nosso Sistema!!!");
			break;
		case 2:
			System.out.printf(" 1 - A opção selecionada é VENDEDOR.\n"
					+ "O Reajuste salarial foi de: 7%%");
			
			resultado = num1 + (num1 * vendedor);
			System.out.printf(" O seu novo salario é %.2f", resultado);
			System.out.println("\n!!!Obrigado por utilizar nosso Sistema!!!");
			break;
		case 3:
			System.out.printf(" 1 - A opção selecionada é SUPERVISOR.\n"
					+ "O Reajuste salarial foi de: 9%%");
			
			resultado = num1 + (num1 * supervisor);
			System.out.printf(" O seu novo salario é %.2f", resultado);
			System.out.println("\n!!!Obrigado por utilizar nosso Sistema!!!");
			break;
		case 4:
			System.out.printf(" 1 - A opção selecionada é MOTORISTA.\n"
					+ "O Reajuste salarial foi de: 6%%");
			
			resultado = num1 + (num1 * motorista);
			System.out.printf(" O seu novo salario é %.2f", resultado);
			System.out.println("\n!!!Obrigado por utilizar nosso Sistema!!!");
			break;
		case 5:
			System.out.printf(" 1 - A opção selecionada é ESTOQUISTA.\n"
					+ "O Reajuste salarial foi de: 5%%");
			
			resultado = num1 + (num1 * estoquista);
			System.out.printf(" O seu novo salario é %.2f", resultado);
			System.out.println("\n!!!Obrigado por utilizar nosso Sistema!!!");
			break;
		case 6:
			System.out.printf(" 1 - A opção selecionada é TECNICO DE TI.\n"
					+ "O Reajuste salarial foi de: 8%%");
			
			resultado = num1 + (num1 * tecnicoTi);
			System.out.printf(" O seu novo salario é %.2f", resultado);
			System.out.println("\n!!!Obrigado por utilizar nosso Sistema!!!");
			break;
			
		default:
			System.out.println("\n!!!Obrigado por utilizar nosso Sistema!!!");
			break;
	}
		
					
		
		leia.close();
	}

}
