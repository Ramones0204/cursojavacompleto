package condicional;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
	// Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao  
	//	Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em 	ordem crescente ou decrescente.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor A");
		int a = sc.nextInt();
		System.out.println("Informe o valor B");
		int b = sc.nextInt();
		
		if(a % b == 0 || b % a == 0) {
			System.out.println("São Multiplos");
		} else {
			System.out.println("Não Multiplos");
		}
		
		
		sc.close();
	}

}
