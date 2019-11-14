package dbc;

import java.sql.*;

public class DatabaseConnection {
	
	private static final String URL="jdbc:sqlserver://127.0.0.1:1433;DatabaseName=Douban;";
	private static final String USER="sa";
	private static final String PASSWORD="123";
	private Connection conn=null;
	public DatabaseConnection() {
		
		try {
			this.conn=DriverManager.getConnection(URL, USER, PASSWORD);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return this.conn;
	}
	
	public void close() {
		if(this.conn!=null) {
			try {
				this.conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
