class  BowlerStatistics 
{
	String bowlerName;
	int wickets ,matches,ballsBowled ,runsConceded;

	public void SetbowlerName(String bowlerName){
		this.bowlerName = bowlerName;
	}
	public void Setwickets(int wickets){
		this.wickets = wickets;
	}
	public void Setmatches(int matches){
		this.matches = matches;
	}
	public void SetballsBowled(int ballsBowled){
		this.ballsBowled = ballsBowled;
	}
	public void SetrunsConceded(int runsConceded){
		this.runsConceded = runsConceded;
	}

	public void computeBowlingAverage(){
		if ( matches ==0 )
		{
			if (ballsBowled > 0  || runsConceded > 0 )
			{
				System.out.println("ERROr!! Player didn't play any matches!!!");
			}
			else{
			System.out.println("Player didn't play any matches!!!");}
				
		}
		else{
			System.out.println("Bowling Average is "+(double)(runsConceded / wickets ));
			
		}
	}

	public void computeStrikeRate(){
		if ( matches ==0 )
		{
			if (ballsBowled > 0  || runsConceded > 0 )
			{
				System.out.println("ERROr!!! ");
			}
			else{
			System.out.println("Player didn't play any matches!!!");}
			
		}
		else{
			System.out.println("Stricke Rate is "+(double)(runsConceded /ballsBowled));

		}
	} 

	public void  showBowlerStatistics(){
		System.out.println("Player's Name : "+bowlerName);
		System.out.println("Player's Wickets: "+wickets);
		System.out.println("Player's maches: "+matches);
		System.out.println("Player's Ball Bowled: "+ballsBowled);
		System.out.println("Player's Run Conceded: "+runsConceded);
	}
	
}
class TestBowlerStatistics
{
	public static void main(String[] args) 
	{
		BowlerStatistics b1 = new BowlerStatistics();
		b1.SetbowlerName("Ganguli");
		b1.Setwickets(200);
		b1.Setmatches(150);
		b1.SetballsBowled(3600);
		b1.SetrunsConceded(15000);
		b1.showBowlerStatistics();
		b1.computeBowlingAverage();b1.computeStrikeRate();
		
	}
}