package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		//Fazer um programa que leia o n�mero de um funcion�rio, seu n�mero de horas trabalhadas, o valor que recebe por
		//hora e calcula o sal�rio desse funcion�rio. A seguir, mostre o n�mero e o sal�rio do funcion�rio, com duas casas decimais.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu n�mero");
		int numerofun = sc.nextInt();
		System.out.println("Informe as horas trabalhas");
		double horas = sc.nextDouble();
		System.out.println("Informe o valor das horas");
		double valor = sc.nextDouble();
		
		double salario = horas * valor;
		
		
		System.out.println("Numero " + numerofun);
		System.out.printf("Salario = U$ %.2f%n", salario);
		
		
		sc.close();
	}

}
