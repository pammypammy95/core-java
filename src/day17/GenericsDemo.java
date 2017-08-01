package day17;

//create generic interface
//bank class behave like list interface
//list interface is a collection framework
interface Bank<Singapore>{ // here Singapore is considered as Type<T>
	void bankInfo(Singapore ref); // ref is a local variable of Singapore Type
} // end of interface

// create a generic class
//DBS act as arraylist
//arraylist is an implemented class of list interface
//can pass any type in arraylist eg. wrapper class
class DBS<IBanking> implements Bank<IBanking>{ // IBanking is again Type<T>

	@Override
	public void bankInfo(IBanking ref) { // act as an add(Object ref) method
		System.out.println(ref);
	}
	
}

public class GenericsDemo {

	public static void main(String[] args) {
		Integer iRef = 12345;
		DBS<Integer> ref1 = new DBS<Integer>();
		ref1.bankInfo(iRef);
	
		String str = "java";
		DBS<String> ref2 = new DBS<String>();
		ref2.bankInfo(str);
	
		Double dRef = 20.45;
		DBS<Double> ref3 = new DBS<Double>();
		ref3.bankInfo(dRef);
		
		Person pRef = new Person();
		pRef.setName("Nicholas");
		
		DBS<Person> ref4 = new DBS<Person>();
		ref4.bankInfo(pRef);
	}

}
