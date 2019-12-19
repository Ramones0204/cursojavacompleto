package model.dao;

import db.DB;
import model.dao.impl.DepartamentoDaoJDBC;
import model.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
	
	public static VendedorDao criarVendedor() {
		return new VendedorDaoJDBC(DB.getConnection());
	}
	
	public static DepartamentoDao criarDepartamento() {
		return new DepartamentoDaoJDBC(DB.getConnection());
	}
}
