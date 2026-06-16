package aula_03_condicionais;

import java.util.Scanner;

public class Exercicio_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner leia = new Scanner(System.in);
		
		
		int num1;
		int num2;
		int num3;
			
			
		System.out.println("Insira o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Insira o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Insira o terceiro numero: ");
		num3 = leia.nextInt();
		
		int soma = (num1 + num2);
		
		if(soma < num3 ) {
						
			System.out.printf("Não, O resultato %d Não é maior que o numero %d", soma, num3);
			 System.out.println("\nTeste Finalizado!!");
			
		} else if (soma > num3) {
			
			System.out.printf("Sim, o Resultado %d É maior que o Numero %d.! ", soma, num3);
		 System.out.println("\nTeste Finalizado!!");
		
				
	} else {  
		
		System.out.printf("O Resultado %d É igual ao o Numero %d.! ", soma, num3);
	 System.out.println("\nTeste Finalizado!!");
	}
		
		leia.close();
		
		
	
	}

}
