package day03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput{
	
	void accept() throws IOException{
		BufferedReader ref = new BufferedReader(new InputStreamReader(System.in));
		/*System.out.println("Enter a character : ");
		//char c = (char) ref.read();
		char c = ref.readLine().charAt(2);
		System.out.println("You have entered " + c);*/
		
		/*System.out.println("Enter your name: ");
		String name = ref.readLine(); 	//readLine does not need casting
		System.out.println("Your name: " + name);*/
		
		System.out.println("Your age: ");
		//int age = ref.read();
		Integer age = Integer.parseInt(ref.readLine());
		System.out.println("Your age : " + age);
		
		System.out.println("Enter salary: ");
		Double salary = Double.parseDouble(ref.readLine());
		System.out.println("Salary : " + salary);
	}
}

public class Example05 {

	public static void main(String[] args) throws IOException {
		
		UserInput ref = new UserInput();
		ref.accept();

	}

}
