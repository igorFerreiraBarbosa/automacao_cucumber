package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
	private static final String userName = "automacao";
	private static final String password = "Pass@123";
	private static final String dbUrl = "jdbc:mysql://localhost:3306/banco_teste_automacao";
	
	public Connection getConnection() throws Exception {
		Connection connection = DriverManager.getConnection(dbUrl, userName, password);
		
		return connection;
	}
}
