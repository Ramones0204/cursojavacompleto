package aplicacao;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		// Classe Array List implemento a inteface List 
		List<String> list = new ArrayList<>();
		
		//adicionando elementos na lista
		list.add("Ramon");
		list.add("Maria");
		list.add("Marco");
		list.add("Bob");
		list.add("Alex");
		list.add(2, "Nathalia");
		
		// retorna o tamanho da lista
		System.out.println(list.size());
		
		// removendo elemento da lista
		list.remove("Alex");
		list.remove(2);
		
		for (String x: list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------------");
		
		list.removeIf(x -> x.charAt(0) == 'M');
		System.out.println(list.size());
		
		for (String x: list) {
			System.out.println(x);
		}
		// recuperando pelo parametro
		System.out.println(list.indexOf("Ramon"));

	}

}
