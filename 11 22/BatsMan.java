class  BatsMan
{
	static String Team="INDIA";
	String PlayerName;
	int MatchesPlayed, TotalRuns, NoOfBallsFaced;
	double StrikeRate,AverageScore;
	public void Display(){
		System.out.println("Team: "+Team); System.out.println("Name: "+PlayerName);      
		System.out.println("MatchesPlayed: "+MatchesPlayed);  System.out.println("TotalRuns:" +TotalRuns);
		System.out.println("NoOfBallsFaced: "+NoOfBallsFaced);
		System.out.println("StrikeRate: "+StrikeRate); System.out.println("AverageScore: "+AverageScore);
		
		System.out.println();

	}
	public static double calculateAverage(double runs,double matches){
		double aver=0;
		aver= runs/matches;
		return aver;
		
		
	}
	public static double strikeRate(double SRD, double NOBF){
		double SR;//Strike rate = (Runs scored / Balls faced) x 100
		SR=(SRD/NOBF)*100;
		return SR;
	}
	public static void main(String[] args) 
	{
		//INDIA    V KOHLI     113            8848         15924          55.56
		BatsMan b1 = new BatsMan();
		b1.PlayerName ="V KOHLI";
		b1.MatchesPlayed = 113;
		b1.TotalRuns = 8848;
		b1.NoOfBallsFaced = 15924;
		b1.StrikeRate = strikeRate(b1.TotalRuns,b1.NoOfBallsFaced );
		b1.AverageScore = calculateAverage(b1.TotalRuns,b1.MatchesPlayed);
		b1.Display();
	}
}
