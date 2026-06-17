package aula_04_repeticoes;

import java.util.Scanner;

public class Exercicios_03_laco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner leia = new Scanner(System.in);
		
		

		int numero;
		int soma = 0;

		
		//faça...
		do {

		    System.out.print("Digite um número: ");
		    numero = leia.nextInt();

		    //se numero for maior que ZERO
		    if (numero > 0) {
		        soma += numero;
		        
		        //soma o numero
		    }

		    //enquanto o numero for diferente de zero
		} while (numero != 0);

		
		
		System.out.println("Soma dos positivos: " + soma);
		
	leia.close();
		
		
	}

}
