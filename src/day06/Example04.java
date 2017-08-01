package day06;

class Student{
	private String studentName;
	
	//Solution 1
	/*Student(String studentName){
		this.studentName = studentName;
	}*/
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString(){ // converts object to string format
		return studentName + " " + 12345; // returns in the form of a object
	} // end of toString
	
} // end of class

public class Example04 {

	public static void main(String[] args) {

		//Student refStudent = new Student("James");
		Student refStudent = new Student();
		refStudent.setStudentName("James");
		System.out.println(refStudent); // print references of the class
		
	}

}
