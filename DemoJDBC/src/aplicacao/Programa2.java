package aplicacao;

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
	}

}
