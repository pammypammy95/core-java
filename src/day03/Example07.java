package day03;

import java.util.Scanner;

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int number = sc.nextInt();
		
		//Star
		for(int i = 1; i <= number; i++){
			for(int j = 1; j <= i; j++){
				System.out.print("*");
			}
			System.out.println();	
		}
		
		//Number
		for(int x = 1; x <= number; x++){
			for(int y = 1; y <= x; y++){
				System.out.print(y);
			}
			System.out.println();
		}
	}

}
