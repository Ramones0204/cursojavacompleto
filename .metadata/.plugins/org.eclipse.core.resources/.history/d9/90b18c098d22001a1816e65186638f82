 package aplicacao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


import db.DB;
import db.DBIntegridadeException;

public class Programa {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		PreparedStatement st = null;
		
		try {
			String sql = "delete from department where id = ?";
			con = DB.getConnection();
			st = con.prepareStatement(sql);
			st.setInt(1,2);
			
			int rowsAffected = st.executeUpdate();
			
			System.out.println("Linhas afetadas " + rowsAffected);
		} catch (SQLException e) {
			// TODO: handle exception
			throw new DBIntegridadeException(e.getMessage());
		} finally {
			DB.closeSt(st);
			DB.getConnection();
		}
		
	}

}
