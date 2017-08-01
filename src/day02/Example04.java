package day02;

class User{
	
	void showUser1(int number){
		System.out.println(number);
	} // end of showUser1
	
	String showUser2(){
		return "user1";
	} // end of showUser2
	
	String showUser3(){
		return 1234 + " " + "user3";
	} // end of showUser3
	
	int showUser4(int userID){
		return userID;
	} // end of showUser4
	
	double showUser5(float salary){
		return salary;
	} // end of showUser5
	
	String showUser6(int age, String name, float salary){
		return age + " " + name + " " + salary;
	} // end of showUser6
	
} // end of class

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User ref = new User();
		
		ref.showUser1(100);
		System.out.println(ref.showUser4(200));
	}

}
