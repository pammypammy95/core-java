package day08;

//Purpose
//suppose designer have design a vehicle class, and vehicle has two general method
//for a new product, they need a template, and vehicle is the new product
//is-a relationship

//drawback
// cannot create objects of abstract class
//cannot extend more than one abstract class

// how to create an abstract class
abstract class Vehicle{ // we use abstract keyword to create abstract class
	
	//abstract class can contain concrete methods
	void display(){
		// method with a body..
	}
	
	// main purpose of abstract class is to declare an abstract method
	
	// how to declare an abstract method
	abstract void gear(); // abstract method ends with a semicolon
	
	abstract void shoBreak();
	
} // end of vehicle

class Car extends Vehicle{

	@Override
	void gear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void shoBreak() {
		// TODO Auto-generated method stub
		
	}
	
}

class Bus{
	
}

public class AbstractClassExample01 {

	public static void main(String[] args) {
		
		

	}

}
