package main;

import java.util.Scanner;

import classes.Aluno;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Aluno aluno = new Aluno();
		
		System.out.println("Informe o nome ");
		aluno.name = sc.next();
		System.out.println("Informe a n1 ");
		aluno.n1 = sc.nextDouble();
		System.out.println("Informe a n2 ");
		aluno.n2 = sc.nextDouble();
		System.out.println("Informe a n3 ");
		aluno.n3 = sc.nextDouble();
		
		System.out.println(aluno.calcularMedia());
		
		sc.close();
	}

}
