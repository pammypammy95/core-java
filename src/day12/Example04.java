package day12;

import java.util.Scanner;

class DivideByZeroException extends ArithmeticException{
	
	//unable to find exception found in java libraries, therefore use of throw keyword
	
	static void myMethod(){
		
		System.out.println("enter a divisor : ");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(value==0){
			try {
				throw new DivideByZeroException();
			} catch (DivideByZeroException e) {
				// TODO: handle exception
				System.out.println("Divisor cant be 0.");
			}
			
		}else{
			System.out.println(10/value);
		}
	}
	
}

public class Example04 {
	// throw: user-defined exception
	//throw keyword : point to memory location
	// once you have exception, it creates memory
	public static void main(String[] args) {
		DivideByZeroException.myMethod();
	}
	
}
