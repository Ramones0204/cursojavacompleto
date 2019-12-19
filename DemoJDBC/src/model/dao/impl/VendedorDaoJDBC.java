package model.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
		PreparedStatement st = null;
		try {
			String sql = "INSERT INTO seller (Name, Email, BirthDate, BaseSalary, DepartmentId) VALUES (?, ?, ?, ?, ?)";
			st = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			st.setString(1, vendedor.getNome());
			st.setString(2, vendedor.getEmail());
			st.setDate(3, new Date(vendedor.getDtNascimento().getTime()));
			st.setDouble(4, vendedor.getSalario());
			st.setInt(5, vendedor.getDepartamento().getId());
			int rows = st.executeUpdate();
			
			if(rows > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					vendedor.setId(id);
				}
				DB.closeRs(rs);
			} else {
				throw new DbException("linha não inserida");
			}
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeSt(st);
			
		}
 
	}

	@Override
	public void atualizar(Vendedor vendedor) {
		PreparedStatement st = null;
		try {
			String sql = "UPDATE seller SET Name = ?, Email = ?, BirthDate = ?, BaseSalary = ?, DepartmentId = ? WHERE Id = ?";
			st = con.prepareStatement(sql);
			st.setString(1, vendedor.getNome());
			st.setString(2, vendedor.getEmail());
			st.setDate(3, new Date(vendedor.getDtNascimento().getTime()));
			st.setDouble(4, vendedor.getSalario());
			st.setInt(5, vendedor.getDepartamento().getId());
			st.setInt(6,vendedor.getId());
			st.executeUpdate();
			
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeSt(st);
			
		}

	}

	@Override
	public void removerPeloId(Integer id) {
		PreparedStatement st = null;
		String sql = "DELETE FROM seller WHERE Id = ?";
		try {
			st = con.prepareStatement(sql);
			st.setInt(1, id);
			st.executeUpdate();
		} catch (SQLException e) {
			throw new DbException(e.getMessage());
		} finally {
			DB.closeConnection();
		}

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
