package aula_03_condicionais;

import java.util.Scanner;

public class Exercicios_02 {

	public static void main(String[] args) {
			
		Scanner leia = new Scanner(System.in);
		
		int num1;
							
		System.out.println("Digite o numero à verificar: ");
		num1 = leia.nextInt();
							
		
						
		//else if significa "Senão se", e ela precisa de uma condição.
							
		System.out.printf("O número digitado foi o : %d  ", num1);
			
		//if é "se": e ela precisa de uma condição.
		if (num1 > 0 && num1 % 2 == 0) {

		    System.out.println("\nO número digitado é Positivo e Par");

		    
		  //else if é "senao se": e ela precisa de uma condição diferente da anterior.
		} else if (num1 > 0 && num1 % 2 != 0) {

		    System.out.println("\nO número digitado é Positivo e Ímpar");

		  //else if é "senao se": e ela precisa de uma condição diferente da anterior.
		} else if (num1 < 0 && num1 % 2 == 0) {

		    System.out.println("\nO número digitado é Negativo e Par");

		  //else significa "senão" e não vai nenhuma condição
		} else {

		    System.out.println("\nO número digitado é Negativo e Ímpar");
		}
		
					
		
		
		
		
		
	leia.close();
	}
}
