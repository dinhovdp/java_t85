package aula_02_variaveis;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	
		float numero1;
		float numero2;
		float numero3;
		float numero4;
		float diferenca;
		
System.out.println("*** CALCULE A DIFERENÇA ENTRE 2 GRUPOS ***");
		
		System.out.print("Digite o primeiro número do grupo 1: ");
		numero1 = leia.nextFloat();
		
		System.out.print("Digite o segundo número do grupo 1: ");
		numero2 = leia.nextFloat();
		
		System.out.print("Digite o primeiro número do grupo 2: ");
		numero3 = leia.nextFloat();
		
		System.out.print("Digite o segundo númerodo grupo 2: ");
		numero4 = leia.nextFloat();
		
		System.out.println("\nSegue expressão do calculo realizado");
		System.out.printf("(%.2f x %.2f) - (%.2f x %.2f)\n", numero1, numero2, numero3, numero4);
		System.out.println("\nSegue o resultado cálculo realizado");
		diferenca = ((numero1 * numero2) - (numero3 * numero4));				
				
		System.out.printf("\nA Diferenca da Multiplicação entre o grupo 1 e o grupo 2 é = %.2f ", diferenca);
		
		leia.close();
		
		}

}
