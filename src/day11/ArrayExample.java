package day11;

class UserData{
	void showData(Object ref[]){
		
		for(Object obj : ref){
			System.out.println(obj);
		}
		
	}
} // end of UserData

public class ArrayExample {

	public static void main(String[] args) {
		
		//array: a fixed length of size with any data type
		//start with 0
		//to retrieve, use for-each loop for normal loop
		//advantage for-each loop
		//condition checking is done internally
		
		UserData ref = new UserData();
		
		//primitive type, not an object must use wrapper class
		int iVariable[] = {3,5,7,9};
		String iString[] = {"data1", "data2", "data3"};
		
		Integer iRef[] = {3,5,7,9};
		String refString[] = {"data1", "data2", "data3"};
		
		ref.showData(refString);
		ref.showData(iRef);
		
		/*for(String temp : refString){ // get all the records from String
			System.out.println(temp);
		}
		
		for(int temp : iVariable){ // get all the records from int 
			System.out.println(temp);
		}*/
		
	}

}
