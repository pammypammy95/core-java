package day07;

// if parent class does not have default constructor, child must call parent class parameterized constructor
class Laptop{ 
	String str = "oldData";
	Laptop(String str){
		System.out.println(str);
	}
} // end of laptop

class HP extends Laptop{

	HP(String str) {
		super(str); // call parent class constructor
		System.out.println(str + " " + 1234);
	}
	
} // end of HP

public class Example08 {

	public static void main(String[] args) {
		
		new HP("newData");
	}

}
