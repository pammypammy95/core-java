package day03;

import java.util.Scanner;

class UserInput2{
	
	static void access(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name, age, salary: ");
		String name = sc.next();
		int age = sc.nextInt();
		float salary = sc.nextFloat();
		
		System.out.println("You have entered: " + name + " " + age + " " + salary);
	}
}

class UserInput3{
	static void access(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter bank name, bank code: ");
		String bankName = sc.next();
		int bankCode = sc.nextInt();
		
		Bank ref = new Bank();
		ref.setBankName(bankName);
		ref.setBankCode(bankCode);
		
		System.out.println("You have entered " + ref.getBankName() + " "+ ref.getBankCode());
	}
}

public class Example06 {

	public static void main(String[] args) {
		
		// we can call by using ClassName.methodName()
		//UserInput2.access();	// no need to create object
		UserInput3.access();
	
	}

}
