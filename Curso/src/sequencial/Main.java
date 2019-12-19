package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// localidade default 
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite uma palavra");
		String palavra = sc.next();
		System.out.println("Você digitou " + palavra);
		
		System.out.println("Digite um numero inteiro");
		int x = sc.nextInt();
		System.out.println("Você digitou " + x);
		
		System.out.println("Digite um numero decimal");
		double y = sc.nextDouble();
		System.out.println("Você digitou " + y);
		// fechando o scanner 
		sc.close();
	}

}
