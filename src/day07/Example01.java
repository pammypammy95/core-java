package day07;

class GrandFather{
	
	void showGrandFather(){
		System.out.println("Hard Working");
	}
} // end of GrandFather

class Father extends GrandFather{
	
	void showFather(){
		System.out.println("Honest");
	}
	
}

class MyClass extends Father{
	
	void showMyClass(){
		showGrandFather();
		showFather();
	}
	
} // end of MyClass

public class Example01 {

	public static void main(String[] args) {
		
		MyClass ref = new MyClass();
		ref.showMyClass();

	}

}
