package assignment03;

//factory
//if methods return to its interface level
//loosy couple, not depenedent on each other 

public class BusinessLogic{

	static University logic(String choice){
		
		if(choice.equals("smu")){
			
			return new SMU();
			
		}else if(choice.equals("nus")){
			
			return new NUS();
			
		}else if(choice.equals("ntu")){
			
			return new NTU();
			
		}else{
			
			return new NoData();
			
		}
		
	}
	
}
