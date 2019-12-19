package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo 
         Fórmula da área: area = π . raio2
         Considere o valor de π = 3.14159
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double pi = 3.14159;
		
		System.out.println("Informe o valor do raio");
		double raio = sc.nextDouble();
		
		double area = pi * (raio * raio);
		
		System.out.printf("%.4f%n",area);
		
		sc.close();
		
	}

}
