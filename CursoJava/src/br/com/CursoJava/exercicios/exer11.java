package br.com.CursoJava.exercicios;

import java.util.Scanner;

public class exer11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com valor hora: ");
		double hora = scan.nextDouble();
		
		System.out.println("Entre com valor horatb: ");
		double horatb = scan.nextDouble();
		
		double salario = hora* horatb;
		double imposrenda = salario /8;
		double inss = salario /8;
		double sindicato = salario /5;
		double valliquido = salario/imposrenda/inss/sindicato;
		
		System.out.println("Salario bruto: "+salario);
		System.out.println("Quanto pagou imposrenda: "+imposrenda);
		System.out.println("Quanto pagou inss: "+inss);
		System.out.println("Quanto pagou sindicato: "+sindicato);
		System.out.println("Valor liquido: " +valliquido);

	}

}
