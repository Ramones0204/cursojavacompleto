package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		/*
		 Fa�a um programa para ler dois valores inteiros, e depois mostrar na tela a
		  soma desses n�meros com uma mensagem explicativa
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero");
		int x = sc.nextInt();
		System.out.println("Informe o segundo numero");
		int y = sc.nextInt();
		
		int soma = x+y;
		
		sc.close();
		
		System.out.println("O valor da soma entre " + x + " e " + y + " � igual a " + soma);
		
	}

}
