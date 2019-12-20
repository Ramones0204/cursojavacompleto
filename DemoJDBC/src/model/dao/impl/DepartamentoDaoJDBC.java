package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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
		PreparedStatement st = null;
		String sql = "INSERT INTO department (Name) VALUES (?)";
		try {
			st = con.prepareStatement(sql);
			st.setString(1, departamento.getNome());
			st.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DbException(e.getMessage());
		} finally {
			DB.closeSt(st);
		}
	}

	@Override
	public void atualizar(Departamento departamento) {
		PreparedStatement st = null;
		String sql = "update department set Name = ? where id = ?";
		try {
			st = con.prepareStatement(sql);
			st.setString(1, departamento.getNome());
			st.setInt(2, departamento.getId());
			st.executeUpdate();
		} catch (Exception e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeSt(st);
		}
	}

	@Override
	public void removerPeloId(Integer id) {
		PreparedStatement st = null;
		String sql = "delete from department where id = ? ";
		try {
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
		} catch (Exception e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeSt(st);
		}
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
			if (rs.next()) {
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
	
	@Override
	public List<Departamento> listar() {
		PreparedStatement st = null;
		ResultSet rs = null;
		String sql = "select * FROM department";
		try {
			st = con.prepareStatement(sql);
			rs = st.executeQuery(sql);
			List<Departamento> listaDep = new ArrayList<Departamento>();
			while (rs.next()) {
				Departamento departamento = instanciarDepartamento(rs);
				listaDep.add(departamento);
			}
			return listaDep;
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	private Departamento instanciarDepartamento(ResultSet rs) throws SQLException {
		Departamento departamento = new Departamento();
		departamento.setId(rs.getInt("Id"));
		departamento.setNome(rs.getString("name"));
		return departamento;
	}


}
