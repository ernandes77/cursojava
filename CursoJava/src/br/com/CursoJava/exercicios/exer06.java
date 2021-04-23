package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer06 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com do quadrado: ");
		double lado =scan.nextDouble();
		
		double area =Math.PI * Math.pow(lado, 2);
		
		System.out.println("O valor do lado e: "+ area);
		System.out.println("O valor da area e:"+area+(area * 2));

	}

}
