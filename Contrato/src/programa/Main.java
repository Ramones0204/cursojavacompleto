package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalhador;

public class Main {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Informe o departamento");
		String nomeDepartamento = sc.next();
		System.out.println("Inform seu nome");
		String nomeTrabalhador = sc.next();
		System.out.println("Inform o nivel");
		String nivelTrabalhador = sc.next();
		System.out.println("Inform o Salario Base");
		Double salarioBase = sc.nextDouble();
		
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.println("Informe o numero de contratos para o funcionario");
		int n = sc.nextInt();
		
		for (int i = 1; i <=n; i++) {
			System.out.println("Entre com os datos do contrato numero" + i);
			System.out.println("Data (DD/MM/YYYY)");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			
		}
		
		sc.close();

	}

}
