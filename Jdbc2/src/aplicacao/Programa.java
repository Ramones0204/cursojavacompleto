 package aplicacao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import db.DB;

public class Programa {

	public static void main(String[] args) throws ClassNotFoundException {
		Connection con = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			String sql = "select * from department";	
			con = DB.getConnection();
			st = con.createStatement();
			rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getInt("id") + "," + rs.getString("name"));
				
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			DB.closeRs(rs);
			DB.closeSt(st);
			DB.getConnection();
		}
		
	}

}
