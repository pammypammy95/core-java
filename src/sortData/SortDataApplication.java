package sortData;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// we are going to use Comparator interface to sort data
// comparator interface is also known as custom sorting order

public class SortDataApplication {

	public static void main(String[] args) {
		
		List ref = new ArrayList();
		// we are creating object of person class and calling parameterized constructor of person class. 
		//person class object we have pass as value inside add method
		//creating object of class and adding value to the arraylist
		ref.add(new Person("james", 45));
		ref.add(new Person("anderson", 20));
		ref.add(new Person("boon", 30));
		ref.add(new Person("kathy", 10));
		
		// get data
		for (Object temp : ref) {
			System.out.println(temp);
		}
		
		// comparator interface 1st way
		//Collection is an interface, root interface for all interface in Collection framework
		Collections.sort(ref, new SortByName());
		
		// get data
		System.out.println("\nSort by name");
		for (Object temp : ref) {
			System.out.println(temp);
		}
		
		//Comparator interface 2nd way
		//anonymous inner class
		Collections.sort(ref, new Comparator<Person>() {
			
			
			@Override
			public int compare(Person p1, Person p2) {
				return p1.getAge() - p2.getAge();
			}
			
		});
		
		// get data
		System.out.println("\nSort by name");
		for (Object temp : ref) {
			System.out.println(temp);
		}
	
	}

}
