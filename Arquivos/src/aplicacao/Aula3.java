package aplicacao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Aula3 {

	public static void main(String[] args) {
		String[] linhas = new String[] {"Bom dia","Boa tarde","Boa noite"};
		
		String caminho = "C:\\Users\\Ramon\\Documents\\teste.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(caminho,true))) {
			for(String linha:linhas) {
				bw.write(linha);
				bw.newLine();
			}
			
		} catch (IOException e) {
			// TODO: handle exception
			
		}

	}

}
