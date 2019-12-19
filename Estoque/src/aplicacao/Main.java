package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Produto produto = new Produto();
		System.out.println("Entre com os dados do produto");
		System.out.println("Name");
		produto.name = sc.next();
		System.out.println("Preço");
		produto.preco = sc.nextDouble();
		System.out.println("Quantidade no Estoque");
		produto.qtd = sc.nextInt();
		
		System.out.println(produto);
		
		System.out.println("Entre com a quantidade a ser adicionada");
		int qtd = sc.nextInt();
		produto.adcionarProduto(qtd);
		System.out.println("Dados Atualizado " + produto);
		
		System.out.println("Entre com a quantidade a ser removida");
		qtd = sc.nextInt();
		produto.removerProduto(qtd);
		System.out.println("Dados Atualizado " + produto);
		
		sc.close();

	}

}
