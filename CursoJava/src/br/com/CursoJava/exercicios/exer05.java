package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer05 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com valordo raio: ");
		double raio = scan.nextDouble();
		
		double area =Math.PI * Math.pow(raio, 2);
		System.out.println("O valor da area e: " +area);
	
	}

}
