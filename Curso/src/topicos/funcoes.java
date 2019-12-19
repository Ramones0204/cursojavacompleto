package topicos;

import java.util.Scanner;

public class funcoes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three number");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a,b,c);
		 
		showMaior(maior);
		
		
		sc.close();
		
	}
	
	public static int max(int x,int y,int z) {
		int aux;
		
		if(x > z && x >y) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}
	
	public static void showMaior(int valor) {
		System.out.println("maior = " + valor);
	}

}
