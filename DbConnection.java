package BusResv;

import java.sql.*;

public class DbConnection {
	
	private static final String url = "jdbc:mysql://localhost:3306/busrev";
	private static final String userName = "root";
	private static final String password = "as3df5@gh7jk9";
	
	public static Connection getConnection() throws SQLException{
		return DriverManager.getConnection(url,userName, password);
	}

}
