package aplicacao;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Aula1 {

	public static void main(String[] args) {
		//Lendo Arquivo com as classes File e Scanner
		File file = new File("C:\\Users\\Ramon\\Documents\\arq.txt");
		Scanner sc = null;
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());			}
		} catch (IOException e) {
			System.out.println("Erro " + e.getMessage());
		} finally {
			if(sc!= null) {
				sc.close();
			}
		}
	}

}
