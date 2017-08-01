package day07;

// A design pattern
// singleton design pattern. Allow user to create object one time only.
// for contacting with database, for edit/delete, you are not allowed to create objects multiple if not system slow down

class Team{
	static Team refTeam = null;
	
	// private constructor means we can't create objects of this class outside 
	private Team(){ 
		System.out.println("Hello..");
	}
	
	public static Team getCaptain(){
		if(refTeam == null){
			refTeam = new Team();
		}
		return refTeam;
	}
}

public class Example06 {

	public static void main(String[] args) {
		
		Team.getCaptain();
		Team.getCaptain();
		Team.getCaptain();
	}

}
