package aplicacao;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.println("===Teste 3 : Listar todos vendedores");
		listaVend = vendedorDao.listar();
		for(Vendedor vend : listaVend) {
			System.out.println(vend);
		}
		
		System.out.println("===Teste 4  : Inserir Vendedor");
		Vendedor novoVendedor = new Vendedor(null, "Ramon","ramon@gmail", new Date(), 4000.00, departamento);
		vendedorDao.inserir(novoVendedor);
		System.out.println("Novo vendedor inserido = " + novoVendedor.getId());
		
		System.out.println("===Teste 5  : Atualizar Vendedor");
		vendedor = vendedorDao.buscarPeloId(7);
		vendedor.setNome("Ramon Rodrigues de Oliveira Filho");
		vendedorDao.atualizar(vendedor);
		System.out.println("Atualizado");
		
		System.out.println("===Teste 6  : Deletar Vendedor");
		System.out.println("Informe o id");
		int id = sc.nextInt();
		vendedorDao.removerPeloId(id);
		System.out.println("Delete realizado");
		
		sc.close();
		
		
	}

}
