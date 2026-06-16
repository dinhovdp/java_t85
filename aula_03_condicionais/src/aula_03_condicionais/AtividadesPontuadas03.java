package aula_03_condicionais;

import java.util.Scanner;

public class AtividadesPontuadas03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome; 
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Olá, " + nome + "\nSeja bem vindo ao nosso sistema de calculos");
		
		System.out.println("********************************************");
		System.out.println("		Opções de Cálculo					");
		System.out.println("********************************************");
		System.out.println(" Por favor, escolha dentre as opções abaixo	");
		System.out.println("										    ");
		System.out.println("	1 - SOMA 	 / 	ADIÇÃO					");
		System.out.println("	2 - MENOS	 / 	SUBTRAÇÃO		 	    ");
		System.out.println("	3 - DIVIDIR	 /	DIVISÃO				    ");
		System.out.println("	4 - VEZES	 / 	MULTIPLICAÇÃO			");
		System.out.println("											");
		System.out.println("   Entre com qualquer tecla para Encerrar 	");
		System.out.println("											");
		System.out.println("********************************************");
		
		int opcao;
		System.out.println("Escolha a Opção Desejada: ");
		opcao = leia.nextInt();
		
		int num1 = 0;
		System.out.println("Insira o primeiro numero: ");
		num1 = leia.nextInt();
		
		int num2 = 0;
		System.out.println("Insira o segundo numero: ");
		num2 = leia.nextInt();
		
		float resultado = 0.2f;
				
		switch (opcao) {
		
			case 1:
				System.out.println("	1 - A opção selecionada é ADIÇÃO	");
				resultado = num1 + num2;
				System.out.printf("Resultado da soma é %.2f\n", resultado);
				System.out.println("!!!Obrigado por utilizar nosso Sistema!!!");
				break;
			
			case 2:
				System.out.println("	2 - A opção selecionada é SUBTRAÇÃO	");
				resultado = num1 - num2;
				System.out.printf("Resultado da subtração é %.2f\n", resultado);
				System.out.println("!!!Obrigado por utilizar nosso Sistema!!!");
				break;
			
			case 3:
				System.out.println("	3 - A opção selecionada é DIVISÃO	");
				
				
				if (num2 == 0) {    
					System.out.println("Erro: Não é possível dividir por zero.");
				} else {
					
					//E Eu achando que ia conseguir fazer rapido, mas,
					//por causa das casas decimais, e dividir por 0..
					//tomou muito tempo para conseguir buscar uma solução.
					//tive bastante dificuldade para criar isso, usei algumas soluções
					//que não tiveram tanto sucesso, até conseguir chegar nesse conceito
					//Porem, nos outros cases que nao precisou do IF e Else, foram tranquilas.
					//Mas, ainda demando muito tempo para conseguir construir com tudo que aprendi.
					
					
					resultado = (float) num1 / num2;
					System.out.printf("Resultado da divisão é %.2f\n", resultado);
				}
				
				System.out.println("!!!Obrigado por utilizar nosso Sistema!!!");
				break;
			
			case 4:
				System.out.println("	4 - A opção selecionada é MULTIPLICAÇÃO	");
				resultado = num1 * num2;
				System.out.printf("Resultado da Multiplicação é %.2f\n", resultado);
				System.out.println("!!!Obrigado por utilizar nosso Sistema!!!");
				break;
			
			case 5:
				System.out.println("	5 - Obrigado por utilizar nosso Sistema");
				break;
							
			default:
				System.out.println("!!!Obrigado por utilizar nosso Sistema!!!");
				break;
		}
		
		leia.close();
	}
}
