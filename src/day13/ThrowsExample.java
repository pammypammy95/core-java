package day13;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//**best practice to use try/catch than throws as the even small changes in method will have to go thru the exception every time
//but in cases of SQLException, FileNotFoundException, DriverException, IOException have to use throws
//throws is checked exception = compiler will force throws exception, in case of buffer reader
//throw is unchecked exception, scanner cases, best to use try/catch

class GetData{
	
	//throws will force to throw checked exception
	static void getUserData() throws IOException{ // SQLException, FileNotFoundException ... checked exceptions
		
		//in is a reference variable of an object
		//in is responsible to hold data, unprocessed/raw data
	    // sending in(raw water) thru the System(pump) to the BufferReader(reservoir)
		BufferedReader rd = new BufferedReader(new InputStreamReader(System.in)); 
		System.out.println("enter name: ");
		
		String name = rd.readLine();
		// in this case, buffer reader may fail to catch the input and store data which may happen any time
		// therefore it forces to declare throws
		// cases when SQL can't connect to DB -SQLNotFound, file corrupted- IO
		}
}// end of GetData

public class ThrowsExample {

	public static void main(String[] args) throws IOException {
		
		GetData.getUserData();

	}

}
