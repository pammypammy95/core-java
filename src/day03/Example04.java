package day03;

public class Example04 {

	int var1 = 10;
	long var2 = var1;	// implicit casting done by JVM
	
	long var3 = 200;
	int var4 = (int) var3; // explicit casting done by programmer
	
	// up casting and down casting
	String str1 = "java";
	Object obj1 = str1;		// up casting done by JVM
	
	Object obj2 = "optimum";
	String str2 = (String) obj2;		// down casting down by programmer 
	
	// auto boxing and un boxing
	int iVariable = 500;
	Integer iReference = iVariable; 	// auto boxing done by JVM
	
	Double dReference = 40.50;
	double dVariable = dReference;		// un boxing done by JVM
	
	public static void main(String[] args) {
		
	}

}
