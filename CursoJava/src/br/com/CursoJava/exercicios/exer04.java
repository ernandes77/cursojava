package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer04 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com valor do M: ");
		double M =scan.nextDouble();
		
		double c = (M *100);
		
		System.out.println("O valor do metro: " +M+" E igual a: "+c+ "centimetro");


	}

}
