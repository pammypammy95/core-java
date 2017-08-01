package abc2;

import abc1.Demo01;

public class Demo03 extends Demo01{

	void access1(){
		// show2(), show4() cannot be access since its default and private
		
		//Demo01 ref = new Demo01();
		//ref.show1();
		//ref.show2();
		
		show3();
		//ref.show4();
	}
	
}

