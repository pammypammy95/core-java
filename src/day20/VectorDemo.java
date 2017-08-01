package day20;

import java.util.Vector;

//ArrayList is non-synchronized which means multiple threads can work on ArrayList at the same time
//Vector is synchronized (thread-safe)

public class VectorDemo {

	public static void main(String[] args) {

			//ArrayList ref = new ArrayList();
			Vector ref = new Vector();
			ref.add("tv");
			ref.add("book");
			ref.add("pen");
			ref.add("laptop");
			ref.add(2,"car");
			System.out.println(ref.size()); // number of elements of an array
			
			for (int i = 0; i < ref.size(); i++) {
				System.out.println("vector element: "+ i + " "+ ref.get(i));
			}
			

	}

}