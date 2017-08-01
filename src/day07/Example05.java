package day07;

class Driver{
	
	Driver refDriver;
	
	Driver showDriver(Driver d){ // method returns to its class level
		refDriver = new Driver();
		return refDriver;
	}
	
} // end of Driver

class MySQL extends Driver{
	
	MySQL refMySQL;
	
	//covarient return type [after 1.5 feature]
	MySQL showDriver(MySQL ref){ // method returns to its class level
		refMySQL = new MySQL();
		return refMySQL;
	}
	
} // end of MySQL

public class Example05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
