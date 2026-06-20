package aula_07_metodos;

import java.util.Scanner;

public class Aula_07_Atividades_02 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        // Matriz: 5 alunos x 3 informações
        String[][] alunos = new String[5][3];

        // Cadastro dos alunos
        for (int indiceAluno = 0; indiceAluno < alunos.length; indiceAluno++) {

            System.out.println("\nCadastro do " + (indiceAluno + 1) + "º aluno");

            System.out.print("Nome: ");
            alunos[indiceAluno][0] = leia.next();

            System.out.print("Idade: ");
            alunos[indiceAluno][1] = leia.next();

            System.out.print("Nota Final: ");
            alunos[indiceAluno][2] = leia.next();

        }

        // Listagem dos alunos
        System.out.println("\n========== ALUNOS CADASTRADOS ==========");

        for (int indiceAluno = 0; indiceAluno < alunos.length; indiceAluno++) {

            System.out.println("----------------------------------------");
            System.out.println("Nome       : " + alunos[indiceAluno][0]);
            System.out.println("Idade      : " + alunos[indiceAluno][1]);
            System.out.println("Nota Final : " + alunos[indiceAluno][2]);

        }

        System.out.printf("\nMédia Geral das Notas: %.2f\n", calcularMedia(alunos));

        leia.close();
    }

    // Método para calcular a média das notas
    public static double calcularMedia(String[][] alunos) {

        double somaNotas = 0;

        for (int indiceAluno = 0; indiceAluno < alunos.length; indiceAluno++) {

            somaNotas += Double.parseDouble(alunos[indiceAluno][2]);

        }

        double mediaGeral = somaNotas / alunos.length;

        return mediaGeral;
    }

}