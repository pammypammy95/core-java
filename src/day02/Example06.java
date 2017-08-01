package day02;

class Admin{
	String name = "James";
	
	@Override
	public String toString() {
	    return name;
	 }
	
	
}

public class Example06 {

	public static void main(String[] args) {
				
		Admin ref = new Admin();
		System.out.println(ref);
	
	}

}
