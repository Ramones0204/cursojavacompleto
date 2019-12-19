package aplicacao;

import java.util.Date;

import entidades.Departamento;
import entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Departamento obj = new Departamento(1,"Livros");
		System.out.println(obj);
		Vendedor vendedor = new Vendedor(11, "Ramon","ramon@gmail.", new Date(),2000.00, obj);
		System.out.println(vendedor);
		
		
	}

}
