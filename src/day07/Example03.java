package day07;

class Language{
	void showLanguage(){
		System.out.println("Language ==> showLanguage");
	}
}

class English extends Language{
	void showLanguage(){
		System.out.println("English ==> showLanguage");
	}
	
	void access(){
		super.showLanguage(); // to call parent method
		this.showLanguage(); // to call current class method 
	}
}

public class Example03 {

	public static void main(String[] args) {
		new English().access();
	}

}
