package day08;

abstract class A{
	abstract void showA();
} // end of abstract class A

interface B{
	void showB(); // no need to write abstract
}// end of interface B

interface C extends B{ // interface can extends another interface
	
} // end of interface C

interface D{
	void showD();
} // end of interface D

class MyClass extends A implements C, D{ //multiple inheritance through interface

	@Override
	public void showB() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void showA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void showD() {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

public class InterfaceExample02 {

	public static void main(String[] args){
		
	}
	
}
