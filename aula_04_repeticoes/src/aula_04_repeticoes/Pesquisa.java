package aula_04_repeticoes;

import java.util.Scanner;

public class Pesquisa {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int idade, esporte, totalRespostas =0, somaIdades = 0, futebol =0, voleiM18 = 0;
		double mediaIdades;
	
		//armazena 1 caractere
		char continua = 'S';
		
	
		
		while (continua == 'S') {
			System.out.println("*******************************************");
			System.out.println("**** PEesquisa sobre Esportes Favoritos****");
			System.out.println("*******************************************");
			
			System.out.print("Digite a sua idade: ");
			idade = leia.nextInt();
			
			do {
			System.out.println("Escolha o seu Esporte Favorito: ");
			System.out.println("1 - FUTEBOL");
			System.out.println("2 - VOLEIBOL");
			System.out.println("3 - BASQUETEBOL");
			System.out.println("4 - OUTROS");
			
	
			esporte = leia.nextInt();
			}while (esporte < 1 || esporte > 4);
				
			
			/* Estatisticas*/
			
			// Total de pessoas que responderam a pesquisa
			totalRespostas ++;
			
			//soma total idades  que responderam a pesquisa
			somaIdades += idade;
			
			//Total de pessoas que gostam de futebol
			if ( esporte == 1)
				futebol++;
			
			//Total de pessoas que gostam de futebol
			if ( idade > 18 && esporte == 2)
				voleiM18++;
			
				
			
			//para criar um laço de repetição com Do e com While
			//criaremos um loop que faça o usuario digitar a opção correta.
			
			do {
			System.out.println("Deseja Continuar? (S/N)");
			continua =leia.next().toUpperCase().charAt(0);
			}while(!(continua == 'S') && !(continua == 'N'));
			
			
			//toUpperCase() ignora maiuscula e minuscula
			// charAt(0) irá ler o primeiro caractere escrito no console
			
			System.out.println("*****************************************");
		}

		mediaIdades = somaIdades / totalRespostas;
		
		System.out.printf("\nTotal de pessoas que gostam de futebol: %d", futebol);
		System.out.printf("\nTotal de pessoas que gostam de volei e tem mais de 18 anos: %d", voleiM18);
		System.out.printf("\nMédia das idades: %.2f", mediaIdades);


leia.close();

	}
}
