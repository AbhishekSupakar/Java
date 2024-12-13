class Batter  
{
	String name;
	int runs;
	int matches;
	float batting_avg;
	public Batter(String name,int runs,int matches){
		this.name = name;
		this.runs = runs;
		this.matches = matches;
	}
	public void  computeBattingAverage(){
		if (runs < 0 || matches < 0)
		{
			System.out.println("Error!!!");
		}
		else if (runs > 0 && matches == 0)
		{
			System.out.println("Error!!!");
		}
		else{
			batting_avg =(float) runs / matches;
			System.out.println("Name of the player: "+name);
			System.out.println("Batting average: "+batting_avg);
		}
	}
	public void getStatistics(String name,int runs,int matches){
		boolean count1 = true;
		boolean count2 = true;
		if (name.isEmpty())
		{
			System.out.println("Error: Name cannot be empty.");
			count1 = false;
		}
		if (runs < 0 || matches < 0 || runs > 0 && matches == 0 )
		{
			System.out.println("Error:Runs and matches must be non-negative.");
			count1 = false;
		}
		if (count1 && count2)
		{
			System.out.println("Name of the player: "+name);
			System.out.println("Runs: "+runs);
			System.out.println("Matches: "+matches);
		}
	}
}
