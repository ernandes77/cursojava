package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com valor F: ");
		double f = scan.nextDouble();
		
		double c = 5*(f-32)/9;
		System.out.println("O valor da temperatura e: "+f+" F "+c+" C ");

	}

}
