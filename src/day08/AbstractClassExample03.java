package day08;

abstract class Oracle{
	
	abstract void myDriverOracle();
}

//Microsoft and Oracle can't have IS-A relationship
abstract class Microsoft{
	abstract void myDriverMicrosoft();
}

class Driver extends Microsoft{
	
	@Override
	void myDriverMicrosoft() {
		System.out.println("MicroSoft Drvier implemented..");
	}
	
	// how to implement myDriverOracle() from Oracle..
	Oracle oRef = new Oracle() { // Anonymous inner class, also known as nested class
		
		@Override
		void myDriverOracle() {
			System.out.println("Oracle Drvier implemented..");	
		}
	};
	
	
}

public class AbstractClassExample03 {

	public static void main(String[] args) {
		
		Driver dRef = new Driver();
		dRef.myDriverMicrosoft();
		dRef.oRef.myDriverOracle();

	}

}
