package aula_03_condicionais;

import java.util.Scanner;

public class CondicionalVF {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 21;
		
		if (idade >= 18) {
			System.out.println("O Participante é maior de idade!");
			System.out.println("Teste Finalizado!!"); }
		 else {
			System.out.println("o Participante é menor de idade!"); }

		
		leia.close();
	}
}
