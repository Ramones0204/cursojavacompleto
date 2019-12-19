package repeticao;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String senha = sc.next();

		System.out.println("Informe a senha de acesso");
		
		while (!senha.equals("2002")) {
			System.out.println("Senha invalida");
			senha = sc.next();

		}
		
		System.out.println("Aceso liberado");
		sc.close();
	}

}
