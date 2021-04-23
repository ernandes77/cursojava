package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer02 {

	public static void main(String[] args) {
		

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com valor: ");
		double numero = scan.nextDouble();
		
		System.out.println("Entre com valor: ");
		double numero2 = scan.nextDouble();
		
		double soma = numero + numero2;
		System.out.println("O resultado e: " +soma);

	}

}
