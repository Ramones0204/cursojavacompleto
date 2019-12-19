package db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DB {

	private static Connection conn = null;

	public static Connection getConnection() {
		if (conn == null) {
			try {
				Properties properties = carregarPropriedades();
				String url = properties.getProperty("dburl");
				conn = DriverManager.getConnection(url, properties);
			} catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}

		return conn;
	}
	
	public static void closeConnection() {
		if(conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO: handle exception
				throw new DbException(e.getMessage());
			}
		}
	}

	private static Properties carregarPropriedades() {
		try (FileInputStream fs = new FileInputStream("db.properties")) {
			Properties pros = new Properties();
			pros.load(fs);
			return pros;
		} catch (IOException e) {
			throw new DbException(e.getMessage());
		}
	}
}