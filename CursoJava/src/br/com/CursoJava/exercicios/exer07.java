package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor de horas traba: ");
		double horastab = scan.nextDouble();
		
		System.out.println("Entre com valor hora: ");
		double valorhora = scan.nextDouble();
		
		double salario = horastab * valorhora;
		System.out.println("O valor do salario no mes e: " +salario);

	}

}
