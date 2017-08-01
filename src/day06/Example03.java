package day06;

class A{
	private B refB; // refB is a reference of class B
	
	//solution 1 (by using constructor )
	//not recommended
	/*
	A(B refB){ // refB is a reference of Type B
		this.refB = refB; // assigning to global variable
	}
	*/
	
	//solution2 ( by using setter method )
	//recommended
	public void setRefB(B refB) {
		this.refB = refB;
	}
	
	void access(){
		refB.show();
	}
	
} // end of class A

class B{
	void show(){
		System.out.println("I am in show..");
	}
} // end of class B

public class Example03 {

	public static void main(String[] args){
		
		B refB = new B();
		A refA = new A();
		
		refA.setRefB(refB);
		refA.access();
	}
	
}
