package day06;

class Employee{
	
	//able to call constructor to constructor
	
	Employee(){
		this("Ramboo"); // write inside a constructor as first statement
		System.out.println("I am in default constructor.");
	}
	
	Employee(String name){
		this(25, 4500);
		System.out.println("Hello " + name);
	}
	
	Employee(int age, double salary){
		System.out.println("Age :" + age + " salary");
	}
	
}

public class Example02 {
	
	public static void main(String[] args){
		
		new Employee();
		//new Employee("Ramboo");
		//new Employee(25, 4500);
		
		
	}
	
}
