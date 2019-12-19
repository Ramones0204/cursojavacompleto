package aplicacao;

import java.util.Scanner;

import classes.Retangulo;

public class Main {

	public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	   
	  Retangulo ret = new Retangulo();
	  System.out.println("Informe a altura");
	   ret.altura = sc.nextDouble();
	  System.out.println("Informe a altura");
	   ret.largura = sc.nextDouble();
	  
	  System.out.println(ret.area());
	  System.out.println(ret.perimetro());
	  System.out.println(ret.diagonal());
	  
	  sc.close();
	}

}
