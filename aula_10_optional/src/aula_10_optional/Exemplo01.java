package aula_10_optional;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//vamos estudar o erro null ponit
		
		static Scanner leia = new Scanner(System.in);
		
		
		
		
		for(var palavra : palavras) {
			System.out.println(palavra);

			Optional<String>checaNulo = Optional.ofNulLable(palavras[5]);

			if(checaNulo.isPresent()) {
			String palavra = palavras[5].toLowerCase();
			System.out.println(palavra);
			}else {
			System.out.println("A palavra é nula!");

			
		
		
	}

}
