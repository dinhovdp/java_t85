package aula_07_metodos;

import java.util.Scanner;

public class CalculadoraMetodos {

	
public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double numero1, numero2;

		System.out.println("*** CALCULADORA BÁSICA ***");
		
		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();
		
		//quem esta somando aqui é a classe SOMAR, que esta no final do codigo
		System.out.printf("\n %.2f + %.2f = %.2f", numero1, numero2, somar(numero1, numero2));
		System.out.printf("\n %.2f - %.2f = %.2f", numero1, numero2, subtrair(numero1, numero2));
		System.out.printf("\n %.2f * %.2f = %.2f", numero1, numero2, multiplicar(numero1, numero2));
		System.out.printf("\n %.2f / %.2f = %.2f", numero1, numero2, dividir(numero1, numero2));
		
		System.out.printf("\n %.2f ^ %.2f = %.2f", numero1, numero2, potencializacao(numero1, numero2));
		System.out.printf("\n Raiz Quadrada %.2f = %.2f", numero1, raizquadrada (numero1));
		
		
		sobre();
		leia.close();
			
}

//esse public class, el eé um metodo, el esta dentro da primeira classe chamada MAIN,
//mas, ela não pode estar "fora junto" mas elas consegue se comunicar, entre MAIN e a SOMAR
 public static double somar(double numero1, double numero2) {
	 return numero1 + numero2;
	 
 }

//esse public class, el eé um metodo, el esta dentro da primeira classe chamada MAIN,
//mas, ela não pode estar "fora junto" mas elas consegue se comunicar, entre MAIN e a SOMAR
public static double subtrair(double numero1, double numero2) {
	 return numero1 - numero2;
	 
}

//esse public class, el eé um metodo, el esta dentro da primeira classe chamada MAIN,
//mas, ela não pode estar "fora junto" mas elas consegue se comunicar, entre MAIN e a SOMAR
public static double multiplicar(double numero1, double numero2) {
	 return numero1 * numero2;
	 
}

//esse public class, el eé um metodo, el esta dentro da primeira classe chamada MAIN,
//mas, ela não pode estar "fora junto" mas elas consegue se comunicar, entre MAIN e a SOMAR
public static double dividir(double numero1, double numero2) {
	 return numero1 / numero2;
	 
	 
}

public static double potencializacao(double numero1, double numero2) {
	 return  Math.pow(numero1, numero2);
	 
	 
}
public static double raizquadrada(double numero1) {
	 return  Math.sqrt (numero1);
	 
	 
}


//esse public class, vai dizer quem fez  o projeto
//

public static void sobre() {
System.out.println("\nProjeto Calculadora Basica");
System.out.println("Desenvolvido por: Edson");
	 
	 
}
	
}
