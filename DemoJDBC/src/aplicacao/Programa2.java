package aplicacao;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartamentoDao;
import model.entidades.Departamento;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartamentoDao departamentoDao = DaoFactory.criarDepartamento();
		
		System.out.println("Departamento pelo id");
		Departamento departamento = departamentoDao.buscarPeloId(3);
		System.out.println(departamento);
		
		System.out.println("Listar todos");
		List<Departamento> lista = departamentoDao.listar();
		for(Departamento dep  : lista) {
			System.out.println(dep);
		}
		
		System.out.println("Inserir Departamento");
		Departamento novoDepartamento = new Departamento(null, "Musica");
		departamentoDao.inserir(novoDepartamento);
		System.out.println("Departamento Inserido");
		
		System.out.println("Atualizar departamento");
		novoDepartamento = new Departamento(5, "Musica alterado");
		departamentoDao.atualizar(novoDepartamento);
		System.out.println("Departamento Atualizado");
		
		System.out.println("Informe um Id para ser excluido");
		Scanner sc = new Scanner(System.in);
		int id = sc.nextInt();
		departamentoDao.removerPeloId(id);
		System.out.println("departamento excluido");
		sc.close();
	}

}
