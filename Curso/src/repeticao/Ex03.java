package repeticao;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o tipo de combustível");
		System.out.println("1.Álcool");
		System.out.println("2.Gasolina");
		System.out.println("3.Diesel");
		System.out.println("4.Fim");
		int op = sc.nextInt();
		int gasolina = 0;
		int diesel = 0;
		int alcool =0;

		while (op != 4) {
			if (op < 1 || op > 4) {
				System.out.println("Opção invalida");
			}
			System.out.println("1.Álcool");
			System.out.println("2.Gasolina");
			System.out.println("3.Diesel");
			System.out.println("4.Fim");
			if(op == 1) {
				alcool = alcool +1;
			} else if (op == 2) {
				gasolina = gasolina +1;
			} else if (op == 3 ) {
				diesel = diesel + 1;
			}
			op = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		sc.close();
	}

}
