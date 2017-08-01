package day08;

abstract class Brand{
	 
	abstract void showBrand();
	
} // end of Brand

abstract class Laptop extends Brand{
	
	abstract void showLaptop();
	
} // end of Laptop

class Dell extends Laptop{

	@Override
	void showLaptop() {
		
	}

	@Override
	void showBrand() {
		
	}
	
} // end of Dell

public class AbstractClassExample02 {

	public static void main(String[] args) {

	}

}
