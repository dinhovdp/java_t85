package aula_07_metodos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aula_07_Atividades_01 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<>();

        // Entrada dos números
        for (int contador = 1; contador <= 5; contador++) {
            System.out.print("Digite o " + contador + "º número: ");
            numeros.add(leia.nextInt());
        }

        // Exibe a coleção
        System.out.println("\nListgaem de números:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        // Exibe os resultados
        System.out.println("\nSoma: " + soma(numeros));
        System.out.println("Média: " + media(numeros));
        System.out.println("Maior valor: " + maior(numeros));

        leia.close();
    }

    // Método para calcular a soma
    public static int soma(ArrayList<Integer> numeros) {

        int soma = 0;

        for (Integer numero : numeros) {
            soma += numero;
        }

        return soma;
    }

    // Método para calcular a média
    public static double media(ArrayList<Integer> numeros) {

        return (double) soma(numeros) / numeros.size();
    }

    // Método para encontrar o maior valor
    public static int maior(ArrayList<Integer> numeros) {

        return Collections.max(numeros);
    }

}