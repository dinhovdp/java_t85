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
                
            default:
                System.out.println("Opção inválida!");
        }
    } while (opcao != 4);
                
            
        
            
                leia.close();
        }    
    }
        

        
    

           