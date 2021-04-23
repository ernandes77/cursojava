package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer09 {

	public static void main(String[] args) {
	
		
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Entre com numero inteiro: ");
			int numero = scan.nextInt();
			
			System.out.println("Entre com valor inteiro2: ");
			int numero2 = scan.nextInt();
			
			System.out.println("Entre com valor real: ");
			double real = scan.nextDouble();
			
			int resultado = numero*2/2;
			double resultado2 = 3 * numero + real;
			double resultado3 = real *2;
			
			System.out.println("O resultado " +resultado);
			System.out.println("O resultado 2" +resultado2);
			System.out.println("o resultado 3" +resultado3);
		
	}

}
