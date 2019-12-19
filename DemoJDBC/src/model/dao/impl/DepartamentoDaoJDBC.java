package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.DepartamentoDao;
import model.entidades.Departamento;

public class DepartamentoDaoJDBC implements DepartamentoDao {

	private Connection con;

	public DepartamentoDaoJDBC(Connection con) {
		this.con = con;
	}

	@Override
	public void inserir(Departamento departamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Departamento departamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerPeloId(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Departamento buscarPeloId(Integer id) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * FROM department where id = ?";
		try {
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();
				if(rs.next()) {
					Departamento dep = instanciarDepartamento(rs);
					return dep;
				}
				return null;
			} catch (Exception e) {
				throw new DbException(e.getMessage());
			} finally {
				DB.closeRs(rs);
				DB.closeSt(st);
			}
			
		}

	private Departamento instanciarDepartamento(ResultSet rs) throws SQLException {
		Departamento departamento = new Departamento();
		departamento.setId(rs.getInt("Id"));
		departamento.setNome(rs.getString("name"));
		return departamento;
	}

	@Override
	public List<Departamento> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
