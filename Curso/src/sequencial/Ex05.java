package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
		//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o código da primeira peça");
		int codigo1 = sc.nextInt();
		System.out.println("Informe o numeros de primeira peça");
		int num1 = sc.nextInt();
		System.out.println("Informe o valor unitario da primeira peça");
		double valor1 = sc.nextDouble();
				
		System.out.println("Informe o código da segunda peça");
		int codigo2 = sc.nextInt();
		System.out.println("Informe o numeros de segunda peça");
		int num2 = sc.nextInt();
		System.out.println("Informe o valor unitario da segunda peça");
		double valor2 = sc.nextDouble();
				
		double total = num1*valor1 + num2*valor2;
		
		System.out.println(codigo1 + codigo2);
		System.out.print("Valor a pagar: " + total);
		
		sc.close();
		
	}

}
