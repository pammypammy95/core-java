package day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//Map interface we use for key and value pair
//A map cannot contain duplicate keys
//Maps are perfectly for key-value association mapping such as dictionaries. 
//Retrieve and update elements by keys, or perform lookups by keys.

public class MapExample {

	public static void main(String[] args) {
		
		Map<String,Integer> ref = new HashMap();
		ref.put("google", 11);
		ref.put("twitter",3);
		ref.put("yahoo",5);
		ref.put("ebay",10);
		ref.put("alibaba",7);
		
        // get data
		Set set = ref.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.println(me.getKey() + " : " + me.getValue());
	      }
		
		System.out.println(ref.containsKey("abcd"));
		System.out.println(ref.containsValue(10));
		
	}
}

