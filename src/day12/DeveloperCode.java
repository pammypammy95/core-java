package day12;

// Programmer or Developer writes this class
// also as a source code
public class DeveloperCode {

	public static void myLogic(){
		
		//purpose of exception handling :preserve our data, to save your data from loosing
		// need to handle exception, so to handle data properly, data will not be lose
		
		//if there is not exception in try, no catch.
		// finally will always run 
		//purpose of finally: to close all the files, socket, drivers
		
		//try is a block where you write a code
		//if logic has exception, catch will handle that 
		
		try { // try is for writing your logic
			
			System.out.println(10/0);
			
		} 
		
		// no statement in between try and catch
		
		catch (Exception e) { // catch is for handle the exception 
			System.out.println("number can't be devided by 0..");
		}
		
		finally{ // finally executes to close all opened files
			System.out.println("closing files.. ");
			System.out.println("closing sockets..");
			System.out.println("closing drivers.. ");
			
		}
		
		//logical error
		//System.out.println(10/0);
		
	} // end of myLogic
	
} // end of DeveloprCode
