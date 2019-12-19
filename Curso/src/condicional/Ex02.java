package condicional;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int x = sc.nextInt();
		
		if(x%2 == 0) {
			System.out.println("Par");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
