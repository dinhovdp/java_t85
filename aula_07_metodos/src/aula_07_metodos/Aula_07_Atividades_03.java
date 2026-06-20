package aula_07_metodos;

import java.util.ArrayList;
import java.util.Scanner;

public class Aula_07_Atividades_03 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<String> produtos = new ArrayList<String>();
        ArrayList<Integer> quantidades = new ArrayList<Integer>();

        int opcao;

        do {

            System.out.println("\n*******************************");
            System.out.println("      CONTROLE DE ESTOQUE      ");
            System.out.println("*******************************");
            System.out.println("1 - Adicionar Produto			");
            System.out.println("2 - Atualizar Quantidade"		);
            System.out.println("3 - Listar Produtos				");
            System.out.println("4 - Sair						");
            System.out.print("Escolha uma opção: 				");

            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {

            case 1:

                System.out.print("Digite o nome do produto: ");
                produtos.add(leia.nextLine());

                System.out.print("Digite a quantidade: ");
                quantidades.add(leia.nextInt());
                leia.nextLine();

                System.out.println("Produto cadastrado!");

                break;

            case 2:

                System.out.print("Digite o nome do produto: ");
                String nomeProduto = leia.nextLine();

                boolean encontrou = false;

                for (int contador = 0; contador < produtos.size(); contador++) {

                    if (produtos.get(contador).equalsIgnoreCase(nomeProduto)) {

                        System.out.print("Nova quantidade: ");
                        quantidades.set(contador, leia.nextInt());
                        leia.nextLine();

                        encontrou = true;

                        System.out.println("Quantidade atualizada!");

                        break;

                    }

                }

                if (!encontrou) {
                    System.out.println("Produto não encontrado.");
                }

                break;

            case 3:

                System.out.println("\nProdutos cadastrados:");

                for (int contador = 0; contador < produtos.size(); contador++) {

                    System.out.println("Produto: " + produtos.get(contador)
                            + " | Quantidade: " + quantidades.get(contador));

                }

                break;

            case 4:

                System.out.println("Programa encerrado.");

                break;

            default:

                System.out.println("Opção inválida.");

            }

        } while (opcao != 4);

        leia.close();

    


    }
}