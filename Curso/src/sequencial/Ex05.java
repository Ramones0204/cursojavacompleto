package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//Fazer um programa para ler o c�digo de uma pe�a 1, o n�mero de pe�as 1, o valor unit�rio de cada pe�a 1, o
		//c�digo de uma pe�a 2, o n�mero de pe�as 2 e o valor unit�rio de cada pe�a 2. Calcule e mostre o valor a ser pago.
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o c�digo da primeira pe�a");
		int codigo1 = sc.nextInt();
		System.out.println("Informe o numeros de primeira pe�a");
		int num1 = sc.nextInt();
		System.out.println("Informe o valor unitario da primeira pe�a");
		double valor1 = sc.nextDouble();
				
		System.out.println("Informe o c�digo da segunda pe�a");
		int codigo2 = sc.nextInt();
		System.out.println("Informe o numeros de segunda pe�a");
		int num2 = sc.nextInt();
		System.out.println("Informe o valor unitario da segunda pe�a");
		double valor2 = sc.nextDouble();
				
		double total = num1*valor1 + num2*valor2;
		
		System.out.println(codigo1 + codigo2);
		System.out.print("Valor a pagar: " + total);
		
		sc.close();
		
	}

}
