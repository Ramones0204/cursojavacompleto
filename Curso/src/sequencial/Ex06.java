package sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor A");
		double a = sc.nextDouble();
		System.out.println("Informe o valor B");
		double b = sc.nextDouble();
		System.out.println("Informe o valor C");
		double c = sc.nextDouble();
		
		double triangulo = a*c/2;
		System.out.println("Triângulo " + triangulo);
		
		double pi = 3.14159;
		double circulo = pi*c*c;
		System.out.println("Circulo " + circulo);
		
		double trapezio = (a+b)*c/2;
		System.out.println("trapézio " + trapezio);

		double quadrado = b*b;
		System.out.println("Quadrado " + quadrado);
		
		double retangulo = a*b;
		System.out.println("Retangulo " + retangulo);
		
		sc.close();
	}

}
