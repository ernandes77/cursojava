package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com valor da altura: ");
		double altura = scan.nextDouble();
		
		double peso =(72.2*altura)-58;
		System.out.println("O peso ideal e: " +peso);
			
}
	}
