package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer03 {

	public static void main(String[] args) {
	
Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor da nota1: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Entre com valor da nota numero2: ");
		double nota2 = scan.nextDouble();
		
		System.out.println("Entre com valor da nota3: ");
		double nota3 = scan.nextDouble();
		
		System.out.println("Entre com valor da nota4: ");
		double nota4 = scan.nextDouble();
		
		double media = (nota1+nota2+nota3+nota4)/2;
		System.out.println("A media do aluno e: " +media);

	}

}
