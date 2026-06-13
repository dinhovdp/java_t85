package aula_02_variaveis;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		

		Scanner leia = new Scanner(System.in);
		
		float matematica;
		float portugues;
		float ingles;
		float artes;
		float media;
		
		System.out.print( "Digite a nota da disciplina de Matemática: ");
		matematica = leia.nextFloat();
		
		System.out.print( "Digite a nota da disciplina de Português: ");
		portugues = leia.nextFloat();
		
		System.out.print( "Digite a nota da disciplina de Inglês: ");
		ingles = leia.nextFloat();
		
		System.out.print( "Digite a nota da disciplina de Artes: ");
		artes = leia.nextFloat();
		
		media = (matematica + portugues + ingles + artes)/4;
		
			
		System.out.printf("\nA Soma das disciplinas é:  %.2f + %.2f + %.2f + %.2f = %.2f",
				matematica, portugues, ingles, artes, ((matematica + portugues + ingles + artes)));
		
		System.out.printf("\nA média das disciplinas é: %.2f", media);
		
		
	
		leia.close();
		
		
		
		
		
		
		
	}

}
