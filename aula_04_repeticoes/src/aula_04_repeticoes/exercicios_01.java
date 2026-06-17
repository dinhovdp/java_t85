package aula_04_repeticoes;

import java.util.Scanner;

public class exercicios_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

		int numeroInicial, numeroFinal;

		System.out.println("Regra: o primeiro numero deve ser menor que o segundo\n");
		System.out.print("Digite o primeiro número: ");
		numeroInicial = leia.nextInt();

		System.out.print("Digite o segundo número: ");
		numeroFinal = leia.nextInt();

		for (int numero = numeroInicial; numero <= numeroFinal; numero++) {

		    if (numero % 3 == 0 && numero % 5 == 0) {
		        System.out.println(numero);
		        //ao colocar o else, ele interpretará as outras linhas que nao atende os requisitos
		        //então, eu não inseri.
		       
		    }
		    
		    else { (numero % 3 != 0 && numero % 5 != 0)
	    	     System.out.println("Intervalo inválido");
			        	
		      
		    }
		    	
		        
		    }

		}
		
		
		
		leia.close();
	}

}
