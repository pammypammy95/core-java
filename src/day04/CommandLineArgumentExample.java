package day04;

public class CommandLineArgumentExample {

	public static void main(String[] malvin) {
		
		String temp[] = malvin;
		//System.out.println(temp[0]);
	
			switch(temp[0]){
			
				case "japan":
					System.out.println("Welcome to " + temp[0]);
					break;
					
				case "usa":
					System.out.println("Welcome to " + temp[0]);
					break;
					
				case "singapore":
					System.out.println("Welcome to " + temp[0]);
					break;
					
				default:
					System.out.println("Sorry!!!");
					break;
			}
			
			/*
			if(temp[0].equals("japan")){
				
				System.out.println("Welcome to " + temp[0]);
				
			}else if(temp[0].equals("usa")){
				
				System.out.println("Welcome to " + temp[0]);
				
			}else{
				
				System.out.println("Welcome to " + temp[0]);
				
			}
			*/
		
	}

}
