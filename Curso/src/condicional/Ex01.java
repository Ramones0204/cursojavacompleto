package condicional;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//Fazer um programa para ler um n�mero inteiro, e depois dizer se este n�mero � negativo ou n�o.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe um numero");
		int x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("NEGATIVO");
		} else {
			System.out.println("N�O NEGATIVO");
		}
		
		sc.close();

	}

}
