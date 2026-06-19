package aula_07_metodos;

import java.util.Scanner;

public class Aula_07_Atividades_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);
		
		String[][] alunos = new String[5][3];
		
		//preenchendo com for, a matriz
		for(int cadastroAluno = 0; cadastroAluno < 5; cadastroAluno++){

		    System.out.print("Nome: ");
		    alunos[cadastroAluno][0] = leia.next();

		    System.out.print("Idade: ");
		    alunos[cadastroAluno][1] = leia.next();

		    System.out.print("Nota: ");
		    alunos[cadastroAluno][2] = leia.next();

		}
		
		for(int cadastroAluno = 0; cadastroAluno < 5; cadastroAluno++){

		    System.out.println("Nome: " + alunos[cadastroAluno][0]);
		    System.out.println("Idade: " + alunos[cadastroAluno][1]);
		    System.out.println("Nota: " + alunos[cadastroAluno][2]);

		}
		
		//acumular a soma das notas
		double soma = 0;

		for(int cadastroAluno = 0; cadastroAluno < 5; cadastroAluno++){

		    soma += Double.parseDouble(alunos[cadastroAluno][2]);

		}

		double media = soma / 5;
		
	}
		
		leia.close();
	}

}
