package aula_04_repeticoes;

import java.util.Scanner;


public class Exercicios_Lista_02 {

	public static void main(String[] args) {
				
		
		Scanner leia = new Scanner(System.in);
		//String caractere;
		

		System.out.println("Insira um numero negativo para encerrar o Programa\n");
		
		int idade = 0, mediaIdade = 0, menor21 = 0, maior50 = 0;
		
		while(idade>=0) {
			
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		 
		
		if (idade<0)
			System.out.println("Contagem de  finalizada.");
		
		
		//Contagem de pessoas com menos de 21 anos.
		if (idade < 21 && idade >= 0)
			menor21 ++;
		
		
		//Contagem de pessoas com mais de 50 anos;
		if (idade > 50)
			maior50 ++;
		
		//Contagem de pessoas com idade entre 21 e 50 anos;
				if (idade <= 50  && idade >= 21)
					mediaIdade ++;
				
				//tentei e nao deu certo
				//if (idade != caractere)
					//System.out.println("Caractere Invalido!\nPrograma Finalizado.");
				
			/*aguardar novas instruçoes do curso. nao consegui criar algo que reconheça
				caracterediferente de numero para nao dar erro no console*/
				
		
		}
		
		System.out.printf("\nTotal de pessoas menores de 21 anos: %d", menor21);
		System.out.printf("\nTotal de pessoas maiores de 50 anos: %d", maior50);
		System.out.printf("\nTotal de pessoas entre 21 e 50 anos: %d", mediaIdade);
		
		int resultado = menor21 + maior50 + mediaIdade;
		System.out.printf("\nTotal de pessoas que participaram da pesquisa %d", resultado);
		
		leia.close();
	}

}
