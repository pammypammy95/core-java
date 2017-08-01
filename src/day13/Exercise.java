package day13;

import java.util.Scanner;

class CheckBalanceException extends Exception {

	public static void checkBalance() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the no. of data to be entered");
		int number = sc.nextInt();

		BankAcc b[] = new BankAcc[number];

		for (int i = 0; i < number; i++) {

			BankAcc bb = new BankAcc();

			System.out.println("Enter name: ");
			String name = sc.next();
			bb.setName(name);

			System.out.println("Enter balance: ");
			int balance = sc.nextInt();
			bb.setBalance(balance);

			b[i] = bb;
		}

		for (BankAcc bankAcc : b) {

			if (bankAcc.getBalance() < 500) {
				try {
					throw new CheckBalanceException();
				} catch (CheckBalanceException e) {
					System.out.println(bankAcc.getName() + " " + bankAcc.getBalance() + ", your balance can't be less than 500");
				}
			} else {
				System.out.println(bankAcc.getName() + " " + bankAcc.getBalance());
			}
		}
	}
}

public class Exercise {

	public static void main(String[] args) {

		CheckBalanceException.checkBalance();
	}

}
