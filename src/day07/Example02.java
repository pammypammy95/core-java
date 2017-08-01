package day07;

class Country{ // parent, super, or base class
	static void show1(){
		System.out.println("Country ==> show1");
	} // end of show1
	
	void show2(){
		System.out.println("Country ==> show2");
	} // end of show2
	
} // end of country

//child, sub, or derived class
class Singapore extends Country{ // Singapore is a type of country
	static void show1(){
		System.out.println("Singapore ==> show1");
	} // end of show1
	
	void show2(){
		System.out.println("Singapore ==> show2");
	} // end of show2
	
} // end of singapore


public class Example02 {

	public static void main(String[] args) {
		
		// creating object of Singapore and refer to its parent class
		//weak reference
		Country refCountry = new Singapore(); // upcasting
		refCountry.show1();
		refCountry.show2();
		
	}

}
