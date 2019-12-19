 package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import db.DB;

public class Programa {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		PreparedStatement st = null;
		
		try {
			String sql = "update seller set BaseSalary = BaseSalary + ? where (DepartmentId = ?)";
			con = DB.getConnection();
			st = con.prepareStatement(sql);
			st.setDouble(1, 200);
			st.setInt(2, 2);	
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Linhas afetadas " + rowsAffected);
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DB.closeSt(st);
			DB.getConnection();
		}
		
	}

}
