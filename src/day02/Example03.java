package day02;

class FaceBook{
	
	int userID;
	String password;
	
	void access(int userID, String pwd){
		
		this.userID = userID;			// use 'this' operator to call global variable
		password = pwd;					// names are different, so we don;t need to use 'this' operator
		
		logic();	
	}
	
	void logic(){	//no parameter
		
		// make your logic
		if(userID == 1001 && password.equals("admin")){
			display();
		}else{
			showError();
		}
		
	}
	
	void display(){
		System.out.println(userID + " " + password);
	}
	
	void showError(){
		System.out.println("Not Valid...");
	}
	
} // end of class

public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FaceBook ref = new FaceBook();
		ref.access(2002, "admin");
		//ref.display();
		
	} // end of main 

} // end of class
