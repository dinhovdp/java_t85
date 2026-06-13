package aula_02_variaveis;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		float salario_bruto;
		float adicional_noturno;
		float horas_extras;
		float descontos;
		float salario_liquido;
		
		System.out.print( "Digite o salário bruto: ");
		salario_bruto = leia.nextFloat();
		
		System.out.print( "Digite o valor do seu Adicional Noturno: ");
		adicional_noturno = leia.nextFloat();
		
		System.out.print( "Digite a quantidade de Horas Extras: ");
		horas_extras = leia.nextFloat();
		
		System.out.print( "Digite o valor de descontos: ");
		descontos = leia.nextFloat();
		
		//Conforme a orientação do exercício, as horas extras estão sendo multiplicadas por 5
		//isso significa que, no Console irá pedir multiplicar a quantidade de horas extras
		//e essa multiplicação será de 5 reais x quantidade de horas extras inseridos no console.
		
		salario_liquido = (salario_bruto + adicional_noturno + (horas_extras * 5) - descontos);
					
		System.out.printf("\nO Salario Liquido é: %.2f", salario_liquido);
				leia.close();
		
		}

}
