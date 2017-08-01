package day17;

import java.util.ArrayList;
import java.util.List;

class Employee{
	String name;
	
	Employee(String name){
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}

public class ArrayListExample03 {

	public static void main(String[] args) {
		
		List ref = new ArrayList();
		ref.add(new Employee("james"));
		ref.add(new Employee("jasper"));
		ref.add(new Employee("james"));
		
		System.out.println(ref);
		
		for(int i = 0; i < ref.size(); i++){
			
			for(int j = i + 1; j < ref.size(); j++){
				
				if(ref.get(i).equals(ref.get(j))){
					System.out.println("Sorry " + ref.get(j) + ", duplicate name.");
					ref.remove(j);
					
					
				}
				
			}
			
		}
		System.out.println(ref);
		
	}

}
