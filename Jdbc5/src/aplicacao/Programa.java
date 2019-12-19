 package aplicacao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import db.DB;
import db.DbException;

public class Programa {

	public static void main(String[] args) throws SQLException {
		Connection con = null;
		Statement st = null;
		
		try {
			con = DB.getConnection();
			con.setAutoCommit(false);
			st = con.createStatement();
			
			String sql = "update seller set BaseSalary = 2090 where DepartmentId = 1";
			String sql2 = "update seller set BaseSalary = 3090 where DepartmentId = 2";
			
			int rowsAffected = st.executeUpdate(sql); 
			
			//int x = 1;
			//	if(x<2) {
			//	throw new SQLException("Fake Erro");
			//}
		
			int rowsAffected2 = st.executeUpdate(sql2); 
			
			con.commit();
			System.out.println("Linhas afetadas " + rowsAffected);
			System.out.println("Linhas afetadas " + rowsAffected2);
			
		} catch (SQLException e) {
			// TODO: handle exception
			con.rollback();
			throw new DbException("Transa��o n�o realizada" );
		} finally {
			DB.closeSt(st);
			DB.getConnection();
		}
		
	}

}
