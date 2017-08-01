package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample01 {

	public static void main(String[] args) {
		
		//generic type : object
		
		//ArrayList ref = new ArrayList(); strong reference
		//List ref = new ArrayList();
		List<Object> ref = new ArrayList<Object>(); // upcasting, list is a parent class, losse coupling, weak reference
		ref.add(123);
		ref.add("java");
		ref.add(12.45);
		
		Person pRef = new Person();
		pRef.setName("Melvin");
		
		ref.add(pRef);
		
		//System.out.println(ref); // print as array, toString() method
		
		//for loop
		for(int i = 0; i < ref.size(); i++){
			System.out.println(ref.get(i));
		}
		
		//for each loop
		for(Object temp : ref){
			System.out.println(temp);
		}
		
		//for efficiency wise, use iterator
		//using iterator interface
		Iterator itrRef = ref.listIterator();
		while(itrRef.hasNext()){
			System.out.println(itrRef.next());
		}
	}

}
