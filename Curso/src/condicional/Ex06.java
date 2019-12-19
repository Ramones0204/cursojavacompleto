package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um valor entre 0 e 100");
		double x = sc.nextDouble();
		
		if(x < 0 || x > 100) {
			System.out.println("Fora do intervalo");
		}
		else if (x >= 0 && x <= 25) {
			System.out.println("Intervalo [0,25]");
		}
		else if (x > 25 && x <=50) {
			System.out.println("Intervalo [25,50]");
		}
		else if (x > 50 && x <= 75) {
			System.out.println("Intervalo [50,75]");
		}
		else {
			System.out.println("Intervalo [75,100]");
		}
		
		
		sc.close();
	}

}
