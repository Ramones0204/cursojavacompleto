package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Conta;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta = null;
		
		System.out.println("Entre com o numero da conta");
		int numConta = sc.nextInt();
		System.out.println("Entre com o nome do titular");
		String nomeCliente = sc.next();
		System.out.println("Deposito Inicial (s/n)");
		String deposito = sc.next();
		
		if(deposito.equalsIgnoreCase("s")) {
			System.out.println("Informe o valor do deposito inicial");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(nomeCliente, numConta, depositoInicial);	
			System.out.println(conta);
			
		} else if (deposito.equalsIgnoreCase("n")) {
			conta = new Conta(nomeCliente, numConta);
			System.out.println(conta);
		}
		
		System.out.println("Entre com o valor do deposito");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		System.out.println(conta);
			
		System.out.println("Entre com o valor do saque");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);
		System.out.println(conta);
		
		sc.close();

	}

}
