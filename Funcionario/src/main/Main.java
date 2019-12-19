package main;

import java.util.Locale;
import java.util.Scanner;

import classes.Funcionario;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		System.out.println("Informe o nome");
		funcionario.name = sc.next();
		System.out.println("Informe o salario bruto");
		funcionario.salarioBruto = sc.nextDouble();
		System.out.println("Informe o imposto");
		funcionario.imposto = sc.nextDouble();
		
		System.out.println("Dados " + funcionario.name + " " + "R$ " + funcionario.salarioLiquido());
		
		System.out.println("Informe o valor do aumento");
		double porcentagem = sc.nextDouble();
		
		System.out.println("Valor atualizado " + "R$" + funcionario.proximoSalario(porcentagem));
		
		sc.close();
		
	}

}
