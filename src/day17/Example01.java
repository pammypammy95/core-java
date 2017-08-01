package day17;

public class Example01 {

	public static void main(String[] args) {
		String str = "asd";
		String newStr = "";
		int length = str.length();
		for(int i = (length - 1); i >= 0; i--){
			newStr += str.charAt(i);
		}
		System.out.println(newStr);
	}

}
