package assignment01;

import java.util.Scanner;

class DBS{
	
	double amount;
	static double balance = 500; 
	
	Scanner sc = new Scanner(System.in);
	Authentication authen = new Authentication();
	Data data = new Data();
	
	void chooseChoice(int choice){
		
		if(choice == 1){
			
			System.out.println();
			checkBalance();
			
		}else if(choice == 2){
			
			System.out.println();
			deposit();
			
		}else{
			
			System.out.println();
			withdraw();
			
		}
	}
	
	void deposit(){
		
		System.out.print("Enter Amount : ");
		
		amount = authen.validateAmount(sc);
		
		balance += amount;
		
		System.out.println("Successful done...");
		checkBalance();
	}
	
	void withdraw(){
		
		System.out.print("Enter Amount : ");
		amount = authen.validateAmount(sc);
		
		if(amount > balance){
			
			System.out.println("Sorry Insufficient Amount");
			
		}else{
			
			balance -= amount;
			
			System.out.println("Successful done...");
			checkBalance();
		}
		
	}
	
	void checkBalance(){
		
		System.out.println("Available Balance : $" + balance);
		
	}
}

class Data{
	
	void showIntro(){
		System.out.println("Welcome to DBS Bank");
		System.out.println("===================");
	}
	
	void showMenu(){
		
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit");
		System.out.println("3. Wihdraw");
	}
	
	void showInputError(){
		
		System.out.println("Invalid Input. Please try again.");
		
	}
	
	void showClosing(){
		
		System.out.println("Thank You!!!");
		
	}
}

class Authentication{
	
	Data data = new Data();
	UserInput userIn = new UserInput();
	
	// validate continue input
	void validateInput(String input, Scanner sc, String inputFrom){
		
		if(input.equals("yes") || input.equals("1")){
			
			// shown when unable to login 
			if(inputFrom.equals("login")){
			
				userIn.userInput();
				
			}else{
				
				System.out.println();
				data.showMenu();
				System.out.println();
				
			}
			
		}else if(input.equals("no") || input.equals("2")){
			
			data.showClosing();
			
		// input other than (yes/no) and (1/2) 
		}else{
			
			System.out.println("Invalid input. Please try again.");
			
			System.out.print("Wish to Continue (yes/no) or (1/2) : ");
			String choice = sc.next().toLowerCase();
			validateInput(choice, sc, "validating");
			
		}
		
	}
	
	// validate dbs choice input
	int validateInput(Scanner sc){
		
		// input is not integer
		while(!sc.hasNextInt()){
							
			data.showInputError();
			System.out.print("Enter Your Choice Again : ");
			sc.next();
			
		}
		
		int dbsChoice = sc.nextInt();
						
		// input is not 1, 2 or 3
		while(dbsChoice < 1 || dbsChoice > 3){
							
			data.showInputError();
			System.out.print("Enter Your Choice Again : ");
			
			// input is not integer
			while(!sc.hasNextInt()){
								
				data.showInputError();
				System.out.print("Enter Your Choice Again : ");
				sc.next();
				
			}
			
			dbsChoice = sc.nextInt();
		}
		
		return dbsChoice;
	}
	
	void validateUser(String userName, String password){
		
		if(userName.equals("admin123") && password.equals("admin123")){
			
			System.out.println();
			System.out.println("Welcome '" + userName + "'");
			System.out.println();
			
			data = new Data();
			data.showMenu();
			
		}else{
			
			System.out.println("Sorry Unauthorized Customer...");
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Wish to Continue (yes/no) or (1/2) : ");
			String choice = sc.next().toLowerCase();
			validateInput(choice, sc, "login");
			
		}
		
	}

	double validateAmount(Scanner sc){
		
		// input not of double type
		while(!sc.hasNextDouble()){
					
			data.showInputError();
			System.out.print("Enter Amount Again : ");
			sc.next();
		}
				
		double amount = sc.nextDouble();
				
		// negative amount
		while(amount < 0){
					
			data.showInputError();
			System.out.print("Enter Amount Again : ");
			amount = sc.nextDouble();
					
		}
		
		return amount;
	}
}

class UserInput{
	
	void userInput(){
		
		String continueChoice;
		int dbsChoice;
		
		Scanner sc = new Scanner(System.in);
		Data data = new Data();
		DBS dbs = new DBS();
		Authentication authen = new Authentication();
		
		System.out.print("Enter ID and Password : ");
		authen.validateUser(sc.next(), sc.next());
		
		do{ 
			
			System.out.print("Enter Your Choice : ");
				
			dbsChoice = authen.validateInput(sc);
			dbs.chooseChoice(dbsChoice);
							
			System.out.print("Wish to Continue : ");
			continueChoice = sc.next().toLowerCase();
			authen.validateInput(continueChoice, sc, "choice");

		}while(!continueChoice.equals("no") && !continueChoice.equals("2"));
		
		data.showClosing();
	}
	
}

public class DBSApplication {
	
	public static void main(String[] args) {
		
		Data data = new Data();
		data.showIntro();
		
		UserInput userIn = new UserInput();
		userIn.userInput();
		
	}

}
