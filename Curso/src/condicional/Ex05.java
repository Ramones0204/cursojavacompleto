package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double total = 0.0;
		
		System.out.println("Informe o código");
		int cod = sc.nextInt();
		System.out.println("Infomr a qtd");
		int qtd = sc.nextInt();

		if (cod == 1) {
			total = qtd * 4.00;
		} else if (cod == 2) {
			total = qtd * 4.50;
		} else if (cod == 3) {
			total = qtd * 5.00;
		} else if (cod == 4) {
			total = qtd * 2.00;
		} else {
			total = qtd * 1.50;
		}
		
		System.out.println("Total R$ " + total);
		sc.close();
	}

}
