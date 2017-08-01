

package day17;

//generic :something in general

class Person{
	String name;

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString(){ //convert object to string format
		return name;
	}
	
} // end of Person

class MyClass{
	
	public void myMethod(Object objRef){	// as a generic parameter
		System.out.println(objRef);
	}
	
} // end of class

public class ObjectExample {

	public static void main(String[] args){
		
		MyClass ref = new MyClass();
		ref.myMethod(123);
		ref.myMethod("Java");
		ref.myMethod(12.50);
		ref.myMethod(true);
		
		Person pRef = new Person();
		pRef.setName("Wang");
		
		ref.myMethod(pRef);
	}
	
}
