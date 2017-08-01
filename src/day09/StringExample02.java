package day09;

public class StringExample02 {

	public static void main(String[] args) {
		
		Person p1 = new Person("admin");
		Person p2 = new Person("admin");
		
		if (p1.equals(p2)) {
			System.out.println(true);
			System.out.println(p1.hashCode() + " " + p2.hashCode());
		} else {
			System.out.println(false);
			System.out.println(p1.hashCode() + " " + p2.hashCode());
		}
		
	}

}
