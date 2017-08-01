package day08;

interface Country{
	//final int countryCode; // error 
	int countryCode = 2020; // by default, final and static 
}

interface MyInterface1{
	void myMethod1();
}

interface MyInterface2{
	void myMethod2();
}

class MyClass1 implements MyInterface1{

	//normal class implements interface, need to overwrite method 
	@Override
	public void myMethod1() {
		System.out.println("My method 1");
	}
	
	//MyInterface2 refMyInterface = new MyInterface2(); // not possible
	//consider as lamboo expression in java 8
	MyInterface2 refMyInterface = new MyInterface2(){

		@Override
		public void myMethod2() {
			System.out.println("My method 2");
		}
		
	}; // end of anonymous inner class
	
} // end of MyClass1

public class InterfaceExample03 {

	public static void main(String[] args) {
		System.out.println(Country.countryCode);
	}

}
