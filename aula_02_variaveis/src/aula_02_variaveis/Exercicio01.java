package aula_02_variaveis;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float salario;
		float abono;
				
		Scanner leia = new Scanner(System.in);
		
		System.out.print( "Digite o salário: ");
		salario = leia.nextFloat();
		
		System.out.printf("Digite o abono: ");
		abono = leia.nextFloat();
		
		System.out.println("O valor do seu novo salário é: ");
		
		System.out.printf("\n %.2f + %.2f = %.2f", salario, abono, salario + abono);
		
		
		leia.close();
		
		
	}

}
