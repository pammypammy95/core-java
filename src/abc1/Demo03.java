package abc1;

public class Demo03 {

	void access1(){
		// show4() cannot be access since its private
		
		Demo01 ref = new Demo01();
		ref.show1();
		ref.show2();
		ref.show3();
		//ref.show4();
	}
	
}
