package org.login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQL {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "Cricket@07");
		
		String query = "select * from employees";
		
		PreparedStatement prepareStatement = connection.prepareStatement(query);
		
		ResultSet executeQuery = prepareStatement.executeQuery();
		
		while(executeQuery.next()) {
			
			String int1 = executeQuery.getString("FIRST_NAME");
			System.out.println(int1);
		}
		
		
		
	}

}
