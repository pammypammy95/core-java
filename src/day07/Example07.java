package day07;


// rule: if parent class have default constructor, child class by right, will get that
// default constructor execute first
class Car{
	
	Car(){
		System.out.println("Car default constructor..");
	}
	
} // end of Class

class Honda extends Car{
	Honda(){
		System.out.println("Honda default constructor..");
	}
} // end of Honda

public class Example07 {

	public static void main(String[] args) {
		new Honda();
	}

}
