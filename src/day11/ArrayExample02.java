package day11;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of data to input : ");
		int numberOfData = sc.nextInt();
		
		Person p[] = new Person[numberOfData];
		
		for (int i = 0; i < p.length; i++) {
			
			Person person = new Person();
			
			System.out.print("Enter name : ");
			person.setName(sc.next());
			//String name = sc.next();
			
			System.out.print("Enter age : ");
			person.setAge(sc.nextInt());
			//int age = sc.nextInt();
			
			//p[i] = new Person(name, age);
			p[i] = person;
		}
		
		for (Person person : p) {
			System.out.println(person.getName() + " " + person.getAge());
			//System.out.println(person);
		}
		
	}

}
