package abc1;

public class Demo01 {
	//no access modifier, will be set as default instead.
	//default access within the class, not outside
	//protect access within he class, and outside condition there is inheritance
	
	public void show1(){
		// show01() can be access from within the class, outside the class, 
		// within the package abc01, outside the package abc01
		
	} // end of show01
	
	void show2(){
		// show02() can be access from within the class, outside the class,
		// only within the package abc01
		
	} // end of show02
	
	protected void show3(){
		// show01() can be access from within the class, outside the class, 
		// within the package abc01, outside the package abc01***
		// *** condition apply
		// class calling this method, must extend this class
				
		
	} // end of show03
	
	private void show4(){
		// show4() can be access from within the class only.
	}
	
	void access1(){
		// all the methods we can access within the class
		show1();
		show2();
		show3();
		show4();
	}
	
} // end of demo01
