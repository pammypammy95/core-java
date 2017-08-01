package day17;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample02 {

	public static void main(String[] args) {

		List ref = new ArrayList();
		
		//allows duplicate values
		//same insertion order, same way it will insert into db
		
		ref.add("java");
		ref.add("java");
		ref.add(null);
		ref.add(123);
		ref.add(null);
		ref.add("java");
		ref.add(null);
		
		System.out.println(ref);
	}

}
