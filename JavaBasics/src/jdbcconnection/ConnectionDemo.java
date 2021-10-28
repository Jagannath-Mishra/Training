package jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {
	public static void main(String[] argv) {

		System.out.println("-------- MySQL JDBC Connection Demo ------------");
		try {
			
			
			
			Class.forName("com.mysql.jdbc.Driver");
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			
			
			System.out.println("MySQL JDBC Driver not found !!");
			return;
		}
		System.out.println("MySQL JDBC Driver Registered!");
		
		
		Connection connection = null;
		
		
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?characterEncoding=latin1&useConfigs=maxPerformance",
					
					"foo", 
					
					"bar");
			
			
			System.out.println("SQL Connection to database established!");

			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			//System.out.println("Connection Failed! Check output console");
			return;
		} finally {
			try {
				if (connection != null)
					connection.close();
				System.out.println("Connection closed !!");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
