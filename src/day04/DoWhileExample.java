package day04;

import java.util.Scanner;

class Data{
	
	static void showData(){
		System.out.println("Hello");
	}
	
} // end of class

class Logic{
	
	void checkCondition(String str){
		if(str.equals("admin123")){
			Data.showData();
		}else{
			System.out.println("Not Authorized..");
		}
	}
	
} // end of class

class Access {
	
	Logic ref = null;
	
	void userInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Password: ");
		
		ref = new Logic();
		ref.checkCondition(sc.next());
	}
	
} // end of class

public class DoWhileExample {

	public static void main(String[] args) {
		
		String choice = null;
		Scanner sc = new Scanner(System.in);
		
		do{
			Access ref = new Access();
			ref.userInput();
			System.out.println("Wish to Continue: ");
			choice = sc.next();
		}while(!choice.equals("no"));
		
		System.out.println("Thank You!!");
	}

}
