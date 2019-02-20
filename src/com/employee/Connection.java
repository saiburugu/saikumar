package com.employee;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Connection {
	private static final Connection ONE= new Connection();
	
	private static Connection conn;
	
	Connection()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orcl11g");
		} catch (ClassNotFoundException |SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Connection getInstance()
	{
		return ONE;
	}
		public static Connection getConnection() {
		return conn;
	}
	/*public static void main(String[] args) {
		System.out.println(ConnectionFactory.getConnection());
	}*/

}
