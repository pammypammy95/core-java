

package database;

import java.sql.SQLException;

public class MyApplication {

	public static void main(String[] args) throws SQLException{
		MyClass ref = new MyClass();
		
		ref.insertData();
		ref.getData();
	}

}
