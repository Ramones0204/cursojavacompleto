package aplicacao;

import java.io.BufferedReader;
import java.io.FileReader;

public class Aula2 {

	public static void main(String[] args) {
		String arq = "C:\\Users\\Ramon\\Documents\\arq.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(arq))) {
			String linha = br.readLine();
			while (linha != null) {
				System.out.println(linha);
				linha = br.readLine();
			}

		} catch (Exception e) {
			System.out.println("Erro " + e.getMessage());
		}

	}

}