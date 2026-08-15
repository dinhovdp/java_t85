
	package aula_06_collections;

	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Scanner;
	import java.util.Set;



	public class Exercicios_collections_set {

		public static void main(String[] args) {
			
			// Instanciação das classes necessárias
			Scanner leia = new Scanner(System.in);
			Set<Integer> numeros = new HashSet<Integer>();
			
			System.out.println("*************************************************");
			System.out.println("Digite 10 valores inteiros NÃO REPETIDOS:");
			System.out.println("*************************************************");
			
			// Laço para garantir a inserção de exatamente 10 números no Set
			while (numeros.size() < 10) {
				System.out.print("Digite o " + (numeros.size() + 1) + "º número: ");
				int valor = leia.nextInt();
				
				// O método .add() retorna falso se o número já existir no Set
				if (!numeros.add(valor)) {
					System.out.println("Este número já foi digitado! Tente outro.");
				}
			}
			
			System.out.println("\n*************************************************");
			System.out.println("Listando os dados do Set utilizando Iterator:");
			System.out.println("*************************************************");
			
			// Criação e configuração do Iterator para percorrer o Set
			Iterator<Integer> iNumeros = numeros.iterator();
			
			// Percorre e exibe cada elemento individualmente
			while (iNumeros.hasNext()) {
				System.out.println(iNumeros.next());
			}
			
			leia.close();
		}
	}
