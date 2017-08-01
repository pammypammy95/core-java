package day08;

// interface is a fully abstract class

// how to create interface

//all interface are by default abstract, therefore, you can write or you can dont write
interface Bank{ // we use interface keyword to create interface
	//we cant write concrete method in interface
	
	
	// all the methods are by default public and abstract
	// therefore no need to state again
	void showCustomer(); // no error

	// if you want to declare a variable, then it must be final 
	//final means constant, you cant change the value
	//if do not write final, it will behave like final 
	final int bankCode = 102030;
	
	//interface does not contain any concrete method
	/*void show(){ //error
		// not possible
	}*/
	
} // end of interface

abstract class Customer implements Bank{

	// if you have interface you want to override in abstract class, no need
	// abstract class implement interface, dont need to overwrite the method. abstract class is a class of declaration
	// normal class (error),  need to overwrite the method.
	
	//abstract void showCustomer(); // error, you must write abstract keyword
	/*void show(){ // no error
		// possible 
	}*/
} // end of abstract class

public class InterfaceExample01 {

	public static void main(String[] args) {
		

	}

}
