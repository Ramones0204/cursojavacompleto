package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import db.DB;
import db.DbException;
import model.dao.VendedorDao;
import model.entidades.Departamento;
import model.entidades.Vendedor;

public class VendedorDaoJDBC implements VendedorDao {
	private Connection con;

	public VendedorDaoJDBC(Connection con) {
		this.con = con;
	}

	@Override
	public void inserir(Vendedor vendedor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void atualizar(Vendedor vendedor) {
		// TODO Auto-generated method stub

	}

	@Override
	public void removerPeloId(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Vendedor buscarPeloId(Integer id) {
		// TODO Auto-generated method stub
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT seller.*,department.Name as DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id WHERE seller.Id = ?";
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			rs = st.executeQuery();

			if (rs.next()) {
				Departamento dep = instanciarDep(rs);
				Vendedor vendedor = instanciarVendedor(rs, dep);
				return vendedor;
			}
			return null;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeRs(rs);
			DB.closeSt(st);
		}
	}

	private Vendedor instanciarVendedor(ResultSet rs, Departamento dep) throws SQLException {
		Vendedor vendedor = new Vendedor();
		vendedor.setId(rs.getInt("Id"));
		vendedor.setNome(rs.getString("Name"));
		vendedor.setEmail(rs.getString("Email"));
		vendedor.setSalario(rs.getDouble("BaseSalary"));
		vendedor.setDtNascimento(rs.getDate("BirthDate"));
		vendedor.setDepartamento(dep);
		return vendedor;
	}

	private Departamento instanciarDep(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		Departamento departamento = new Departamento();
		departamento.setId(rs.getInt("DepartmentId"));
		departamento.setNome(rs.getString("DepName"));
		return departamento;
	}

	@Override
	public List<Vendedor> listar() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT seller.*,department.Name as DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id";
			st = con.prepareStatement(sql);
			rs = st.executeQuery();
			List<Vendedor> listaVendedor = new ArrayList<>();
			Map<Integer, Departamento> map = new HashMap<>();
			
			while (rs.next()) {
				Departamento dep = map.get(rs.getInt("DepartmentId"));
				if (dep == null) {
					dep = instanciarDep(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}
				Vendedor vendedor = instanciarVendedor(rs, dep);
				listaVendedor.add(vendedor);
			}
			return listaVendedor;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeRs(rs);
			DB.closeSt(st);
		}
	}

	@Override
	public List<Vendedor> buscarPeloDepartamento(Departamento departamento) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			String sql = "SELECT seller.*,department.Name as DepName FROM seller INNER JOIN department ON seller.DepartmentId = department.Id WHERE DepartmentId = ? ORDER BY Name";
			st = con.prepareStatement(sql);
			st.setInt(1, departamento.getId());
			rs = st.executeQuery();
			List<Vendedor> listaVendedor = new ArrayList<>();
			Map<Integer, Departamento> map = new HashMap<>();

			while (rs.next()) {

				Departamento dep = map.get(rs.getInt("DepartmentId"));
				if (dep == null) {
					dep = instanciarDep(rs);
					map.put(rs.getInt("DepartmentId"), dep);
				}
				Vendedor vendedor = instanciarVendedor(rs, dep);
				listaVendedor.add(vendedor);
			}
			return listaVendedor;
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeRs(rs);
			DB.closeSt(st);
		}

	}

}
