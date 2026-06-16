package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio_03 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
	String nome; 
		
		System.out.println("Digite o seu nome: ");
		nome = leia.next();
		
		System.out.println("Olá, " + nome + "\nSeja bem vindo ao nosso sistema de colaboradores!\n"
				+ "Selecione a opção para descobrir qual foi o percentual de Reajuste de Salario"
				+ "\nE o novo valor reajustado!");
		
		System.out.println("********************************************");
		System.out.println("		 Opções de CARGOS					");
		System.out.println("********************************************");
		System.out.println(" Por favor, escolha dentre as opções abaixo	");
		System.out.println("										    ");
		System.out.println("	1 - GERENTE			4 - MOTORISTA		");
		System.out.println("	2 - VENDEDOR	  	5 - ESTOQUISTA 	    ");
		System.out.println("	3 - SUPERVISOR	 /	6 - TECNICO DE TI   ");
		System.out.println("											");
		System.out.println("   Entre com qualquer tecla para Encerrar 	");
		System.out.println("											");
		System.out.println("********************************************");
					
	}
	
	int opcao;
	
	System.out.println("Escolha a Opção Desejada: ");
	opcao = leia.nextInt();
	
		System.out.printf("Nome: %s\n", nome);
		
		switch (opcao)
		

		
		
		
		
		leia.close();
	}

}
