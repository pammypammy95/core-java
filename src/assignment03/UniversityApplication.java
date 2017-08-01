package assignment03;

import java.util.Scanner;

public class UniversityApplication{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter university name : ");
		
		University uni = BusinessLogic.logic(sc.next());
		uni.showUniversity();
		
	}

}
