package assignment05;

//Pamela

import java.util.ArrayList;
import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

class Question{	
	
	List<String> ref = new ArrayList<String>();
	
	Question(){
		ref.add("2 + 5 = ?" + "\n1. 7" + "   2. 10" + "   3. 12" + "   4. 5");
		ref.add("3 + 3 = ?" + "\n1. 4" + "   2. 6" + "   3. 2" + "   4. 55");
		ref.add("6 + 6 = ?" + "\n1. 4" + "   2. 10" + "   3. 12" + "   4. 6");
		ref.add("3 + 8 = ?" + "\n1. 1" + "   2. 0" + "   3. 12" + "   4. 11");
		ref.add("4 + 5 = ?" + "\n1. 9" + "   2. 10" + "   3. 8" + "   4. 5");
	}
	
	public void getQuestion(int i){
		System.out.println(ref.get(i));
	}
}

class Logic{
	
	void logic(){
		
		int totalPoint = 0;
		
		Map<Question, Integer> ref = new LinkedHashMap();
		
		ref.put(new Question(), 1);
		ref.put(new Question(), 2);
		ref.put(new Question(), 3);
		ref.put(new Question(), 4);
		ref.put(new Question(), 1);
		
		Set set = ref.entrySet();
		Iterator i = set.iterator();
		
		int count = 0;
		
		while(i.hasNext()) {
	         
			Map.Entry me = (Map.Entry) i.next();
	        Question temp = (Question)me.getKey();
	        temp.getQuestion(count);
	        
	        Scanner sc = new Scanner(System.in);
	        
	        try {
				System.out.println("Enter Choice: ");
				int choice = sc.nextInt();
				
				Integer ichoice = choice;
				//System.out.println(me.getValue());
				if(ichoice == (me.getValue())){
					System.out.println("Correct");
					totalPoint += 2;
				}else{
					System.out.println("Incorrect. Answer is " + me.getValue());
				}
			} catch (InputMismatchException e) {
				System.out.println("Enter 1 to 4 only.");
			}
	        
	        count += 1;
	        
	    }
		
		System.out.println("Total point: " + totalPoint);
		
		
	}
	
}

public class MultipleChoiceQuestion {

	public static void main(String[] args) {
		
		
		Logic logic = new Logic();
		logic.logic();
/*
		if(choice == 1 && map2.containsKey(1)){
			if(map2.get(1) == map1.get("2 + 5")){
				System.out.println("Correct");
			}
		}else{
			System.out.println("Wrong");
		}
		*/
	}

}
