package aula_03_condicionais;

import java.util.Scanner;

public class AtividadesPontuadas01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        String nome;
        int idade;
        boolean autorizacao;

        System.out.println("Insira o seu nome:");
        nome = leia.nextLine();

        System.out.println("Insira a sua idade no Sistema:");
        idade = leia.nextInt();

        
        System.out.println("A Seguir, perguntaremos sua idade."
        		+ "\nUse TRUE para SIM"
        		+ "\nUse FALSE para NÃO."
        		+ "\nPossui autorização? (true/false)");
        autorizacao = leia.nextBoolean();

        if (idade >= 18) {

        	
        	//Precisamos que se responsabilize por seus atos se a Oficial Jane te prender.
            System.out.println("Olá, " + nome + "! Você é maior de idade, acesso liberado!"
                    + "\n***!!Bem vindo a Equipe Rocket!!***"
                    + "\nO Mestre Giovanni tem grandes expectativas sobre você.");

        } else if (autorizacao) {

            System.out.println("Olá, " + nome + "! Você é menor de idade e tem autorização, acesso liberado!"
                    + "\nVocê irá estagiar nos Ginásios da região de Kanto por enquanto...");

        } else {

            System.out.println("Você é menor de idade e não possui autorização."
                    + "\nUse Rare Candy e volte em outro momento.");
         // Vai crescer um pouco hahaha
        }

        leia.close();
    }
}