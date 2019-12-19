package condicional;

import java.util.Locale;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		double imposto = 0.0;
		//double diferenca = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor do salario");
		double salario = sc.nextDouble();
		double salarioControle = salario;
		
		if(salario <= 2000) {
			System.out.println("Isento");
		}
		else if (salario > 2000 || salario <= 3000) {
			 double diferenca = salarioControle - 3000;
			 double impostoSalarioControle = diferenca * 0.18;
			 salario -= diferenca;
			 imposto = (salario - 2000) * 0.08;
			 imposto += impostoSalarioControle;
		} 
		else if (salario > 3000 && salario <= 4500) {
			
		} else {
			
		}
		
		System.out.println(imposto);
		
		sc.close();
	}

}
