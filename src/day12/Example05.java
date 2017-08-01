package day12;

class ValidateAge extends Exception{
	
	public ValidateAge(String string) {
		System.out.println(string);
	}

	public static void validateUserAge(){
		
		int age = 16;
		
		if(age<18){
			
			//ValidateAge ref = new ValidateAge();
			
			//throw keyword inside class, (user-defined exception, that class must extend exception class
			// so that you can point to a reference
			
			try {
				//throw ref;
				//throw new ValidateAge("old data..."); //calling parameterized constructor
				throw new ValidateAge("age cant be less than 18.");
				
			} // end of try 
			
			catch (ValidateAge e) { // handle exception
			//	System.out.println("age cant be less than 18.");
			}//end of catch
			
		} // end of if
		
		else{
			System.out.println("Welcome... ");
		} // end of else	
		
	} // end of validateUserAge
	
} // end of validateAge

public class Example05 {

	public static void main(String[] args) {
		
		ValidateAge.validateUserAge();
		
	}

}
