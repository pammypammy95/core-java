package day09;

public class StringExample01 {

	public static void main(String[] args) {
		
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		//str1 == str2 (true) 	point to heap, and goes in string constant pool
		//str1 == str3 (false)	use 'new' operator, point to heap but not in string constant pool
		
		if(str1 == str3){	
			System.out.println(true);
		}else{
			System.out.println(false);
		}
		
	}

}
