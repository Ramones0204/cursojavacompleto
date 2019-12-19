package sequencial;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
		//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor a ");
		int a = sc.nextInt();	
		System.out.println("Informe o valor b ");
		int b = sc.nextInt();
		System.out.println("Informe o valor c ");
		int c = sc.nextInt();
		System.out.println("Informe o valor d");
		int d = sc.nextInt();
		
		int diferenca = a*b-c*d;
		
		System.out.println(diferenca);
		
		sc.close();
	}

}
