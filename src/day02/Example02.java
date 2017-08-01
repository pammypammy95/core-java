package day02;

class Employee{
	
	String employeeName = "Pamela";
	int employeeAge = 22;
	
	void displayInformation(){
		
		System.out.println(employeeName);
		System.out.println(employeeAge);
	
	} // end of displayInformation
	
} // end of class

public class Example02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e = new Employee();
		e.displayInformation();
		
	} // end of main

} // end of class
