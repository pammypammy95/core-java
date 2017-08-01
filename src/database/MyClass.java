package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MyClass {

	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	PreparedStatement ps = null;
	
	void getData() throws SQLException{
		                                                                                                 
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(""
				+ "select * from employee");
	
		while(rs.next()) // check for the next record
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
	
		con.close();
	} // end of getData
	
	void insertData() throws SQLException{
		
		con = DBConnection.myConnection();
		ps = con.prepareStatement("insert into employee values(?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter empID, empName and address : ");
		
		int empID = sc.nextInt();
		String empName = sc.next();
		String address = sc.next();
		
		Employee ref = new Employee();
		ref.setEmpID(empID);
		ref.setEmpName(empName);
		ref.setAddress(address);
		
		ps.setInt(1, ref.getEmpID());
		ps.setString(2, ref.getEmpName());
		ps.setString(3, ref.getAddress());
		
		
		//ps.setInt(1, 101); // 1 specifies the first parameter in the query
		//ps.setString(2, "Daryl");
		//ps.setString(3, "Bedok");
		//set and get from pojo
		
		int i = ps.executeUpdate();
		System.out.println(i + " records instead");
	}
}
