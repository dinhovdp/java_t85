package aula_03_condicionais;

import java.util.Scanner;

public class AtividadesPontuadas02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia = new Scanner(System.in);

        String nome;
        String sensei;
        int nota;
        
        //Aqui eu quase esqueci de colocar "Line" no next,
        //e ao colocar sobrenome, ele pulava 2 interaçoes e dava erro.
        //descobri por acaso
        
        System.out.println("Digite o nome do Aluno: ");
		nome = leia.nextLine();
		
		System.out.println("Digite o seu nome (Professor): ");
		sensei = leia.nextLine();
		
		System.out.println("Digite a nota do Aluno:"+ nome);
		nota = leia.nextInt();
				
		/**
		 * 	Nota maior ou igual a 7 → Aprovado
			Nota maior ou igual a 5 e menor que 7 → Recuperação
			Nota menor que 5 → Reprovado

		 * */
		
		System.out.printf("Nome: %s\n", nome);
		
		if(nota > 0 && nota <= 4) {
			System.out.printf("A Nota informada é %d, Aluno foi reprovado na academia ninja.", nota);
			} else if(nota >= 5 && nota <= 6) {
			System.out.printf("A Nota informada é %d, Aluno foi encaminhado para recuperação junto com o Naruto", nota);
			} else if(nota >= 7 && nota <= 10) {
			System.out.println("A Nota informada é: " + nota + ".\nO Aluno foi Aprovado! o Aluno: " + nome +
					", está mais proximo de se tornar o proximo hokage!");
			
			} else {
			System.out.println("Nota Incorreta, por favor, insira um intervalo de numeros inteiros entre 0 a 10");
			System.out.println("Descanse um pouco " + sensei + "-Sensei, e verifique amanhã");
			}
		
		
		leia.close();
	}

}
