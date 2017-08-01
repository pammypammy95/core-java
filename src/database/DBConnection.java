package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//its a singleton class
public class DBConnection {

	private static Connection connection = null;
	
	public static Connection myConnection(){
		
		try {
			//create object of Driver class
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			//passing url, userid and password to getConnection method
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java","root","admin");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
}
