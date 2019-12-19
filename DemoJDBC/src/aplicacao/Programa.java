package aplicacao;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VendedorDao vendedorDao = DaoFactory.criarVendedor(); 
		System.out.println("===Teste 1 : vendedor pelo ID");
		Vendedor vendedor = vendedorDao.buscarPeloId(3);
		System.out.println(vendedor);
		System.out.println("===Teste 2 : vendedor pelo Departamento");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> listaVend = vendedorDao.buscarPeloDepartamento(departamento);
		for(Vendedor vend : listaVend) {
			System.out.println(vend);
		}
		
	}

}
