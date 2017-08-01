package day17;

class A{
	void show(){
		
	}
}

class B extends A{
	void show(){
		
	}
}

public class ClassCastException {

	public static void main(String[] args) {
		B refB = (B) new A();
		refB.show();
	}

}
