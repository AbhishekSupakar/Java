class Sports  
{
	private String sportsname;
	private int teamSize;
	private String sportType;
	Sports(){
		this.sportsname = sportsname;
		this.teamSize = teamSize;
		this.sportType = sportType;
	}
	Sports(String sportsname,int teamSize){
		if (sportsname.isEmpty())
		{
			System.out.println("Error Sports Name should not be empty");
			this.sportsname = sportsname;
		}
		else{
			this.sportsname = sportsname;
		}
		this.sportsname = sportsname;
		if (teamSize > 0)
		{
			this.teamSize = teamSize;
		}
		else{
			this.teamSize = teamSize;
			System.out.println("Error Team size must be positive.");
		}
		
	}
	Sports(String sportsname,int teamSize,String sportType){
		if (sportsname.isEmpty())
		{
			System.out.println("Error Sports Name should not be empty");
			this.sportsname = sportsname;
		}
		else{
			this.sportsname = sportsname;
		}
		this.sportsname = sportsname;
		if (teamSize > 0)
		{
			this.teamSize = teamSize;
		}
		else{
			this.teamSize = teamSize;
			System.out.println("Error Team size must be positive.");
		}
		if (sportType.isEmpty())
		{
			System.out.println("Error Sports type should not be empty");
			this.sportType = sportType;

		}
		else{
			this.sportType = sportType;
		}
		
	}
	public void dispalyinfo(){
		System.out.println("Sport Name: "+sportsname);
		System.out.println("Team Size: "+teamSize);
		System.out.println("Sport Type: "+sportType);
	}
	
}

class Team
{
	public static void main(String[] args) 
	{
		
		Sports t1 = new Sports();
		t1.dispalyinfo();
		System.out.println();
		Sports t2 = new Sports("Football",11);
		t2.dispalyinfo();
		System.out.println();
		Sports t3 = new Sports("Cricket",11,"Outdoor");
		t3.dispalyinfo();
		System.out.println();
		Sports t4 = new Sports("",11,"Outdoor");
		t4.dispalyinfo();
		System.out.println();
		Sports t5 = new Sports("Football",-11);
		t5.dispalyinfo();
		System.out.println();
	}
}
